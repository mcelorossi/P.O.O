package br.uern.poo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image extends JFrame {
	
	private String iconName;
	ImageIcon imagem;
	JLabel label;
	
	public Image(String iconName) {
		setIconName(iconName);
		this.imagem = new ImageIcon(getClass().getResource(iconName + ".png"));
		this.label = new JLabel(imagem);
		add(label);		
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
		
	}
	
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

}
