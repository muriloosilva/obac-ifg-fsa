package br.edu.ifg.formosa.obac.models;

import br.edu.ifg.formosa.obac.utils.Conversion;

public class Surface {
	public static final double woodFriction = 0.62;
	public static final double asphalt = 0.80;
	private double coefFriction;
	public static double width = 500.00;
	private double forcaAtrito;
	private double escala;
	private long posicaoFinal;
	
	
	
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
	}
	
	public double getForcaAtrito() {
		return forcaAtrito;
	}
	public void setForcaAtrito(double forcaAtrito) {
		this.forcaAtrito = forcaAtrito;
	}
	public double getEscala() {
		return Conversion.rounding(2, escala);
	}
	public void setEscala(double escala) {
		this.escala = escala;
		System.out.println("Escala: "+escala);
	}
	
	
}
