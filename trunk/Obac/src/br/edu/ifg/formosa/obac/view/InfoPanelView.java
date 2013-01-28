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
	public TransparentLabel getLbGravity() {
		return lbGravity;
	}

	public void setLbGravity(TransparentLabel lbGravity) {
		this.lbGravity = lbGravity;
	}

	public TransparentLabel getLbGravityValue() {
		return lbGravityValue;
	}

	public void setLbGravityValue(TransparentLabel lbGravityValue) {
		this.lbGravityValue = lbGravityValue;
	}

	public TransparentLabel getLbCoefAtrito() {
		return lbCoefAtrito;
	}

	public void setLbCoefAtrito(TransparentLabel lbCoefAtrito) {
		this.lbCoefAtrito = lbCoefAtrito;
	}

	public TransparentLabel getLbCoefAtritoValue() {
		return lbCoefAtritoValue;
	}

	public void setLbCoefAtritoValue(TransparentLabel lbCoefAtritoValue) {
		this.lbCoefAtritoValue = lbCoefAtritoValue;
	}

	public TransparentLabel getLbForçaAtrito() {
		return lbForçaAtrito;
	}

	public void setLbForçaAtrito(TransparentLabel lbForçaAtrito) {
		this.lbForçaAtrito = lbForçaAtrito;
	}

	public TransparentLabel getLbForçaAtritoValue() {
		return lbForçaAtritoValue;
	}

	public void setLbForçaAtritoValue(TransparentLabel lbForçaAtritoValue) {
		this.lbForçaAtritoValue = lbForçaAtritoValue;
	}

	public TransparentLabel getLbForçaNormal() {
		return lbForçaNormal;
	}

	public void setLbForçaNormal(TransparentLabel lbForçaNormal) {
		this.lbForçaNormal = lbForçaNormal;
	}

	public TransparentLabel getLbForçaNormalValue() {
		return lbForçaNormalValue;
	}

	public void setLbForçaNormalValue(TransparentLabel lbForçaNormalValue) {
		this.lbForçaNormalValue = lbForçaNormalValue;
	}

	public TransparentLabel getLbPosFinal() {
		return lbPosFinal;
	}

	public void setLbPosFinal(TransparentLabel lbPosFinal) {
		this.lbPosFinal = lbPosFinal;
	}

	public TransparentLabel getLbPosFinalValue() {
		return lbPosFinalValue;
	}

	public void setLbPosFinalValue(TransparentLabel lbPosFinalValue) {
		this.lbPosFinalValue = lbPosFinalValue;
	}

	public TransparentLabel getLbAceleração() {
		return lbAceleração;
	}

	public void setLbAceleração(TransparentLabel lbAceleração) {
		this.lbAceleração = lbAceleração;
	}

	public TransparentLabel getLbAceleraçãoValue() {
		return lbAceleraçãoValue;
	}

	public void setLbAceleraçãoValue(TransparentLabel lbAceleraçãoValue) {
		this.lbAceleraçãoValue = lbAceleraçãoValue;
	}

	public TransparentLabel getLbTempo() {
		return lbTempo;
	}

	public void setLbTempo(TransparentLabel lbTempo) {
		this.lbTempo = lbTempo;
	}

	public TransparentLabel getLbTempoValue() {
		return lbTempoValue;
	}

	public void setLbTempoValue(TransparentLabel lbTempoValue) {
		this.lbTempoValue = lbTempoValue;
	}

	public TransparentLabel getLbPosAtualEixox() {
		return lbPosAtualEixox;
	}

	public void setLbPosAtualEixox(TransparentLabel lbPosAtualEixox) {
		this.lbPosAtualEixox = lbPosAtualEixox;
	}

	public TransparentLabel getLbPosAtualEixoxValue() {
		return lbPosAtualEixoxValue;
	}

	public void setLbPosAtualEixoxValue(TransparentLabel lbPosAtualEixoxValue) {
		this.lbPosAtualEixoxValue = lbPosAtualEixoxValue;
	}

	public TransparentLabel getLbPosAtualEixoy() {
		return lbPosAtualEixoy;
	}

	public void setLbPosAtualEixoy(TransparentLabel lbPosAtualEixoy) {
		this.lbPosAtualEixoy = lbPosAtualEixoy;
	}

	public TransparentLabel getLbPosAtualEixoyValue() {
		return lbPosAtualEixoyValue;
	}

	public void setLbPosAtualEixoyValue(TransparentLabel lbPosAtualEixoyValue) {
		this.lbPosAtualEixoyValue = lbPosAtualEixoyValue;
	}

	private TransparentLabel lbGravity;
	private TransparentLabel lbGravityValue;
	private TransparentLabel lbCoefAtrito;
	private TransparentLabel lbCoefAtritoValue;
	private TransparentLabel lbForçaAtrito;
	private TransparentLabel lbForçaAtritoValue;
	private TransparentLabel lbForçaNormal;
	private TransparentLabel lbForçaNormalValue;
	private TransparentLabel lbPosFinal;
	private TransparentLabel lbPosFinalValue;
	private TransparentLabel lbAceleração;
	private TransparentLabel lbAceleraçãoValue;
	private TransparentLabel lbTempo;
	private TransparentLabel lbTempoValue;
	private TransparentLabel lbPosAtualEixox;
	private TransparentLabel lbPosAtualEixoxValue;
	private TransparentLabel lbPosAtualEixoy;
	private TransparentLabel lbPosAtualEixoyValue;
	
	public InfoPanelView(){
		this.setLayout(null);
		this.setSize(600, 40);
		this.setLocation(0, 0);
		this.setOpaque(false);
		//this.setBackground(Color.white);
		
		//Gravidade
		lbGravity = new TransparentLabel("Gravidade:");
		lbGravity.setBounds(10, 2, 70, 20);
		this.add(lbGravity);
		
		lbGravityValue = new TransparentLabel("0");
		lbGravityValue.setBounds(70, 2, 70, 20);
		this.add(lbGravityValue);
		
		//Coef. de Atrito
		lbCoefAtrito = new TransparentLabel("Coef. Atrito:");
		lbCoefAtrito.setBounds(10, 18, 70, 20);
		this.add(lbCoefAtrito);
		
		lbCoefAtritoValue = new TransparentLabel("0");
		lbCoefAtritoValue.setBounds(70, 18, 70, 20);
		this.add(lbCoefAtritoValue);
		
		//Força de Atrito
		lbForçaAtrito = new TransparentLabel("Força Atrito:");
		lbForçaAtrito.setBounds(110, 2, 70, 20);
		this.add(lbForçaAtrito);
		
		lbForçaAtritoValue = new TransparentLabel("0");
		lbForçaAtritoValue.setBounds(185, 2, 70, 20);
		this.add(lbForçaAtritoValue);
		
		//Força Normal
		lbForçaNormal = new TransparentLabel("Forca Normal:");
		lbForçaNormal.setBounds(110, 18, 80, 20);
		this.add(lbForçaNormal);
		
		lbForçaNormalValue = new TransparentLabel("0");
		lbForçaNormalValue.setBounds(185, 18, 80, 20);
		this.add(lbForçaNormalValue);
		
		//Pos. Final
		lbPosFinal = new TransparentLabel("Pos. Final:");
		lbPosFinal.setBounds(250, 2, 70, 20);
		this.add(lbPosFinal);
		
		lbPosFinalValue = new TransparentLabel("0");
		lbPosFinalValue.setBounds(315, 2, 70, 20);
		this.add(lbPosFinalValue);
		
		//Aceleração
		lbAceleração = new TransparentLabel("Aceleração:");
		lbAceleração.setBounds(250, 18, 80, 20);
		this.add(lbAceleração);
		
		lbAceleraçãoValue = new TransparentLabel("0");
		lbAceleraçãoValue.setBounds(315, 18, 80, 20);
		this.add(lbAceleraçãoValue);
		
		//Tempo
		lbTempo = new TransparentLabel("Tempo:");
		lbTempo.setBounds(360, 2, 45, 20);
		this.add(lbTempo);
		
		lbTempoValue = new TransparentLabel("0");
		lbTempoValue.setBounds(402, 2, 45, 20);
		this.add(lbTempoValue);
		
		//Pos. Atual Eixo x:
		lbPosAtualEixox = new TransparentLabel("Pos. Atual Eixo x:");
		lbPosAtualEixox.setBounds(445, 2, 100, 20);
		this.add(lbPosAtualEixox);
		
		lbPosAtualEixoxValue = new TransparentLabel("0");
		lbPosAtualEixoxValue.setBounds(537, 2, 100, 20);
		this.add(lbPosAtualEixoxValue);
		
		//Pos. Atual Eixo y:
		lbPosAtualEixoy = new TransparentLabel("Pos. Atual Eixo y:");
		lbPosAtualEixoy.setBounds(445, 18, 100, 20);
		this.add(lbPosAtualEixoy);
				
		lbPosAtualEixoyValue = new TransparentLabel("0");
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
