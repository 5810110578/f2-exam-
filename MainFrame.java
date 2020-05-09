import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
	private JTextField tf;
	public MainFrame(){
		super("Number");

		JPanel number_panel = new JPanel();
		ActionListener ln = new NumberBtnListener();
		JButton btn = new JButton("OK" );
		btn.setActionCommand("OK" );
		btn.addActionListener(ln);
		number_panel.add(btn);
		
		
		tf = new JTextField();
		tf.setFont(tf.getFont().deriveFont(30.0f));

		this.getContentPane().setLayout(new BorderLayout());
		this.add(btn, BorderLayout.PAGE_END);
		this.add(tf, BorderLayout.PAGE_START);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 250);
		this.setVisible(true);
	}

	class NumberBtnListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			new MainTest();//test function
			new KeyFinder();
			tf.setText(tf.getText() + event.getActionCommand());
		}
	}

	public static void main(String[] args){
		new MainFrame();
	}
}