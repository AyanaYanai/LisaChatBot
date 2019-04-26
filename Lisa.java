import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lisa extends JFrame {
	
	private JTextField textbox = new JTextField();
	
	private JTextArea chat = new JTextArea();
	
	public Lisa() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(600,600);
		this.setResizable(false);
		this.setTitle("Lisathe Chatbot");
		
		
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
				chat.append(text);

			}
			
		});
	}
	
	
	public static void main (String[] args) {
		new Lisa();
	}
}

