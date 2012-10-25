package br.edu.ifg.formosa.obac.models;

public class Surface {
	public static final double woodFriction = 0.62;
	public static final double asphalt = 0.80;
	private double coefFriction;
	private int width;
	private double forcaAtrito;
	private double escala;
	
	public double getCoefFriction() {
		return coefFriction;
	}
	public void setCoefFriction(double coefFriction) {
		this.coefFriction = coefFriction;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getForcaAtrito() {
		return forcaAtrito;
	}
	public void setForcaAtrito(double forcaAtrito) {
		this.forcaAtrito = forcaAtrito;
	}
	public double getEscala() {
		return escala;
	}
	public void setEscala(double escala) {
		this.escala = escala;
	}
	
	
}
