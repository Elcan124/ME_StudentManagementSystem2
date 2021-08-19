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
public class Teacher extends Person{
    private String schoolName;
    private double salary;
    private Student [] students ;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Teacher Name : " +name + "\n"+ "Teacher Surname : " + surName+"\n" + "Teacher Age : "+ age+"\n" 
         +"Teacher Schoolname : "+ schoolName + "\n" + "Theacher Salary : "+salary +"\n"+ "Teacher Students : "+ students;       
    }


    
    
}
