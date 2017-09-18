package edu.truman.emroskia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen {
	private JFrame frame;
	private JPanel panel;
	private JPanel buttonPanel;
	private JButton start; 
	private Shape sq;
	
	public Screen()
	{
		sq = new Square(15, 15, 15);
		frame = new JFrame();
		panel = new JPanel();
		buttonPanel = new JPanel();
		
		frame.setTitle("Shape Count");
		frame.setSize(650, 450);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setSize(600, 400); 
		panel.setLayout(new BorderLayout());
		
		frame.setBackground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		buttonPanel.setBackground(Color.BLACK);
		
		frame.add(sq);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
		
		public void addButton()
		{
			start = new JButton();
			buttonPanel.add(start);
			
			start.setText("Start");
			
//			start.addActionListener(new
//					ActionListener()
//					{
//
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							// TODO Auto-generated method stub
//							
//						}
//				
//					});

		}
	
	public static void main(String [] args)
	{
		Screen game = new Screen();
		game.addButton();
		
		}
		
		
}
