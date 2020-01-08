package Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.*;
import java.util.Timer;

public class Stopwatch {
	public static void main(String args[])
	{
			JFrame f=new JFrame("Stop watch");
			Time t1=new Time();
			
			
			JButton b1=new JButton("start");
			  b1.setBounds(50,100,95,30);  
			JButton b2=new JButton("stop");
			 b2.setBounds(200,100,95,30);  
			
			JLabel l2=new JLabel();
			  
			 l2.setBounds(20,20,95,30); 
			
		
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					long start=System.currentTimeMillis();
					t1.set(start);
								
				}
			});
	b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					long start=t1.get();
					long current=System.currentTimeMillis();
					long timeelapse=(current-start)/1000;
					l2.setText(""+timeelapse);
					
				}
			});	
			f.setVisible(true);
			f.add(b1);
			f.add(b2);
			
			f.add(l2);	
			
	}
}
class Time
{
	long time;
	public void set(long t)
	{
		time=t;
		
	}
	public long get()
	{
		return time;
		
	}


}


