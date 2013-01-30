package br.edu.ifg.formosa.obac.models;

import br.edu.ifg.formosa.obac.controls.InfoPanelControl;
import br.edu.ifg.formosa.obac.utils.Conversion;

public class Object {
	
	private double massa;
	private double velocidadeInicial;
	private int velocidade;
	private double aceleracao;
	private double aceleracaoY;
	private double forcaNormal;
	private double posicaoInicial = 0;
	private double posicaoFinal = 0;
	private double tempo;
	private double movimento = 50;
	private double espacoTemporario;
	private double posicaoAtual;
	private double posicaoAtualY;
	private double posicaoAtualYPixel;
	private int propulsao;
	private double posicaoFinalPixel = 0;
	private double posicaoAtualPixel;
	
	private InfoPanelControl infoPanelControl;
	
	public Object(InfoPanelControl infoPanelControl){
		this.infoPanelControl = infoPanelControl;
	}
	
	public double getPosicaoAtualPixel() {
		return posicaoAtualPixel;
	}


	public void setPosicaoAtualPixel(double posicaoAtualPixel) {
		this.posicaoAtualPixel = posicaoAtualPixel;
	}
	
	
	public double getAceleracaoY() {
		return aceleracaoY;
	}
	public void setAceleracaoY(double aceleracaoY) {
		this.aceleracaoY = aceleracaoY;
		
	}
	public double getPosicaoAtualY() {
		return posicaoAtualY;
	}
	public double getPosicaoAtualYPixel() {
		return posicaoAtualYPixel;
	}
	public void setPosicaoAtualY(double posicaoAtualY) {
		this.posicaoAtualY = posicaoAtualY;
		infoPanelControl.changeValuePosAtualEixoy(Conversion.rounding(1, posicaoAtualY));
	}
	public void setPosicaoAtualYPixel(double posicaoAtualY) {
		this.posicaoAtualYPixel = posicaoAtualY;
	}
	public double getPosicaoFinalPixel() {
		return Conversion.rounding(2, posicaoFinalPixel);
	}
	public void setPosicaoFinalPixel(double posicaoFinalPixel) {
		this.posicaoFinalPixel = posicaoFinalPixel;
	}
	public int getPropulsao() {
		return propulsao;
	}
	public void setPropulsao(int propulsao) {
		this.propulsao = propulsao;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public double getVelocidadeInicial() {
		return velocidadeInicial;
	}
	public void setVelocidadeInicial(double velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
		infoPanelControl.changeValueAceleração(Conversion.rounding(1, aceleracao));
	}
	public double getForcaNormal() {
		return forcaNormal;
	}
	public void setForcaNormal(double forcaNormal) {
		this.forcaNormal = forcaNormal;
		infoPanelControl.changeValueForçaNormal(Conversion.rounding(1, forcaNormal));
	}
	public double getPosicaoFinal() {
		return Conversion.rounding(2, posicaoFinal);
	}
	public void setPosicaoFinal(double posicaoFinal) {
		this.posicaoFinal = posicaoFinal;
		infoPanelControl.changeValuePosFinal(Conversion.rounding(1, posicaoFinal));
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
		infoPanelControl.changeValueTempo(Conversion.rounding(1, tempo));
	}
	public double getMovimento() {
		return movimento;
	}
	public void setMovimento(double movimento) {
		this.movimento = movimento;
	}
	public double getEspacoTemporario() {
		return espacoTemporario;
	}
	public void setEspacoTemporario(double espacoTemporario) {
		this.espacoTemporario = espacoTemporario;
	}
	public double getPosicaoAtual() {
		return Conversion.rounding(2, posicaoAtual);
	}
	public void setPosicaoAtual(double posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
		infoPanelControl.changeValuePosAtualEixox(Conversion.rounding(1, posicaoAtual));
	}
	public double getPosicaoInicial() {
		
		return posicaoInicial;
	}
	public void setPosicaoInicial(double posicaoInicial) {
		this.posicaoInicial = posicaoInicial;
	}
}
