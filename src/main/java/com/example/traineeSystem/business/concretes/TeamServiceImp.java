package com.example.traineeSystem.business.concretes;

import com.example.traineeSystem.business.abstracts.TeamService;
import com.example.traineeSystem.entities.Team;
import com.example.traineeSystem.entities.Trainee;
import com.example.traineeSystem.entities.dtos.TeamDto;
import com.example.traineeSystem.repos.TeamRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImp implements TeamService {

    private final ModelMapper modelMapper;
    private final TeamRepo teamRepo;

    @Autowired
    public TeamServiceImp(TeamRepo teamRepo) {
        this.modelMapper = new ModelMapper();
        this.teamRepo = teamRepo;
    }

    @Override
    public List<Team> getAll() {
       return teamRepo.findAll();
    }

    @Override
    public Team getById(int id) {
        return teamRepo.getById(id);
    }

    @Override
    public Team update(TeamDto teamDto) {
        Team team = modelMapper.map(teamDto , Team.class);
        Team currentTeam = teamRepo.getById(teamDto.getId());
        currentTeam.setName(team.getName());
        teamRepo.save(currentTeam);
        return null;
    }

    @Override
    public Team delete(int id) {
        teamRepo.delete(teamRepo.getById(id));
        return null;
    }

    @Override
    public Team create(Team team) {
        teamRepo.save(team);
        return null;
    }
}
