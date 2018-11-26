

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class GUI {
	
	public static void main(String[] args){
		JFrame window = new JFrame("Venn Diagram");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create text at top
		JTextField subtitle = new JTextField("Venn Diagram of two disks");
		subtitle.setEditable(false);
		subtitle.setHorizontalAlignment(JTextField.CENTER);
		window.add(subtitle, BorderLayout.NORTH);
		
		//create drawing
		VennDiagramComponent venn = new VennDiagramComponent();
		window.add(venn, BorderLayout.CENTER);
		
		
		//create button at the bottom
		JSlider nums = new JSlider(10, 210, 160);
		nums.addChangeListener(venn);
		window.add(nums, BorderLayout.SOUTH);
				
		//window.setSize(300, 300);
		window.pack();
		window.setVisible(true);
		
		
	}
}
