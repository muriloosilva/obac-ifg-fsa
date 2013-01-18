package br.edu.ifg.formosa.obac.main;

import br.edu.ifg.formosa.obac.controls.ConfigurationControl;
import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Object;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.view.EnvironmentView;
import br.edu.ifg.formosa.obac.view.ObjectView;
import br.edu.ifg.formosa.obac.view.ScaleView;
import br.edu.ifg.formosa.obac.view.SurfaceView;


public class InterfaceBuilder {
	
	
	public InterfaceBuilder(Obac obac){
		
		ConfigurationView configurationView = new ConfigurationView();
		Object objeto = new Object();
		Surface surface = new Surface();
		
		//ObjectView objectView = new ObjectView();
		ScaleView scaleView = new ScaleView();
		SurfaceView surfaceView = new SurfaceView(scaleView);
		
		Environment environment = new Environment();
		environment.setObjeto(objeto);
		environment.setSurface(surface);
		EnvironmentView environmentView = new EnvironmentView(scaleView, surfaceView); 
		
		
		obac.add(configurationView);
		obac.add(environmentView);	
		
		new ConfigurationControl(obac, configurationView, environment, scaleView, surfaceView, environmentView);
	}

}
