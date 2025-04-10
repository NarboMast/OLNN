package org.example.olnn.services;

import org.example.olnn.repositories.RawDataRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FileService {
    private static final String DELIMITER = ",";

    @Value("${words}")
    private String filename;
    private final RawDataRepository rawDataRepository;

    public FileService(RawDataRepository rawDataRepository) {
        this.rawDataRepository = rawDataRepository;
    }

    public void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line = br.readLine();
            String[] values;
            while ((line = br.readLine()) != null) {
                values = line.split(DELIMITER);
                rawDataRepository.addData(values);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//
//    public double[] findFrequency(String str) {
//
//    }

    public void display() {
        rawDataRepository.getRawData().forEach(s -> System.out.println(Arrays.toString(s)));
    }
}
