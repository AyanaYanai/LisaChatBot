import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.color.*;
import javax.swing.*;

public class LisaRunner extends JFrame {
	
	private JTextField textbox = new JTextField();
	private Lisa lisa;
	private JTextArea chat = new JTextArea();
	private ImageIcon bubble;

	public LisaRunner() {
		lisa= new Lisa(450,450);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(600,600);
		this.setResizable(false);
		this.setTitle("Chatbot Runner");
		JPanel panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponents(g);
				lisa.draw(g,450,450);
				//g.drawImage(getImage("bubble.png"), 500, 200, 10, 5, null);
			}
		};
		textbox.setLocation(10, 540);
		textbox.setSize(580, 30);
		
		chat.setLocation(10, 50);
		chat.setSize(300,300);
		
		this.add(textbox);
		this.add(chat);
		
		
		textbox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textbox.getText();
				/*	public final static String PATH_PREFIX = "res/images/";
				protected  Image getImage(String fn) {
					Image img = null;
					fn = PATH_PREFIX+fn;
					try {
						
						img = ImageIO.read(this.getClass().getResource(fn));

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return img;
				}
				*/		chat.append("You: " + text + "\n");
				textbox.setText("");

			}
			
		});
		}
	

	public static void main (String[] args) {
		new LisaRunner();
	}
	
	
	/*	public final static String PATH_PREFIX = "res/images/";
	protected  Image getImage(String fn) {
		Image img = null;
		fn = PATH_PREFIX+fn;
		try {
			
			img = ImageIO.read(this.getClass().getResource(fn));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	*/
	
}
