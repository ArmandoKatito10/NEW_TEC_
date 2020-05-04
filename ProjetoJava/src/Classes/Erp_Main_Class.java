package Classes;

import View.FrmLogin;
import View.Home;

/**
 *
 * @author Armando Katito
 */
public class Erp_Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmLogin Login = new FrmLogin();
        Login.setVisible(true);
        Login.setLocationRelativeTo(null);
        Home Menu = new Home();
        Menu.setLocationRelativeTo(null);
        //FrmHome menu = new FrmHome();
        //menu.setLocationRelativeTo(null);
        
    
    }

}
