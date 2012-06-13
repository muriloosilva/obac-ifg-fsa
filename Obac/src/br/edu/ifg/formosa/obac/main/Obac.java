
package br.edu.ifg.formosa.obac.main;

import java.applet.Applet;


public class Obac extends Applet{

   
    public void init() {
    	
    	try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                	//initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
