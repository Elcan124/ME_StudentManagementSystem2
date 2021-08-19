/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service.interfaces;

import bean.Config;

/**
 *
 * @author elcan
 */
public interface MenuServices {
   
    public abstract void processLogic();
     public default  void process(){
        processLogic();
       
      
      
    }
}
