package Logic;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Random;
public class TicTactoe implements ActionListener {
	
	int j=0;
	
	JButton Button[]=new JButton[9];
	public static void main(String args[])
	
	{
		TicTactoe t=new TicTactoe();
		JFrame f=new JFrame("TicTacToe");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,3));
	
		t.initialize(t.Button,p);
	
			
		f.add(p);
		f.setVisible(true);
		f.setBounds(50,50,340,482);
	}
	public static int random(int min,int max)
	{
			Random r=new Random();
			int no=min+r.nextInt(max-min);
			return no;
	}
	
	public void initialize(JButton[] button,JPanel p)
	
	{
		for(int i=0;i<=8;i++)
		{	
			button[i]=new JButton(""+i);
			button[i].addActionListener(this);
			p.add(button[i]);
			p.setLayout(new GridLayout(3,3));
		}	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
			
		JButton buttonClick=(JButton)arg0.getSource();
		
		
		if(buttonClick.getText()!="X" ||buttonClick.getText()!="O")
		{
		buttonClick.setText("X");
		buttonClick.setEnabled(false);
		j=j+1;
		}
		int i=0;
		Horizontalcheck();
		Verticalcheck();
		Digonalcheck();
		while(i!=1 && j<9)
		{
			int no=random(0, 8);
			JOptionPane.showMessageDialog(null, no, "turn message", 0 );
			if(Button[no].getText()!="X" && Button[no].getText()!="O")
			
			{
			
				Button[no].setText("0");
				Button[no].setEnabled(false);
				i=1;
				j=j+1;
			}
		}	
		
	}
	
	public void Horizontalcheck()
	{
		if(Button[0].getText()==Button[1].getText() && Button[1].getText()==Button[2].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
		if(Button[3].getText()==Button[4].getText() && Button[4].getText()==Button[5].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
		if(Button[6].getText()==Button[7].getText() && Button[7].getText()==Button[8].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
	}
	public void Verticalcheck()
	{
		if(Button[0].getText()==Button[3].getText() && Button[3].getText()==Button[6].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
		if(Button[1].getText()==Button[4].getText() && Button[4].getText()==Button[7].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
		if(Button[2].getText()==Button[5].getText() && Button[5].getText()==Button[8].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
	}
	public void Digonalcheck()
	{
		if(Button[0].getText()==Button[4].getText() && Button[4].getText()==Button[8].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
		if(Button[2].getText()==Button[4].getText() && Button[4].getText()==Button[6].getText())
		{
			if(Button[0].getText()=="X")
			{
				JOptionPane.showMessageDialog(null, "Player 1 win", "turn message", 0 );
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Player 2 win", "turn message", 0 );
			}
		}
	}
	

}
