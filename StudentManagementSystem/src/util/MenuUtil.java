
package util;

import java.util.Scanner;

/**
 *
 * @author elcan
 */
public class MenuUtil {
    public static void showMenu() throws Exception{
         System.out.println("Please select menu:");
       Menu.showAllMenu();
        Scanner sc  = new Scanner(System.in);
       
        int selectedMenuNumber = sc.nextInt();
         Menu SelectedMenu =    Menu.find(selectedMenuNumber);
        SelectedMenu.process();
    }
    public static void processMenu(Menu menu) throws Exception{
       menu.process();
    }
   
}
