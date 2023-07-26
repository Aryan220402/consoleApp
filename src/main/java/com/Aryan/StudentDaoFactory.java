package com.Aryan;

public class StudentDaoFactory {
    public static studentDao studentdao=null;
    private StudentDaoFactory(){

    }
    public static studentDao getStudentdao(){
        if(studentdao==null){
            studentdao=new studentDaoImpl();
        }
        return studentdao;
    }
}
