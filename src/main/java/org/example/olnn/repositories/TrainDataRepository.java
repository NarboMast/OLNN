package org.example.olnn.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainDataRepository {
    private final List<double[]> trainData;

    public TrainDataRepository(List<double[]> trainData) {
        this.trainData = trainData;
    }

    public void addData(double[] data) {
        trainData.add(data);
    }

    public List<double[]> getTrainData() {
        return trainData;
    }
}
