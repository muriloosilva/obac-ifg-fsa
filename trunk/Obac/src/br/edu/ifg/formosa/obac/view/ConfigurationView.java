package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


import javax.swing.JPanel;

public class ConfigurationView extends JPanel{
	public ConfigurationView(){
		
		this.setLayout(null);
		this.setSize(200, 600);
		this.setBackground(Color.green);
		
		Label lbConfiguration = new Label("Configurações");
		Label lbPropulsion = new Label("Propulsão");
		
		lbConfiguration.setBounds(0, 0, 100, 20);
		lbPropulsion.setBounds(0, 30, 100, 20);
				
		Panel pPropulsion = new Panel(null);
	
		
	// ---------------- add---------------
		this.add(lbConfiguration);
		this.add(lbPropulsion);
	}
	
	
}
