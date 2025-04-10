package org.example.olnn.services;

import org.example.olnn.repositories.raw.RawEnglishRepository;
import org.example.olnn.repositories.raw.RawGermanRepository;
import org.example.olnn.repositories.raw.RawPolishRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class FileService {
    private static final String DELIMITER = ",";

    @Value("${iris}")
    private String filename;
    private final RawEnglishRepository rawEnglishRepository;
    private final RawPolishRepository rawPolishRepository;
    private final RawGermanRepository rawGermanRepository;

    public FileService(RawEnglishRepository rawEnglishRepository, RawPolishRepository rawPolishRepository, RawGermanRepository rawGermanRepository) {
        this.rawEnglishRepository = rawEnglishRepository;
        this.rawPolishRepository = rawPolishRepository;
        this.rawGermanRepository = rawGermanRepository;
    }

    public void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line = br.readLine();
            String[] values;
            while ((line = br.readLine()) != null) {
                values = line.split(DELIMITER);
                rawEnglishRepository.addWord(values[0]);
                rawGermanRepository.addWord(values[1]);
                rawPolishRepository.addWord(values[2]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
