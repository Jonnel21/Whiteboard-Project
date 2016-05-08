import java.awt.*;

import javax.swing.*;

public class ControlPanel extends JPanel {
	
	public ControlPanel()
	{
		super();
		this.addButtons();
	}
	
	public void addButtons()
	{
		JPanel shapePanel = new JPanel();
		JPanel colorPanel = new JPanel();
		JPanel movePanel = new JPanel();
		JButton rect = new JButton("Rect");
		JButton oval = new JButton("Oval");
		JButton line = new JButton("Line");
		JButton text = new JButton("Text");
		JButton setColor = new JButton("Set Color");
		JButton moveFront = new JButton("Move To Front");
		JButton moveBack = new JButton("Move To Back");
		JButton remove = new JButton("Remove Shape");
		
		shapePanel.setLayout(new BoxLayout(shapePanel, BoxLayout.X_AXIS)); 
		shapePanel.add(new JLabel("Add"));
		shapePanel.add(rect);
		shapePanel.add(oval);
		shapePanel.add(line);
		shapePanel.add(text);
		shapePanel.add(Box.createRigidArea(new Dimension(0,50))); // creates white space between the panels.
		
		colorPanel.setLayout(new BoxLayout(colorPanel, BoxLayout.X_AXIS));
		colorPanel.add(setColor);
		colorPanel.add(Box.createRigidArea(new Dimension(0,50)));
		
		movePanel.setLayout(new BoxLayout(movePanel, BoxLayout.X_AXIS));
		movePanel.add(moveFront);
		movePanel.add(moveBack);
		movePanel.add(remove);
		movePanel.add(Box.createRigidArea(new Dimension(0,50)));
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(shapePanel);
		this.add(colorPanel);
		this.add(movePanel);
		for(Component comp: this.getComponents()){
			((JComponent)comp).setAlignmentX(LEFT_ALIGNMENT); // aligns all the panels to the left margin.
		}
	}
}
