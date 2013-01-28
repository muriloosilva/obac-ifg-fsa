package br.edu.ifg.formosa.obac.utils;

import java.awt.TextField;
import java.awt.event.KeyEvent;

public class KeyBoardControl {
	public static void verifyIsNumber(KeyEvent arg0, TextField tx){
		int code = arg0.getKeyCode();
		if(code == 10 || code == 37 || code == 39 || code == 8 || code == 127||code == 0  || code == 46 || code >= 48 && code <= 57 || code >= 96 && code <= 105){
		}else{
			tx.setText("");
		}
	}
}
