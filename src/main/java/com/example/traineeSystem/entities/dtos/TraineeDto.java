package com.example.traineeSystem.entities.dtos;

import com.example.traineeSystem.entities.enums.CandidateStatus;
import com.example.traineeSystem.entities.enums.InternPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraineeDto {
    private int id;

    private String name;

    private String surName;

    private long startTime;

    private long endTime;

    private String traineeManager;

    private long phoneNumber;

    private String mailAddress;

    private InternPlace internPlace;

    private String reference;

    private CandidateStatus candidateStatus;

}
