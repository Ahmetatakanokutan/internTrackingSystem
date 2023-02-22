package com.example.traineeSystem.entities;

import com.example.traineeSystem.entities.enums.TeamNames;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int teamId;

    @Nullable
    private TeamNames name;

    @OneToMany(mappedBy="team")
    private List<Trainee> trainees;
}
