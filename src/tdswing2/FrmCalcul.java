package tdswing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCalcul extends JFrame implements ActionListener {
	JLabel lblNbr=new JLabel("number");
	JTextField txtNbr=new JTextField();
	JButton btnCalculer=new JButton("calculer");
	 JLabel lblRes=new JLabel("Resultat:");
	public FrmCalcul() {
		initUI();
		setSize(200,300);
		btnCalculer.addActionListener(this);
		setVisible(true);
	}
	private void initUI() {
	 setLayout(new GridLayout(4,1));
	 add(lblNbr);
	 add(txtNbr);
	 add(btnCalculer);
	 add(lblRes);
	}
	public void actionPerformed(ActionEvent arg0)
	 {
	Integer a=Integer.parseInt(txtNbr.getText());
	Integer res=a*a;
	lblRes.setText(res.toString());
	}

	public static void main(String[] args) {
		FrmCalcul f=new FrmCalcul();
	}

}
