package sk.fflch.mathstuff.matrixcalculator.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sk.fflch.mathstuff.matrixcalculator.UltimateMatrixCalculator;

public class UltimateCalculatorGUI extends JFrame {
	private JTextArea firstTextarea;
	private JTextArea secondTextarea;
	private JTextArea resultTextarea;

	private static String firstTextareaText = "1 2 3\n4 5 6\n7 8 9";
	private static String secondTextareaText = "1 2 3\n4 5 6\n7 8 9";

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
		firstTextarea = new JTextArea(firstTextareaText);
		firstTextarea.setPreferredSize(new Dimension(450, 200));
		firstTextarea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.add(firstTextarea);
		panel.add(new JLabel("Textarea #2"));
		secondTextarea = new JTextArea(secondTextareaText);
		secondTextarea.setPreferredSize(new Dimension(450, 200));
		secondTextarea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		panel.add(secondTextarea);

		JButton addMatricesButton = new JButton("Add Matrices");
		addMatricesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int[][] matrixA = textToMatrix(firstTextarea.getText());
				int[][] matrixB = textToMatrix(secondTextarea.getText());
				int[][] result = UltimateMatrixCalculator.addMatrices(matrixA, matrixB);
				resultTextarea.setText(getMatrixDisplayString(result));

			}
		});
		panel.add(addMatricesButton);

		JButton subMatricesButton = new JButton("Sub Matrices");
		subMatricesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int[][] matrixA = textToMatrix(firstTextarea.getText());
				int[][] matrixB = textToMatrix(secondTextarea.getText());
				int[][] result = UltimateMatrixCalculator.subMatrices(matrixA, matrixB);
				resultTextarea.setText(getMatrixDisplayString(result));
			}
		});
		panel.add(subMatricesButton);

		JButton mulMatricesButton = new JButton("Mul Matrices");
		mulMatricesButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int[][] matrixA = textToMatrix(firstTextarea.getText());
				int[][] result = null;
				if (isNumeric(secondTextarea.getText())) {
					result = UltimateMatrixCalculator.mulMatrix(matrixA, Integer.parseInt(secondTextarea.getText()));
				} else {
					int[][] matrixB = textToMatrix(secondTextarea.getText());
					result = UltimateMatrixCalculator.mulMatrices(matrixA, matrixB);
				}
				resultTextarea.setText(getMatrixDisplayString(result));

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

	public static int[][] textToMatrix(String text) {
		int[][] matrix = null;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		Scanner textScanner = new Scanner(text);
		int rowNumber = 0;

		while (textScanner.hasNextLine()) {
			Scanner rowScanner = new Scanner(textScanner.nextLine()).useDelimiter(" ");
			result.add(new ArrayList<Integer>());
			while (rowScanner.hasNextInt()) {
				result.get(rowNumber).add(rowScanner.nextInt());
			}
			rowScanner.close();
			rowNumber++;
		}
		textScanner.close();

		matrix = new int[result.size()][result.get(0).size()];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = result.get(i).get(j);
			}
		}
		result.toArray();

		return matrix;
	}

	public static String getMatrixDisplayString(int[][] matrix) {
		return Arrays.deepToString(matrix).replaceAll("],", "],\r\n").replace(" [", "").replace("]", "").replace("[", "").replace(",", "").replace(" ", "\t");
	}

	public static boolean isNumeric(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
