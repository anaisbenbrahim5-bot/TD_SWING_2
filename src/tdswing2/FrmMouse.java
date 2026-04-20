package tdswing2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class FrmMouse extends JFrame implements MouseListener {
	public FrmMouse() {
		setSize(200,100);
		addMouseListener(this);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrmMouse f=new FrmMouse();

	}

}
