package br.edu.ifg.formosa.obac.main;

import br.edu.ifg.formosa.obac.controls.ConfigurationControl;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.EnvironmentView;


public class InterfaceBuilder {
	
	
	
	public InterfaceBuilder(Obac obac){
		
		ConfigurationView configurationView = new ConfigurationView();
		new ConfigurationControl(obac, configurationView);
		
		obac.add(configurationView);
		obac.add(new EnvironmentView());
		
//		obac.setLayout(new java.awt.BorderLayout());
//		obac.add(new GravityView(), java.awt.BorderLayout.CENTER);
//		obac.add(new FrictionView(), java.awt.BorderLayout.EAST);
		    
		
	}

}
