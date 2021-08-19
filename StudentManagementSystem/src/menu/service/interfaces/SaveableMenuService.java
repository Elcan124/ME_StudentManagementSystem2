/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service.interfaces;

import bean.Config;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcan
 */
public interface SaveableMenuService extends MenuServices {
     @Override
     public default  void process() {
        processLogic();
         try {
             Config.save();
            
         } catch (Exception ex) {
             Logger.getLogger(SaveableMenuService.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }
}
