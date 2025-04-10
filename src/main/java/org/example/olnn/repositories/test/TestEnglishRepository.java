package org.example.olnn.repositories.test;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestEnglishRepository {
    private final List<Double> englishList;

    public TestEnglishRepository(List<Double> englishList) {
        this.englishList = englishList;
    }

    public void addWord(double par) {
        englishList.add(par);
    }

    public List<Double> getTestEnglishList() {
        return englishList;
    }
}

