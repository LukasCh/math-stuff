package sk.fflch.mathstuff.matrixcalculator.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UltimateCalculatorGUI extends JFrame {
	private JTextArea firstTextarea;
	private JTextArea secondTextarea;
	private JTextArea resultTextarea;
	
	public UltimateCalculatorGUI() {
		initWindow();
	}
	
	private void initWindow() {
		setTitle("Ultimate Calculator Window");
		setSize(500, 800);
		add(getContent());	
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		UltimateCalculatorGUI gui = new UltimateCalculatorGUI();
	}
	
	private JPanel getContent() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Textarea #1"));
		firstTextarea = new JTextArea();
		firstTextarea.setPreferredSize(new Dimension(450, 200));
		firstTextarea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.add(firstTextarea);
		panel.add(new JLabel("Textarea #2"));
		secondTextarea = new JTextArea();
		secondTextarea.setPreferredSize(new Dimension(450, 200));
		secondTextarea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.add(secondTextarea);
		
		JButton addMatricesButton = new JButton("Add Matrices");
		addMatricesButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Add Matrices Pressed");
				
			}
		});
		panel.add(addMatricesButton);
		
		JButton subMatricesButton = new JButton("Sub Matrices");
		subMatricesButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Sub Matrices Pressed");
				
			}
		});
		panel.add(subMatricesButton);
		
		JButton mulMatricesButton = new JButton("Mul Matrices");
		mulMatricesButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Mul Matrices Pressed");
				
			}
		});
		panel.add(mulMatricesButton);
		panel.add(new JLabel("                                                                            "));
		panel.add(new JLabel("                                       Result                                       "));
		
		resultTextarea = new JTextArea();
		resultTextarea.setPreferredSize(new Dimension(450, 200));
		resultTextarea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		resultTextarea.setEditable(false);		
		panel.add(resultTextarea);
		
		return panel;
	}
}

