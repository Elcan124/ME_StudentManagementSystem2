/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Config;
import bean.Teacher;
import java.util.ArrayList;
import menu.service.interfaces.MenuShowAllTeacherInterface;

/**
 *
 * @author elcan
 */
public class MenuShowAllTeacherService implements MenuShowAllTeacherInterface {

    @Override
    public void processLogic() {
        ArrayList<Teacher>  allT = Config.instance().getTeachers();
        
        
        
        for (int i = 0; i < allT.size(); i++) {
            System.out.println((i+1)+".Teacher");
            System.out.println(allT.get(i));
       
                    
        }
        
  }
    
}
