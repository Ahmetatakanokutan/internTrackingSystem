package com.example.traineeSystem.controller;

import com.example.traineeSystem.business.abstracts.TraineeService;
import com.example.traineeSystem.entities.Trainee;
import com.example.traineeSystem.entities.dtos.TraineeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/trainees")
@AllArgsConstructor
public class TraineeController {
    private final TraineeService traineeService;

    @GetMapping
    ResponseEntity<List<Trainee>> getAll(){
        return new ResponseEntity<>(traineeService.getAll() , HttpStatus.OK);
    }
    @GetMapping("{id}")
    ResponseEntity<Trainee> getById(@PathVariable("id") int id){
        return new ResponseEntity<>(traineeService.getById(id) , HttpStatus.OK);
    }
    @PutMapping
    ResponseEntity<Trainee> update(TraineeDto traineeDto){
        return new ResponseEntity<>(traineeService.update(traineeDto) , HttpStatus.OK);
    }
    @DeleteMapping
    ResponseEntity<Trainee> delete(int id){
        return new ResponseEntity<>(traineeService.delete(id) , HttpStatus.OK);
    }
    @PostMapping
    ResponseEntity<Trainee> create(Trainee trainee){
        return new ResponseEntity<>(traineeService.create(trainee) , HttpStatus.OK);
    }
    @PostMapping("{traineeId}/team/{teamId}")
    ResponseEntity<Trainee> addTeamToTrainee(@PathVariable("teamId") int teamId ,@PathVariable("traineeId") int traineeId){
        return new ResponseEntity<>(traineeService.addTeamToTrainee(teamId , traineeId) , HttpStatus.OK);
    }
}
