package tdswing2;

import java.awt.*;

import javax.swing.*;

public class FrmAffichage extends JFrame {
	JLabel lbl1=new JLabel("Saisir votre text:");
	JLabel lbl2=new JLabel("Text mise en Forme:");
	JTextField txt1=new JTextField();
	JTextField txt2=new JTextField();
	JCheckBox chbx=new JCheckBox("Majuscule");
	JRadioButton rb1=new JRadioButton("rouge",true);
	JRadioButton rb2=new JRadioButton("bleu");
	ButtonGroup btg=new ButtonGroup();
	JPanel panel=new JPanel();
	private void initUI() {
		panel.setLayout(new GridLayout(4,2));
		panel.add(lbl1);
		panel.add(txt1);
		btg.add(rb1);
		btg.add(rb2);
		panel.add(rb1);
		panel.add(rb2);
		panel.add(chbx);
		panel.add(lbl2);
		panel.add(txt2);
	}
	public FrmAffichage() {
		setSize(400,500);
		initUI();
		rb1.addActionListener(new FrmEcouteur(this));
		rb2.addActionListener(new FrmEcouteur(this));
		chbx.addActionListener(new FrmEcouteur(this));
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmAffichage();
		
	}

}
