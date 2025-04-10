package org.example.olnn.repositories.test;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestPolishRepository {
    private final List<Double> polishList;

    public TestPolishRepository(List<Double> polishList) {
        this.polishList = polishList;
    }

    public void addWord(double par) {
        polishList.add(par);
    }

    public List<Double> getTestPolishList() {
        return polishList;
    }
}
