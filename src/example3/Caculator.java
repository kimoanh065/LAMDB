package example3;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Caculator extends JFrame {
	int number1, number2;
	String operator;
	double sum;

	public Caculator() {
		super("Máy tính");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 JPanel pn = new JPanel();
   	 pn.setLayout(new BorderLayout());
   	 JPanel pnNorth = new JPanel();
   	 pnNorth.setLayout(new FlowLayout());
   	 pnNorth.setSize(300,300);
   	 JPanel pnCenter = new JPanel();
   	 pnCenter.setLayout(new GridLayout(4,4));
   	 pn.add(pnNorth, BorderLayout.NORTH);
   	 pn.add(pnCenter, BorderLayout.CENTER);
   	 JTextField txtfield = new JTextField(30);
   	 pnNorth.add(txtfield);
	 JButton button1 = new JButton("1");
	 JButton button2 = new JButton("2");
	 JButton button3 = new JButton("3");
	 JButton button4 = new JButton("4");
	 JButton button5 = new JButton("5");
	 JButton button6 = new JButton("6");
	 JButton button7 = new JButton("7");
	 JButton button8 = new JButton("8");
	 JButton button9 = new JButton("9");
	 JButton button0 = new JButton("0");
	 JButton buttonplus = new JButton("+");
	 JButton buttondiv = new JButton("÷");
	 JButton buttonmul = new JButton("x");
	 JButton buttonsub = new JButton("-");
	 JButton buttonmod = new JButton("%");
	 JButton buttonequal = new JButton("=");
	 pnCenter.add(button1);
	 pnCenter.add(button2);
	 pnCenter.add(button3);
	 pnCenter.add(buttonplus);
	 pnCenter.add(button4);
	 pnCenter.add(button5);
	 pnCenter.add(button6);
	 pnCenter.add(buttonsub);
	 pnCenter.add(button7);
	 pnCenter.add(button8);
	 pnCenter.add(button9);
	 pnCenter.add(buttonmul);
	 pnCenter.add(button0);
	 pnCenter.add(buttonequal);
	 pnCenter.add(buttonmod);
	 pnCenter.add(buttondiv);

	 button1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button1.getText());
		}
	 });
	 button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = txtfield.getText();

				txtfield.setText(text + button2.getText());
			}
		 });
	 button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = txtfield.getText();
				txtfield.setText(text + button3.getText());
			}
		 });
	 button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = txtfield.getText();
				txtfield.setText(text + button4.getText());
			}
	 });
	 button5.addActionListener(new ActionListener() {
	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button5.getText());
		}
	 });
	 button6.addActionListener(new ActionListener() {
	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button6.getText());
		}
	 });
	 button7.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button7.getText());
		}
	 });
	 button8.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button8.getText());
		}
	 });
	 button9.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button9.getText());
		}
	 });
	 button0.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = txtfield.getText();
			txtfield.setText(text + button0.getText());
		}
	 });
 buttonplus.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			number1 = Integer.parseInt(txtfield.getText());
			operator = "+";
			txtfield.setText("");
		}
	 });
 	buttonsub.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			number1 = Integer.parseInt(txtfield.getText());
			operator = "-";
			txtfield.setText("");
		}
	});
 	buttondiv.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			number1 = Integer.parseInt(txtfield.getText());
			operator = "/";
			txtfield.setText("");
		}
	});
 	buttonmul.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			number1 = Integer.parseInt(txtfield.getText());
			operator = "*";
			txtfield.setText("");
		}
	});
 //buttonec.addActionListener(new ActionListener() {
		
		//@Override
		//public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		   //number1 = 0;
		   //number2 = 0;
		   //operator = "";
		   //sum = 0;
		   //txtfield.setText("");
		//}
	//});
	buttonequal.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//TODO Auto-generated method stub
			number2 = Integer.parseInt(txtfield.getText());
			 
			switch(operator) {
			case "+":
				sum = number1 + number2;
				txtfield.setText(""+sum);
				break;
			case "-":
				sum = number1 - number2;
				txtfield.setText(""+sum);
				break;
			case "*":
				sum = number1 * number2;
				txtfield.setText(""+sum);
				break;
			case "/":
				sum = number1 / number2;
				txtfield.setText(""+sum);
				break;
			}
		}
	});
		   
 
	Container con = getContentPane();
	 con.add(pn);
 
	}
	public static void main(String[] args) {
		Caculator gui = new Caculator();
		gui.setSize(300,300);
		gui.setLocationRelativeTo(null);
		gui.setVisible(true);
		}
}