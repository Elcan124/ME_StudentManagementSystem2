/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.*;
import javax.management.RuntimeErrorException;

/**
 *
 * @author elcan
 */
public class ObjectReaderandWriter {
    
    public static Object readFileDeseriliaze(String name) throws Exception{
        Object obj  = null;
       try( FileInputStream file = new FileInputStream(name);
        ObjectInputStream in = new ObjectInputStream(file);){
          obj = in.readObject(); 
       }
       finally{
           return obj;
       }
        
        
    }
    
    
    
    public static void ObjectWriteToFile(Serializable object , String name) throws Exception{
     try(FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos  = new ObjectOutputStream(fos);)
     { oos.writeObject(object); } 
     catch(Exception ex){
         throw new RuntimeException(ex);
     }
       
    }
    
}
