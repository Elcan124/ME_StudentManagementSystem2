/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import util.ObjectReaderandWriter;

/**
 *
 * @author elcan
 */
public class Config implements Serializable {

    private static Config config = null;
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static boolean loggedIn;
private static final String fileName = "obj.obj";
    public static void initialize() throws Exception {
        Object obj = ObjectReaderandWriter.readFileDeseriliaze("fileName");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }

    }
public static void save() throws Exception{
    ObjectReaderandWriter.ObjectWriteToFile(Config.instance(),"fileName");
}
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        Config.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        Config.teachers = teachers;
    }

    public static Config instance() {
        if (config == null) {
            return new Config();
        } else {
            return config;
        }
    }

    public void appendStudent(Student s) {
        students.add(s);
    }

    public void appendTeacher(Teacher t) {
        teachers.add(t);

    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

}
