package org.example.olnn.repositories.raw;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RawEnglishRepository {
    private final List<String> englishList;

    public RawEnglishRepository(List<String> englishList){
        this.englishList = englishList;
    }

    public void addWord(String word){
        englishList.add(word);
    }

    public List<String> getEnglishList() {
        return englishList;
    }
}
