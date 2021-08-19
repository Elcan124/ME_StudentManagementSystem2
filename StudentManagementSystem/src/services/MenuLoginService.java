/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.Config;
import java.util.Scanner;
import menu.service.interfaces.MenuLoginServiceInterface;

/**
 *
 * @author elcan
 */
public class MenuLoginService implements MenuLoginServiceInterface {
    
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String username = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String password = sc.nextLine();
        if (!(username.equals("user") && password.equals("12345"))) {
            throw new IllegalArgumentException("username or password is invalid");
        }
        Config.setLoggedIn(true);
        
    }
    
}
