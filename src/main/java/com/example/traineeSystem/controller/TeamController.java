package com.example.traineeSystem.controller;

import com.example.traineeSystem.business.abstracts.TeamService;
import com.example.traineeSystem.entities.Team;
import com.example.traineeSystem.entities.dtos.TeamDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teams")
@AllArgsConstructor
public class TeamController {
    private final TeamService teamService;

    @GetMapping()
    ResponseEntity<List<Team>> getAll(){

        return new ResponseEntity<>(teamService.getAll() , HttpStatus.OK);
    }
    @GetMapping("{id}")
    ResponseEntity<Team> getById(@PathVariable("id") int id){
        return new ResponseEntity<>(teamService.getById(id) , HttpStatus.OK);
    }
    @PutMapping
    ResponseEntity<Team> update(@RequestBody TeamDto teamDto){
        return new ResponseEntity<>(teamService.update(teamDto) , HttpStatus.OK);
    }
    @DeleteMapping
    ResponseEntity<Team> delete(int id){
        return new ResponseEntity<>(teamService.delete(id) , HttpStatus.OK);
    }
    @PostMapping
    ResponseEntity<Team> create(Team team){
        return new ResponseEntity<>(teamService.create(team) , HttpStatus.OK);
    }
}
