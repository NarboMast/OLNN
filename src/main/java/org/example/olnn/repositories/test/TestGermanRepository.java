package org.example.olnn.repositories.test;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestGermanRepository {
    private final List<Double> germanList;

    public TestGermanRepository(List<Double> germanList) {
        this.germanList = germanList;
    }

    public void addWord(double par) {
        germanList.add(par);
    }

    public List<Double> getTestGermanList() {
        return germanList;
    }
}

