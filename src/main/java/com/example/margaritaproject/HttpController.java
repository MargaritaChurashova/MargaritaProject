package com.example.margaritaproject;

import org.springframework.web.bind.annotation.*;

import com.example.margaritaproject.data.*;

import java.util.Comparator;

import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
public class HttpController {
    Database db;


    public HttpController(Database db) {
        this.db = db;
    }

    List<University> getUniversities() {
        return db.getUniversities();
    }

    @GetMapping(value = "/get_universities", produces = "application/json")
    List<University> getNearUniversityByField(int value) {
        return getUniversities().stream().sorted(
                Comparator.comparingInt((University it) -> Math.abs(it.getRating() - value))).toList().subList(0, 5);
    }


}
