package com.example.traineeSystem.business.abstracts;

import com.example.traineeSystem.entities.Trainee;
import com.example.traineeSystem.entities.dtos.TraineeDto;

import java.util.List;

public interface TraineeService {

    List<Trainee> getAll();
    Trainee getById(int id);
    Trainee update(TraineeDto traineeDto);
    Trainee delete(int id);
    Trainee create(Trainee trainee);
    Trainee addTeamToTrainee(int teamId , int traineeId);
}
