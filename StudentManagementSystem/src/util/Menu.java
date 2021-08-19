/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import services.MenuLoginService;
import menu.service.interfaces.MenuServices;
import services.MenuAddStudentService;
import services.MenuAddTeacherService;
import services.MenuRegisterService;
import services.MenuShowAllStudentService;
import services.MenuShowAllTeacherService;

/**
 *
 * @author elcan
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add Student", new MenuAddStudentService()),
    SHOW_ALL_STUDENT(5, "Show all students", new MenuShowAllStudentService()),
    SHOW_ALL_TEACHER(6, "Show all teachers", new MenuShowAllTeacherService()),
    UNKNOWN;

    private Menu() {
    }

    private String label;
    private MenuServices service;
    private int number;

    Menu(int number, String label, MenuServices service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() throws Exception {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if(!(Config.isLoggedIn()))
                    System.out.println(menus[i]);
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }

            }
        }
    }
}
