package demo01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
		frame.setTitle("Hello world");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 200, 400, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.setContentPane(panel);
		
		JButton button = new JButton();
		button.setText("Load data");
		button.setBounds(20, 50, 150, 20);
		button.addActionListener((e) -> {
			Thread childThread = new Thread(() -> {
				for(int i = 1; i <= 10; i++) {
					System.out.println("Loading ... (" + 10 * i + "%)");
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			});
			childThread.start();
		});
		panel.add(button);
		
		frame.setVisible(true);

    }

}
