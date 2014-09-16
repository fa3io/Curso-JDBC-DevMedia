package br.edu.devmedia.jdbc.util;

import java.awt.Component;

import javax.swing.JOptionPane;

public class MensagemUtil {
	
	public static void adMesg(Component component, String msg){
		JOptionPane.showMessageDialog(component, msg);
	}

}
