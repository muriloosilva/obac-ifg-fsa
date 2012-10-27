package br.edu.ifg.formosa.obac.main;

import br.edu.ifg.formosa.obac.controls.ConfigurationControl;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Object;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.EnvironmentView;
import br.edu.ifg.formosa.obac.view.ObjectView;


public class InterfaceBuilder {
	
	
	
	public InterfaceBuilder(Obac obac){
		
		ConfigurationView configurationView = new ConfigurationView();
		Object objeto = new Object();
		Surface surface = new Surface();
		ObjectView objectView = new ObjectView();
		Environment environment = new Environment();
		environment.setObjeto(objeto);
		environment.setSurface(surface);
		new ConfigurationControl(obac, configurationView, environment, objectView);
		
		
		obac.add(configurationView);
		obac.add(new EnvironmentView(objectView));
		
//		obac.setLayout(new java.awt.BorderLayout());
//		obac.add(new GravityView(), java.awt.BorderLayout.CENTER);
//		obac.add(new FrictionView(), java.awt.BorderLayout.EAST);
		    
		
	}

}
