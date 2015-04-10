package zifu;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseMotionAdapter;

public class four  {
	public static void main(String[] args) {
		Frame jf=new Frame("ÂÀÖ¾ºÆ");
		jf.setBounds(100, 100, 400, 300);
		final Label j1=new Label("Hello World");
		j1.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) { 
				j1.setLocation(e.getX() , e.getY()); 
			} 
		}); 
		jf.add(j1);
		j1.setVisible(true);
		jf.setVisible(true); 
	}

}

