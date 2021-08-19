/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author elcan
 */
public class Student extends Person {
    private String schoolName;
    private double scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return  "Student Name : " +name + "\n"+ "Student Surname : " + surName+"\n" + "Student Age : "+ age+"\n" 
         +"Student Schoolname : "+ schoolName + "\n" + "Student Scholarship : "+scholarship ; 
    }
    
    
}
