package com.example.margaritaproject.data;
//создаем абстракный класс, который получает из базы данных id строки
public abstract class DatabaseObject {

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
