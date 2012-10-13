package br.edu.ifg.formosa.obac.main;

import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.EnvironmentView;


public class InterfaceBuilder {
	
	
	
	public InterfaceBuilder(Obac obac){
		
		obac.add(new ConfigurationView());
		obac.add(new EnvironmentView());
		
//		obac.setLayout(new java.awt.BorderLayout());
//		obac.add(new GravityView(), java.awt.BorderLayout.CENTER);
//		obac.add(new FrictionView(), java.awt.BorderLayout.EAST);
		    
		
	}

}
