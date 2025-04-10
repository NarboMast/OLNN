package org.example.olnn.services;

import org.example.olnn.repositories.TestDataRepository;
import org.example.olnn.repositories.TrainDataRepository;
import org.springframework.stereotype.Service;

@Service
public class PrepareData {
    private final TrainDataRepository trainDataRepository;
    private final TestDataRepository testDataRepository;

    public PrepareData(TrainDataRepository trainDataRepository, TestDataRepository testDataRepository) {
        this.trainDataRepository = trainDataRepository;
        this.testDataRepository = testDataRepository;
    }
}
