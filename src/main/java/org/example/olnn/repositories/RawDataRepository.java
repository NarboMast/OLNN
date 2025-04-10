package org.example.olnn.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RawDataRepository {
    private final List<String[]> rawData;

    public RawDataRepository(List<String[]> rawData) {
        this.rawData = rawData;
    }

    public void addData(String[] rawDataString) {
        this.rawData.add(rawDataString);
    }

    public List<String[]> getRawData() {
        return rawData;
    }
}
