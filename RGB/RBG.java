package RGB;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class RBG extends JFrame implements ChangeListener {

	public RBG() {
		FColor();
	}
	
	private void FColor() {
		setSize(300,200);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                cont = getContentPane();
		
		
		panel = new JPanel();
		
                
		BRojo = createSlider(255);
		BVerde = createSlider(255);
		BAzul = createSlider(255);
		
		panel.add(BRojo);
		panel.add(BVerde);
		panel.add(BAzul);
		
		
		cont.add(panel);
                
                
		
	}
	
	public void stateChanged(ChangeEvent ce) {
		int R, G, B;
		
		R = BRojo.getValue();
		G = BVerde.getValue();
		B = BAzul.getValue();
		
		panel.setBackground(new Color(R,G,B));
                this.setTitle(R+","+G+","+B);
	}

	private JSlider createSlider(int value) {
		JSlider slider = new JSlider();
		slider.setOrientation(JSlider.HORIZONTAL);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinimum(0);
		slider.setMaximum(255);
		slider.setValue(value);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		
		slider.addChangeListener(this);
		
		return slider;
	}
	
	public static void main(String[] args) {
		new RBG().setVisible(true);
	}
	
	private Container cont;
	private JPanel panel;
	private JSlider BRojo, BVerde, BAzul;

    
}