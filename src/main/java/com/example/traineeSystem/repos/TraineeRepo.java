package com.example.traineeSystem.repos;

import com.example.traineeSystem.entities.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraineeRepo extends JpaRepository<Trainee , Integer> {
}
