package com.finalproj.maven.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.finalproj.maven.classes.CalculatorAdvanced;
import com.finalproj.maven.classes.CalculatorBasic;

public class MainFrame {

	private JFrame frame = new JFrame();
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
	private JLabel lblFirstNumber = new JLabel("First Number:");
	private JLabel lblSecondNumber = new JLabel("Second Number:");
	private JLabel lblResult = new JLabel("Result: ");
	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private JButton btnMultiplication = new JButton("*");
	private JButton btnDivision = new JButton("/");
	private JButton btnPercentage = new JButton("%");
	private JButton btnSquare = new JButton("^2");
	private JButton btnCube = new JButton("^3");
	private JButton btnSquareRt = new JButton("√");
	private JButton btnSin = new JButton("Sin");
	private JButton btnCos = new JButton("Cos");
	CalculatorBasic cb = new CalculatorBasic();
	CalculatorAdvanced ca = new CalculatorAdvanced();


	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Properties for frame
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 378, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//Properties for textField
		textField.setBounds(42, 42, 312, 19);
		textField.setColumns(10);
		
		//Properties for textField_1
		textField_1.setBounds(42, 101, 312, 19);
		textField_1.setColumns(10);
		
		//Properties for label lblFirstNumber
		lblFirstNumber.setBounds(42, 15, 109, 15);

		//Properties for label lblSecondNumber
		lblSecondNumber.setBounds(42, 74, 197, 15);

		//Properties for label lblResult
		lblResult.setBounds(42, 146, 312, 15);
	
		//Properties for button btnAdd
		btnAdd.setBounds(42, 173, 52, 31);
		
		//Properties for button btnSubtract
		btnSubtract.setBounds(100, 173, 52, 31);
		
		//Properties for button btnMultiplication
		btnMultiplication.setBounds(155, 173, 52, 31);
		
		//Properties for button btnDivision
		btnDivision.setBounds(209, 173, 52, 31);
		btnPercentage.setToolTipText("Insert number to calculate in First Number and the percentage you want to calculate in Second Number");

		
		//Properties for button btnPercentage
		btnPercentage.setBounds(263, 173, 52, 31);
		btnSquare.setToolTipText("Insert First Number only");
		
		//Properties for button btnSquare
		btnSquare.setBounds(42, 217, 52, 31);
		btnCube.setToolTipText("Insert First Number only");
		
		//Properties for button btnCube
		btnCube.setBounds(100, 217, 52, 31);
		btnSquareRt.setToolTipText("Insert First Number only");
		
		//Properties for button btnSquareRt
		btnSquareRt.setBounds(155, 217, 52, 31);
		btnSin.setToolTipText("Insert First Number only");
		
		//Properties for button btnSin
		btnSin.setBounds(209, 217, 57, 31);
		btnCos.setToolTipText("Insert First Number only");
		
		//Properties for button btnCos
		btnCos.setBounds(268, 217, 60, 31);

		
	}
	
	public void addComponents() {
		frame.getContentPane().add(textField);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(lblFirstNumber);
		frame.getContentPane().add(lblSecondNumber);
		frame.getContentPane().add(lblResult);
		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btnSubtract);
		frame.getContentPane().add(btnMultiplication);
		frame.getContentPane().add(btnDivision);
		frame.getContentPane().add(btnPercentage);
		frame.getContentPane().add(btnSquare);
		frame.getContentPane().add(btnCube);
		frame.getContentPane().add(btnSquareRt);
		frame.getContentPane().add(btnSin);
		frame.getContentPane().add(btnCos);
	}
	
	public void addActionListeners() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = cb.addition(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				textField.setText("");
				textField_1.setText("");
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = cb.subtraction(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = cb.multiplication(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = cb.division(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				if(calculation==-0.123456789) {
					lblResult.setText("Result: You can't divide by zero!");
				}else {
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.percentage(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+textField_1.getText()+"% of "+textField.getText()+", is: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.square(Double.parseDouble(textField.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.cube(Double.parseDouble(textField.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnSquareRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.squareRt(Double.parseDouble(textField.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.sin(Double.parseDouble(textField.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double calculation = ca.cos(Double.parseDouble(textField.getText()));
				String result = String.valueOf(calculation);
				lblResult.setText("Result: "+result);
				}catch(NumberFormatException except) {
					except.getMessage();
				}
			}
		});
		
	}
	
}
