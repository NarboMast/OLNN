package org.example.olnn.repositories.train;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainGermanRepository {
    private final List<Double> germanList;

    public TrainGermanRepository(List<Double> germanList) {
        this.germanList = germanList;
    }

    public void addWord(double par) {
        germanList.add(par);
    }

    public List<Double> getTrainGermanList() {
        return germanList;
    }
}
