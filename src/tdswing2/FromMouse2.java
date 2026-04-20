package tdswing2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class FromMouse2 extends JFrame {
         public FromMouse2() {
        	 setSize(500,400);
        	 //addMouseListener(new EcouterMouse());
        	 //addMouseListener(new EcouteurAdapteur());
        	 /*addMouseListener(new MouseAdapter() {
        		 @Override
        			public void mouseEntered(MouseEvent e) {
        				System.out.println("entree: ("+e.getX()+" , "+e.getY()+" ) ");

        			}

        			@Override
        			public void mouseExited(MouseEvent e) {
        				System.out.println("sortie: ("+e.getX()+" , "+e.getY()+" ) ");

        			}
        	 });*/
        	 addMouseListener(new EcouteurAdapteur() {
        		 @Override
        			public void mouseEntered(MouseEvent e) {
        				System.out.println("entree: ("+e.getX()+" , "+e.getY()+" ) ");

        			}

        			@Override
        			public void mouseExited(MouseEvent e) {
        				System.out.println("sortie: ("+e.getX()+" , "+e.getY()+" ) ");

        			}
        	 });
        	 
        	 setVisible(true);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FromMouse2();
	}

}
