package com.Aryan;

import java.sql.SQLException;
import java.util.List;

public interface studentDao {
    void addStudent(student newStudemt) throws SQLException;
    void updateStudent(student updateStudent);
    void deleteStudent(int id);
    List<student> getstudent();
    student getstudentById(int id);
}
