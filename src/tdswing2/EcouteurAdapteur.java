package tdswing2;


import java.awt.event.*;

import javax.swing.*;

public class EcouteurAdapteur extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Appui: ("+e.getX()+" , "+e.getY()+" ) ");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Relachement: ("+e.getX()+" , "+e.getY()+" ) ");

	}

}
