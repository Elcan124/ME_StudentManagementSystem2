/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.logging.Level;
import java.util.logging.Logger;
import menu.service.interfaces.MenuAddTeacherServiceInterface;
import util.Util;

/**
 *
 * @author elcan
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInterface {

    @Override
    public void processLogic(){
        
         String name  = Util.getString("Teacher name");
          String surname  = Util.getString("Teacher surname");
          int age = Util.getInt("Teacher age");
          String schoolName = Util.getString("Teacher Schollname");
          Double salary = Util.getDouble("Teacher salary $");
         Teacher t = new Teacher();
          t.setName(name);
          t.setSurName(surname);
          t.setAge(age);
          t.setSalary(salary);
          t.setSchoolName(schoolName);
          
          Config.instance().appendTeacher(t);
      
        System.out.println("Teacher added");

     
 }
    
    
    
}
