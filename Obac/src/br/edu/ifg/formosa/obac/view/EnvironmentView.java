package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EnvironmentView extends JPanel{
	
	private ImageIcon img;
	private SurfaceView surfaceView;
	
	public EnvironmentView(ScaleView scaleView, SurfaceView surfaceView){
		img = new ImageIcon("asfaltoreto.png");
		this.setLayout(null);
		this.setSize(600, 600);
		this.surfaceView = surfaceView;
		JLabel jLabel = new JLabel(img);
		jLabel.setBounds(0, 0, 600, 600);
		//
		this.setLocation(200, 0);
		
		surfaceView.setBounds(0, 449, 600, 150);
		this.add(surfaceView, 0);
		this.add(jLabel, 1);		
	}

}
