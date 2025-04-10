package org.example.olnn.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDataRepository {
    private final List<double[]> testData;

    public TestDataRepository(List<double[]> testData) {
        this.testData = testData;
    }

    public void addData(double[] data) {
        testData.add(data);
    }

    public List<double[]> getTrainData() {
        return testData;
    }
}
