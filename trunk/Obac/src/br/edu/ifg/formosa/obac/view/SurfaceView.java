package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.models.Surface;

public class SurfaceView extends JPanel {
	
	public SurfaceView(ObjectView objectView){
		this.setLayout(null);
		objectView.setBounds(50, 0, 30, 30);
		this.add(objectView);	
		this.setOpaque(false);
		
	}
	
	

}
