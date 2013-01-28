package br.edu.ifg.formosa.obac.models;

import br.edu.ifg.formosa.obac.controls.InfoPanelControl;
import br.edu.ifg.formosa.obac.utils.Conversion;

public class Environment {
	public static final double earth = 9.8;
	public static final double moon = 1.6;
	public static final double mars = 3.7;
	private double gravidade;
	private Surface surface;
	private Object objeto;
	private InfoPanelControl infoPanelControl;
	
	public Environment(InfoPanelControl infoPanelControl){
		this.infoPanelControl = infoPanelControl;
	}
	
	
	public double getGravidade() {
		return gravidade;
	}
	public void setGravidade(double gravidade) {
		this.gravidade = gravidade;
		infoPanelControl.changeValueGravity(Conversion.rounding(1, gravidade));
	}
	public Surface getSurface() {
		return surface;
	}
	public void setSurface(Surface surface) {
		this.surface = surface;
	}
	public Object getObjeto() {
		return objeto;
	}
	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	
	
}
