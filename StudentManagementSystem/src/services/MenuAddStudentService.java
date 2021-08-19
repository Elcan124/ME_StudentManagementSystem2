/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menu.service.interfaces.MenuAddStudentServiceInterface;
import util.ObjectReaderandWriter;
import util.Util;

/**
 *
 * @author elcan
 */
public class MenuAddStudentService implements MenuAddStudentServiceInterface {

    @Override
    public void processLogic(){

        
          String name  = Util.getString("Student name");
          String surname  = Util.getString("Student surname");
          int age = Util.getInt("Student age");
          String schoolName = Util.getString("Student Schollname");
          Double scholarship = Util.getDouble("Student scholarship $");
          Student s = new Student();
          s.setName(name);
          s.setSurName(surname);
          s.setAge(age);
          s.setSchoolName(schoolName);
          s.setScholarship(scholarship);
          
          Config.instance().appendStudent(s);
                  System.out.println("Student added");
  
            
        
      
        
  }
    
    
}
