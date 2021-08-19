/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Config;
import bean.Student;
import bean.Teacher;
import java.util.ArrayList;
import menu.service.interfaces.MenuShowAllStudentServiceInterface;

/**
 *
 * @author elcan
 */
public class MenuShowAllStudentService implements MenuShowAllStudentServiceInterface {

    @Override
    public void processLogic() {
        ArrayList<Student>  allStd = Config.instance().getStudents();
        
        
        
        for (int i = 0; i < allStd.size(); i++) {
            System.out.println((i+1)+".Student");
            System.out.println(allStd.get(i));
       
                    
        }
 }
    
}
