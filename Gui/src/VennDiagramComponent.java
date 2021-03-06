import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VennDiagramComponent extends JComponent implements ChangeListener{
	
	private int xOffset = 160;
	
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D disk1 = new Ellipse2D.Double(10, 10, 200, 200);
		g2.setColor(new Color(255, 50, 105, 125));
		g2.fill(disk1);
		
		Ellipse2D disk2 = new Ellipse2D.Double(xOffset, 10, 200, 200);
		g2.setColor(new Color(0, 0, 255, 125));
		g2.fill(disk2);
	}
	
	@Override
	public Dimension getPreferredSize(){
		int width = 200 + 10 + 210 ;
		int height = 10 + 10 + 200;
		
		return new Dimension(width, height);
	}

	@Override
	public void stateChanged(ChangeEvent event) {
		JSlider slider = (JSlider) event.getSource();
		this.xOffset = (int) slider.getValue();
		System.out.println("Event Triggered" + this.xOffset);
		this.repaint();
	}
}
