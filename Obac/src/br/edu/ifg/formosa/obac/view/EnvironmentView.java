package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

public class EnvironmentView extends Panel{
	
	public EnvironmentView(){
		
		this.setLayout(null);
		this.setSize(600, 600);
		this.setBackground(Color.CYAN);
		this.setLocation(200, 0);
//		SurfaceView surfaceView = new SurfaceView();
//		this.add(surfaceView);
		this.add(new SurfaceView());
		this.add(new ObjectView());
	}

}
