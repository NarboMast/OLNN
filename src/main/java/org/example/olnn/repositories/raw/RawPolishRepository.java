package org.example.olnn.repositories.raw;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RawPolishRepository {
    private final List<String> polishList;

    public RawPolishRepository(List<String> polishList) {
        this.polishList = polishList;
    }

    public void addWord(String word) {
        polishList.add(word);
    }

    public List<String> getPolishList() {
        return polishList;
    }
}
