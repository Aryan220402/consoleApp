package com.Aryan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class studentDaoImpl  implements studentDao{
    Connection connection;

    public studentDaoImpl() {
        connection=connection_factory.getConnection();
    }

    public void addStudent(student newStudent) throws SQLException {
        String Insert_Query="INSERT INTO employe(name,email) VALUES(?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(Insert_Query);
        preparedStatement.setString(1,newStudent.getName());
        preparedStatement.setString(2,newStudent.getEmail());
        int count=preparedStatement.executeUpdate();
        if(count>0){
            System.out.println("Student Record Saved");
        }else{
            System.out.println("Oops! Something Went Wrong!!");
        }
    }

    public void updateStudent(student updateStudent) {

    }

    public void deleteStudent(int id) {

    }

    public List<student> getstudent() {
        return null;
    }

    public student getstudentById(int id) {
        return null;
    }
}
