package br.edu.ifg.formosa.obac.models;

import br.edu.ifg.formosa.obac.controls.InfoPanelControl;
import br.edu.ifg.formosa.obac.utils.Conversion;

public class Surface {
	public static final double woodFriction = 0.62;
	public static final double asphaltFriction = 0.80;
	public static final double aluminumFriction = 1.4;
	private double coefFriction;
	public static double width = 500.00;
	public static double widthY = 420.00;
	private double forcaAtrito;
	private double escala;
	private long posicaoFinal;
	
	public static final double widthPlaneCliffPx = 150;
	public static final double widthCliffPx = 350;
	
	public static final double widthPlaneCliffPc = 30;
	public static final double widthCliffPc = 70;
	
	public static double widthPlaneCliff = 0;
	public static double widthCliff = 0;
	
	public static final int pontoFinalObjetoDescent = 518;
	public static final int pontoFinalObjetoClimb = 0;
	
	public static final double sinAngulo = Math.sin(26.9);
	public static final double cosAngulo = Math.cos(26.9);

	private InfoPanelControl infoPanelControl;
	
	public Surface(InfoPanelControl infoPanelControl){
		this.infoPanelControl = infoPanelControl;
	}
	
	public long getPontoFinal() {
		return posicaoFinal;
	}
	public void setPontoFinal(long pontoFinal) {
		this.posicaoFinal = pontoFinal;
	}
	public double getCoefFriction() {
		return coefFriction;
	}
	public void setCoefFriction(double coefFriction) {
		this.coefFriction = coefFriction;
		infoPanelControl.changeValueCoefAtrito(Conversion.rounding(1, coefFriction));
	}
	
	public double getForcaAtrito() {
		return forcaAtrito;
	}
	public void setForcaAtrito(double forcaAtrito) {
		this.forcaAtrito = forcaAtrito;
		System.out.println("### Atrito Antes"+forcaAtrito);
		infoPanelControl.changeValueForçaAtrito(Conversion.rounding(1, forcaAtrito));
		System.out.println("### Atrito Depois"+ Conversion.rounding(1, forcaAtrito));
	}
	public double getEscala() {
		return Conversion.rounding(2, escala);
	}
	public void setEscala(double escala) {
		this.escala = escala;
		System.out.println("Escala: "+escala);
	}
	
	public static int getPontoFinalObjetoClimb() {
		return pontoFinalObjetoClimb;
	}
	
	public static int getPontoFinalObjetoDescent() {
		return pontoFinalObjetoDescent;
	}
	
	public static double getSinAngulo() {
		return sinAngulo;
	}
	
	public static double getCosAngulo() {
		return cosAngulo;
	}
	
}
