package br.edu.ifg.formosa.obac.view;

import java.awt.Panel;

import javax.swing.JPanel;

public class EnvironmentView extends Panel{
	
	public EnvironmentView(){
		
		this.setLayout(null);
		SurfaceView surfaceView = new SurfaceView();
		surfaceView.setLocation(0, 0);
		this.add(surfaceView);
		
		this.add(new ObjectView());
		
		
		
	}

}
