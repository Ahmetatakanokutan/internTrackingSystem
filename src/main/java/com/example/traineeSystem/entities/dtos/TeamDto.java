package com.example.traineeSystem.entities.dtos;

import com.example.traineeSystem.entities.enums.TeamNames;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto {

    private int id;
    private TeamNames name;
}
