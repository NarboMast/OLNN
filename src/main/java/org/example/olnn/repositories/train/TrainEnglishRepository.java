package org.example.olnn.repositories.train;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainEnglishRepository {
    private final List<Double> englishList;

    public TrainEnglishRepository(List<Double> englishList) {
        this.englishList = englishList;
    }

    public void addWord(double par){
        englishList.add(par);
    }

    public List<Double> getTrainEnglishList() {
        return englishList;
    }
}
