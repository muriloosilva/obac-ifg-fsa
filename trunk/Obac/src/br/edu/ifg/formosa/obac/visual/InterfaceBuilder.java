package br.edu.ifg.formosa.obac.visual;

import br.edu.ifg.formosa.obac.main.Obac;

public class InterfaceBuilder {
	
	
	
	public InterfaceBuilder(Obac obac){
		
		obac.setLayout(new java.awt.BorderLayout());
		obac.add(new GravityView(), java.awt.BorderLayout.CENTER);
		obac.add(new FrictionView(), java.awt.BorderLayout.EAST);
		    
		
	}

}
