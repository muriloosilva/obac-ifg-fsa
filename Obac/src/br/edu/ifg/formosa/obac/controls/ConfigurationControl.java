package br.edu.ifg.formosa.obac.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.formosa.obac.models.Environment;
import br.edu.ifg.formosa.obac.models.Surface;
import br.edu.ifg.formosa.obac.view.ConfigurationView;
import br.edu.ifg.formosa.obac.models.Object;

public class ConfigurationControl {
	
	private ConfigurationView configurationView;
	private Environment environment;
	private Object objeto;
	private Surface surface;
		
	public ConfigurationControl(){
		
		
		environment = new Environment();
		objeto = new Object();
		surface = new Surface();
		
		//objeto.setAltura(0);
		surface.setCoefFriction(0.62);
		
		environment.setObjeto(objeto);
		environment.setSurface(surface);
		
		ObacControl obacControl = new ObacControl(environment);
		
		if(configurationView.getComboBoxSupercie() == "plano"){
			
			new ObjectPlaneControl(obacControl, environment);
		}
		
//		configurationView.getBtnInit().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				
//				//environment.setGravidade(configurationView.getCombox());
//				
//			}
//		});
		
	}
}
