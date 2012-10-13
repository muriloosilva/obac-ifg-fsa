
package br.edu.ifg.formosa.obac.main;

import java.applet.Applet;



public class Obac extends Applet{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
    	
    	try {
             java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                	new InterfaceBuilder(Obac.this);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
