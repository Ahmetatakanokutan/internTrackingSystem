package com.example.traineeSystem.repos;

import com.example.traineeSystem.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team , Integer> {
}
