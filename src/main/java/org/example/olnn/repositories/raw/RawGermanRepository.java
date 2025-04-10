package org.example.olnn.repositories.raw;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RawGermanRepository {
    private final List<String> germanList;

    public RawGermanRepository(List<String> germanList) {
        this.germanList = germanList;
    }

    public void addWord(String word) {
        germanList.add(word);
    }

    public List<String> getGermanList() {
        return germanList;
    }
}
