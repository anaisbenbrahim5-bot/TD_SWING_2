package tdswing2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmEcouteur implements ActionListener {
FrmAffichage frm;
public FrmEcouteur(FrmAffichage f) {
	frm=f;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
         String text=frm.txt1.getText();
         if(frm.chbx.isSelected()) {
        	 text=text.toUpperCase();
         }else {
        	 text=text.toLowerCase();
         }
         frm.txt2.setText(text);
         if(frm.rb1.isSelected()) {
        	 frm.txt2.setForeground(Color.RED);
         } else if(frm.rb2.isSelected()) {
        	 frm.txt2.setForeground(Color.BLUE);
         }
	}

}
