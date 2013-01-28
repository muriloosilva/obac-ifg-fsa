package br.edu.ifg.formosa.obac.controls;

import br.edu.ifg.formosa.obac.utils.TransparentLabel;

public class InfoPanelControl {
	
	private TransparentLabel lbGravityValue;
	private TransparentLabel lbCoefAtritoValue;
	private TransparentLabel lbForçaAtritoValue;
	private TransparentLabel lbForçaNormalValue;
	private TransparentLabel lbPosFinalValue;
	private TransparentLabel lbAceleraçãoValue;
	private TransparentLabel lbTempoValue;
	private TransparentLabel lbPosAtualEixoxValue;
	private TransparentLabel lbPosAtualEixoyValue;
	
	public InfoPanelControl(TransparentLabel lbGravityValue, TransparentLabel lbCoefAtritoValue, TransparentLabel lbForçaAtritoValue, 
			TransparentLabel lbForçaNormalValue, TransparentLabel lbPosFinalValue, TransparentLabel lbAceleraçãoValue, 
			TransparentLabel lbTempoValue, TransparentLabel lbPosAtualEixoxValue, TransparentLabel lbPosAtualEixoyValue){
		
		this.lbGravityValue = lbGravityValue;
		this.lbCoefAtritoValue = lbCoefAtritoValue;
		this.lbForçaAtritoValue = lbForçaAtritoValue;
		this.lbForçaNormalValue = lbForçaNormalValue;
		this.lbPosFinalValue = lbPosFinalValue;
		this.lbAceleraçãoValue = lbAceleraçãoValue;
		this.lbTempoValue = lbTempoValue;
		this.lbPosAtualEixoxValue = lbPosAtualEixoxValue;
		this.lbPosAtualEixoyValue = lbPosAtualEixoyValue;
	}
	
	public void changeValueGravity(double value ){
		lbGravityValue.setText("" + value);
	}
	
	public void changeValueCoefAtrito(double value ){
		lbCoefAtritoValue.setText("" + value);
	}
	
	public void changeValueForçaAtrito(double value ){
		lbForçaAtritoValue.setText("" + value);
	}
	
	public void changeValueForçaNormal(double value ){
		lbForçaNormalValue.setText("" + value);
	}
	
	public void changeValuePosFinal(double value ){
		lbPosFinalValue.setText("" + value);
	}
	
	public void changeValueAceleração(double value ){
		lbAceleraçãoValue.setText("" + value);
	}
	
	public void changeValueTempo(double value ){
		lbTempoValue.setText("" + value);
	}
	
	public void changeValuePosAtualEixox(double value ){
		lbPosAtualEixoxValue.setText("" + value);
	}
	
	public void changeValuePosAtualEixoy(double value ){
		lbPosAtualEixoyValue.setText("" + value);
	}
	
}
