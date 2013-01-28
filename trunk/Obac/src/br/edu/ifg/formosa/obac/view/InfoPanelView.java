package br.edu.ifg.formosa.obac.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JPanel;

import br.edu.ifg.formosa.obac.controls.InfoPanelControl;
import br.edu.ifg.formosa.obac.utils.TransparentLabel;

public class InfoPanelView extends JPanel{
	
	private InfoPanelControl infoPanelControl;
	
	
	public InfoPanelView(){
		this.setLayout(null);
		this.setSize(600, 40);
		this.setLocation(0, 0);
		this.setOpaque(false);
		//this.setBackground(Color.white);
		
		//Gravidade
		TransparentLabel lbGravity = new TransparentLabel("Gravidade:");
		lbGravity.setBounds(10, 2, 70, 20);
		this.add(lbGravity);
		
		TransparentLabel lbGravityValue = new TransparentLabel("0");
		lbGravityValue.setBounds(70, 2, 70, 20);
		this.add(lbGravityValue);
		
		//Coef. de Atrito
		TransparentLabel lbCoefAtrito = new TransparentLabel("Coef. Atrito:");
		lbCoefAtrito.setBounds(10, 18, 70, 20);
		this.add(lbCoefAtrito);
		
		TransparentLabel lbCoefAtritoValue = new TransparentLabel("0");
		lbCoefAtritoValue.setBounds(70, 18, 70, 20);
		this.add(lbCoefAtritoValue);
		
		//Força de Atrito
		TransparentLabel lbForçaAtrito = new TransparentLabel("Força Atrito:");
		lbForçaAtrito.setBounds(110, 2, 70, 20);
		this.add(lbForçaAtrito);
		
		TransparentLabel lbForçaAtritoValue = new TransparentLabel("0");
		lbForçaAtritoValue.setBounds(185, 2, 70, 20);
		this.add(lbForçaAtritoValue);
		
		//Força Normal
		TransparentLabel lbForçaNormal = new TransparentLabel("Forca Normal:");
		lbForçaNormal.setBounds(110, 18, 80, 20);
		this.add(lbForçaNormal);
		
		TransparentLabel lbForçaNormalValue = new TransparentLabel("0");
		lbForçaNormalValue.setBounds(185, 18, 80, 20);
		this.add(lbForçaNormalValue);
		
		//Pos. Final
		TransparentLabel lbPosFinal = new TransparentLabel("Pos. Final:");
		lbPosFinal.setBounds(250, 2, 70, 20);
		this.add(lbPosFinal);
		
		TransparentLabel lbPosFinalValue = new TransparentLabel("0");
		lbPosFinalValue.setBounds(315, 2, 70, 20);
		this.add(lbPosFinalValue);
		
		//Aceleração
		TransparentLabel lbAceleração = new TransparentLabel("Aceleração:");
		lbAceleração.setBounds(250, 18, 80, 20);
		this.add(lbAceleração);
		
		TransparentLabel lbAceleraçãoValue = new TransparentLabel("0");
		lbAceleraçãoValue.setBounds(315, 18, 80, 20);
		this.add(lbAceleraçãoValue);
		
		//Tempo
		TransparentLabel lbTempo = new TransparentLabel("Tempo:");
		lbTempo.setBounds(360, 2, 45, 20);
		this.add(lbTempo);
		
		TransparentLabel lbTempoValue = new TransparentLabel("0");
		lbTempoValue.setBounds(402, 2, 45, 20);
		this.add(lbTempoValue);
		
		//Pos. Atual Eixo x:
		TransparentLabel lbPosAtualEixox = new TransparentLabel("Pos. Atual Eixo x:");
		lbPosAtualEixox.setBounds(445, 2, 100, 20);
		this.add(lbPosAtualEixox);
		
		TransparentLabel lbPosAtualEixoxValue = new TransparentLabel("0");
		lbPosAtualEixoxValue.setBounds(537, 2, 100, 20);
		this.add(lbPosAtualEixoxValue);
		
		//Pos. Atual Eixo y:
		TransparentLabel lbPosAtualEixoy = new TransparentLabel("Pos. Atual Eixo y:");
		lbPosAtualEixoy.setBounds(445, 18, 100, 20);
		this.add(lbPosAtualEixoy);
				
		TransparentLabel lbPosAtualEixoyValue = new TransparentLabel("0");
		lbPosAtualEixoyValue.setBounds(537, 18, 100, 20);
		this.add(lbPosAtualEixoyValue);
		
		infoPanelControl = new InfoPanelControl(lbGravityValue, lbCoefAtritoValue, lbForçaAtritoValue, 
				lbForçaNormalValue, lbPosFinalValue, lbAceleraçãoValue, lbTempoValue, lbPosAtualEixoxValue, lbPosAtualEixoyValue);
		

		
		
	}
	
	public InfoPanelControl getInfoPanelControl() {
		return infoPanelControl;
	}

	public void setInfoPanelControl(InfoPanelControl infoPanelControl) {
		this.infoPanelControl = infoPanelControl;
	}

	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Color ppColor = new Color(0, 0, 0, 115); //r,g,b,alpha
        g.setColor(ppColor);
        g.fillRect(0,0,600,40); //x,y,width,height
    }    
	
}
