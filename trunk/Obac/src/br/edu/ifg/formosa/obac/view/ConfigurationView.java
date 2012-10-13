package br.edu.ifg.formosa.obac.view;

import java.awt.*;
import java.awt.event.ActionListener;


import javax.swing.*;


import org.w3c.dom.CDATASection;

public class ConfigurationView extends JPanel{
	public ConfigurationView(){
		
		this.setLayout(null);
		this.setSize(200, 600);
		this.setBackground(Color.gray);
		
		Panel pPropulsion = new Panel(null);
		pPropulsion.setBounds(10, 50, 180, 90);
		pPropulsion.setBackground(Color.lightGray);
		
		Panel pAmbient = new Panel(null);
		pAmbient.setBounds(10, 175, 180, 330);
		pAmbient.setBackground(Color.lightGray);
		
		Panel pSurface = new Panel(null);
		pSurface.setBounds(10, 30, 160, 50);
		pSurface.setBackground(Color.white);
		
		Panel pAttrition = new Panel(null);
		Panel pGravity = new Panel(null);
		Panel pObstacle = new Panel(null);
		
		Label lbConfiguration = new Label("Configurações");
		lbConfiguration.setBounds(10, 0, 100, 20);
		Label lbPropulsion = new Label("Propulsão");
		lbPropulsion.setBounds(10, 30, 100, 20);
				
		String[] options = {"Manual", "Mola"}; 
				
		JComboBox cbPropulsion = new JComboBox(options);
		cbPropulsion.setBounds(10, 10, 100, 20);
		
		
		Label lbVelocity = new Label("Velocidade ini.");
		lbVelocity.setBounds(10, 40, 100, 20);		
		TextField initVelocity = new TextField("");
		initVelocity.setBounds(10, 60, 100, 20);
		
		Label lbAmbient = new Label("Ambiente");
		lbAmbient.setBounds(10, 155, 100, 20);
		
		Label lbSurface = new Label("Superfície");
		lbSurface.setBounds(10, 10, 100, 20);
		
		JRadioButton plane = new JRadioButton("Plano");
		JRadioButton planeClimb = new JRadioButton("Plano e Subida");
		JRadioButton planeDescent = new JRadioButton("Plano e Descida");
		JRadioButton planePrecipice = new JRadioButton("Plano e Precipício");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(plane);
		buttonGroup.add(planeClimb);
		buttonGroup.add(planeDescent);
		buttonGroup.add(planePrecipice);
	    plane.setSelected(true);
	    
	    
		
		
	// ---------------- add---------------
		this.add(lbConfiguration);
	    this.add(lbPropulsion);
	    this.add(pPropulsion);
	    pPropulsion.add(cbPropulsion);
	    pPropulsion.add(lbVelocity);
	    pPropulsion.add(initVelocity);
	    this.add(lbAmbient);
	    this.add(pAmbient);
	    pAmbient.add(lbSurface);
	    pAmbient.add(pSurface);	    
	    //pSurface.add(plane);
	    //pSurface.add(planeClimb);
	    //pSurface.add(planeDescent);
	    //pSurface.add(planePrecipice);
		
		//this.add(buttonGroup);
	}
	
	
}
