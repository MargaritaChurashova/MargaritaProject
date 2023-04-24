package com.example.margaritaproject.data;

import java.util.Date;
import java.util.List;
//записываем то, к чему из базы данных будем обращаться
public interface Database {
    List<University> getUniversities();



}
