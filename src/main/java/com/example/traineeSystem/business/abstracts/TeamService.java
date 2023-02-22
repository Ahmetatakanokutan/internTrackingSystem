package com.example.traineeSystem.business.abstracts;

import com.example.traineeSystem.entities.Team;
import com.example.traineeSystem.entities.Trainee;
import com.example.traineeSystem.entities.dtos.TeamDto;
import com.example.traineeSystem.repos.TeamRepo;

import java.util.List;

public interface TeamService {
    List<Team> getAll();
    Team getById(int id);
    Team update(TeamDto teamDto);
    Team delete(int id);
    Team create(Team team);
}
