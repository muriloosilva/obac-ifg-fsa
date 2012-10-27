package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Panel;

import br.edu.ifg.formosa.obac.models.Surface;

public class SurfaceView extends Panel {
	public SurfaceView(){
		this.setLayout(null);
		this.setSize((int)Surface.width, 150);
		this.setBackground(new Color(142,107,35));
		this.setLocation(0, 450);
		
	}
}
