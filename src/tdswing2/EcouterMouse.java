package tdswing2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EcouterMouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Appui: ("+e.getX()+" , "+e.getY()+" ) ");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Relachement: ("+e.getX()+" , "+e.getY()+" ) ");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entree: ("+e.getX()+" , "+e.getY()+" ) ");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("sortie: ("+e.getX()+" , "+e.getY()+" ) ");

	}

}
