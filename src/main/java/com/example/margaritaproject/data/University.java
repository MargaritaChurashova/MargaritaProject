package com.example.margaritaproject.data;

public class University extends DatabaseObject {

    private String programm;
    private String faculty;
    private String ege;
    private int rating;



    public University(String programm, String faculty, String ege, int rating) {
        this.programm = programm;
        this.faculty = faculty;
        this.ege = ege;
        this.rating = rating;
    }

    public String getProgramm() {
        return programm;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getEge() {
        return ege;
    }

    public int getRating() {
        return rating;
    }

    public void setProgramm(String programm) {
        this.programm = programm;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setEge(String ege) {
        this.ege = ege;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
