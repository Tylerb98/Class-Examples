import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spirograph extends JFrame implements ActionListener{
	private JPanel paper;
	
	public static void main(String[] args)
	{
		Spirograph frame = new Spirograph();
		frame.setVisible(true);
	}
	
	Spirograph ()
	{
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton go = new JButton("Draw");
		go.addActionListener(this);
		this.add(go, BorderLayout.SOUTH);
		
		this.paper = new JPanel();
		this.add(this.paper, BorderLayout.CENTER);
	}
	
	public void actionPerformed (ActionEvent event)
	{
		System.out.println("Foo");
		SpiroThread foo = new SpiroThread();
		foo.start();
	}
	
	private class SpiroThread extends Thread{
		public void run()
		{
			Graphics g = paper.getGraphics();
			Graphics2D g2 = (Graphics2D)g;
			for(int i = 0; i<36; i++)
			{
				try
				{
					Thread.sleep(300);
				}
				catch(InterruptedException e)
				{
				
				}
				g2.drawOval(50, 180, 300, 40);
				g2.rotate(Math.toRadians(5), 200, 200);
			}
		}
	}
}