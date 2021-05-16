package simplecalculator;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	double firstnum,secondnum,result;
	String operations;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 337, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setForeground(Color.WHITE);
		txtDisplay.setBackground(Color.GREEN);
		txtDisplay.setBounds(10, 10, 300, 46);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
//		button number 7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 64, 50, 49);
		frame.getContentPane().add(btn7);

//		button number 8
		JButton Btn8 = new JButton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn8.setBounds(65, 64, 50, 50);
		frame.getContentPane().add(Btn8);
		
//		button number 9
		JButton Btn9 = new JButton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn9.setBounds(120, 64, 50, 50);
		frame.getContentPane().add(Btn9);
		
//		button division operation
		JButton Btndiv = new JButton("/");
		Btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
				
			}
		});
		Btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btndiv.setBounds(186, 247, 50, 50);
		frame.getContentPane().add(Btndiv);
		
//		button number 4
		JButton Btn4 = new JButton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText()+Btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn4.setBounds(10, 125, 50, 50);
		frame.getContentPane().add(Btn4);
		
//		button number 5
		JButton Btn5 = new JButton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn5.setBounds(65, 125, 50, 50);
		frame.getContentPane().add(Btn5);
		
//		button number 6
		JButton Btn6 = new JButton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn6.setBounds(120, 125, 50, 50);
		frame.getContentPane().add(Btn6);
		
//		button multiply operation
		JButton Btnmul = new JButton("*");
		Btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		Btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btnmul.setBounds(186, 125, 50, 50);
		frame.getContentPane().add(Btnmul);
		
		
//		button number 1
		JButton Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn1.setBounds(10, 186, 50, 50);
		frame.getContentPane().add(Btn1);
		
//		button number 2
		JButton Btn2 = new JButton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn2.setBounds(65, 186, 50, 50);
		frame.getContentPane().add(Btn2);
		
//		button number 3
		JButton Btn3 = new JButton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+Btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Btn3.setBounds(120, 186, 50, 50);
		frame.getContentPane().add(Btn3);
		
//		button minus operation
		JButton BtnMin = new JButton("-");
		BtnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		BtnMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnMin.setBounds(186, 186, 50, 50);
		frame.getContentPane().add(BtnMin);
		
//		button number 0
		JButton BtnZero = new JButton("0");
		BtnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+BtnZero.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		BtnZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnZero.setBounds(10, 247, 50, 50);
		frame.getContentPane().add(BtnZero);
		
//		button number point value
		JButton BtnDot = new JButton(".");
		BtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! txtDisplay.getText().contains("."))
		          {
		          txtDisplay.setText(txtDisplay.getText() + BtnDot.getText());
		          }
			}
		});
		BtnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnDot.setBounds(65, 247, 50, 50);
		frame.getContentPane().add(BtnDot);
		
//		button plus operation
		JButton BtnPlus = new JButton("+");
		BtnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		BtnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnPlus.setBounds(120, 247, 50, 50);
		frame.getContentPane().add(BtnPlus);
		
//		button go back operation
		JButton btnbkspace = new JButton("<--");
		btnbkspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace =null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace= strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnbkspace.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnbkspace.setBounds(243, 64, 67, 50);
		frame.getContentPane().add(btnbkspace);
		
//		button percentage operation
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops =ops*(0.01);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnper.setBounds(243, 125, 67, 50);
		frame.getContentPane().add(btnper);
		
//		button equal operation
		JButton BtnEqual = new JButton("=");
		BtnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
			
			}
		});
		BtnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		BtnEqual.setBounds(246, 247, 64, 50);
		frame.getContentPane().add(BtnEqual);
		
//		button both positive or negative operation
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops *(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPM.setBounds(246, 186, 67, 50);
		frame.getContentPane().add(btnPM);
		
	
		
		
		
		
//		button blank(empty) the text screen 
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(186, 64, 50, 50);
		frame.getContentPane().add(btnC);
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
