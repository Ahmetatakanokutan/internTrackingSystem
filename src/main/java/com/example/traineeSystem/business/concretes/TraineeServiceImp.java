package com.example.traineeSystem.business.concretes;

import com.example.traineeSystem.business.abstracts.TraineeService;
import com.example.traineeSystem.entities.Trainee;
import com.example.traineeSystem.entities.dtos.TraineeDto;
import com.example.traineeSystem.repos.TeamRepo;
import com.example.traineeSystem.repos.TraineeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImp implements TraineeService {

    private final TraineeRepo traineeRepo;
    private final TeamRepo teamRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public TraineeServiceImp(TraineeRepo traineeRepo, TeamRepo teamRepo) {
        this.traineeRepo = traineeRepo;
        this.teamRepo = teamRepo;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public List<Trainee> getAll() {
        return traineeRepo.findAll();
    }

    @Override
    public Trainee getById(int id) {
        return traineeRepo.getById(id);
    }

    @Override
    public Trainee update(TraineeDto traineeDto) {
        Trainee currentTrainee = traineeRepo.getById(traineeDto.getId());
        Trainee trainee = modelMapper.map(traineeDto , Trainee.class);
        trainee.setTeam(currentTrainee.getTeam());
        traineeRepo.save(trainee);
        return null;
    }

    @Override
    public Trainee delete(int id) {
        traineeRepo.delete(traineeRepo.getById(id));
        return null;
    }

    @Override
    public Trainee create(Trainee trainee) {
        traineeRepo.save(trainee);
        return null;
    }

    @Override
    public Trainee addTeamToTrainee(int teamId, int traineeId) {
        Trainee trainee = traineeRepo.getById(traineeId);
        trainee.setTeam(teamRepo.getById(teamId));
        traineeRepo.save(trainee);
        return null;
    }

}
