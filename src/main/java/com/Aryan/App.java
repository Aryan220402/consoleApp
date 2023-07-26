package com.Aryan;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        student stu=new student();
        stu.setName("abhay");
        stu.setEmail("abhay__cs20@gla.ac.in");

        studentDao studentdao=StudentDaoFactory.getStudentdao();
        studentdao.addStudent(stu);
    }
}
