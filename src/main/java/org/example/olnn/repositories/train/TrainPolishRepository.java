package org.example.olnn.repositories.train;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainPolishRepository {
    private final List<Double> polishList;

    public TrainPolishRepository(List<Double> polishList) {
        this.polishList = polishList;
    }

    public void addWord(double par) {
        polishList.add(par);
    }

    public List<Double> getTrainPolishList() {
        return polishList;
    }
}

