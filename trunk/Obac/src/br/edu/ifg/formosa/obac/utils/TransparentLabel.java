package br.edu.ifg.formosa.obac.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class TransparentLabel extends JLabel{
	
	private int width;
	private int height;
	
	public TransparentLabel(String text) {
		this.setText(text);
		this.setForeground(Color.white);
		this.setFont(new Font("Arial", Font.BOLD, 10));
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
		this.width = width;
		this.height = height;
	}
	
	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Color ppColor = new Color(0, 0, 0, 0); //r,g,b,alpha
        g.setColor(ppColor);
        g.fillRect(0,0,width,height); //x,y,width,height
    }   

}
