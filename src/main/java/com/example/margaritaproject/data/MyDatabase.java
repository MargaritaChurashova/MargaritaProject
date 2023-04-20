package com.example.margaritaproject.data;

import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MyDatabase implements Database {

    private static final String URL = "jdbc:mariadb://84.38.180.131:3306/elya_db";
    private static final String USER = "elya";
    private static final String PASSWORD = "123";

    @Override
    public List<University> getUniversities() {
        List<University> res = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(
                URL,
                USER, PASSWORD
        )) {
            PreparedStatement statement = conn.prepareStatement("""  
                    select * from univers""");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String faculty = rs.getString("faculty");
                String programm = rs.getString("programm");
                String ege = rs.getString("ege");
                int rating = rs.getInt("rating");
                University university = new University(programm, faculty,ege,rating);
                university.setId(id);
                res.add(university);
            }

        } catch (SQLException e) {
            System.err.println("SQL request was failed " + e.getMessage());
            e.printStackTrace();
        }
        return res;

    }


}
