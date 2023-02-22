package com.example.traineeSystem.entities;

import com.example.traineeSystem.entities.enums.CandidateStatus;
import com.example.traineeSystem.entities.enums.InternPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Nullable
    private String name;

    @Nullable
    private String surName;

    @Nullable
    private String startTime;

    @Nullable
    private String endTime;

    @Nullable
    @ManyToOne()
    @JoinColumn(name="teamId")
    private Team team;

    @Nullable
    private String traineeManager;

    @Nullable
    private long phoneNumber;

    @Nullable
    private String mailAddress;

    @Nullable
    private InternPlace internPlace;

    @Nullable
    private String reference;

    @Nullable
    private CandidateStatus candidateStatus = CandidateStatus.Waiting;

}
