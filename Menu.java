package snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JPanel implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JButton ng,st,sc,ex;
	int diff;
	
	Menu(){
		panel = new JPanel(new GridLayout(4,1));
		frame = new JFrame("Snake Game");
		ng = new JButton("New Game");
		st = new JButton("Settings");
		sc = new JButton("Scores");
		ex = new JButton("Exit");
	}
	
	public int get_dif() {
		return diff;
	}
	
	public void SetUpGUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setPreferredSize(new Dimension(500, 600));
		panel.add(ng);
		panel.add(st);
		panel.add(sc);
		panel.add(ex);
		ng.addActionListener(this);
		st.addActionListener(this);
		sc.addActionListener(this);
		ex.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder());
		frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    frame.setSize(700,800);
		frame.setVisible(true);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,50));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object b = e.getSource();
		if(b.equals(ng)) {
			new GameFrame();
		}
		else if(b.equals(st)) {
			//Difficulty --> Easy, Medium, Hard, Custom --> Changes settings by below things
			//Speed
			//Walls
			//Apple spawning?
			GamePanel gp = new GamePanel();
			JFrame set = new JFrame("Settings");
			JPanel pan = new JPanel(new GridLayout(1,4));
			JButton es = new JButton("Easy");
			JButton me = new JButton("Medium");
			JButton ha = new JButton("Hard");
			JButton cu = new JButton("Custom");
			
			//difficulty here
			es.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					gp.set_delay(175);
					gp.set_wall(false);
					diff = 1;
				}
			});
			me.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					gp.set_delay(125);
					gp.set_wall(true);
					diff = 2;
				}
			});
			ha.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					gp.set_delay(75);	
					gp.set_wall(true);
					diff = 3;
				}
			});
			cu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Not yet coded!");
					diff = 4;
				}
			});
			
			pan.setPreferredSize(new Dimension(500,500));
			pan.add(es);pan.add(me);pan.add(ha);pan.add(cu);
			pan.setBorder(BorderFactory.createEmptyBorder());
			pan.setBorder(BorderFactory.createLineBorder(Color.BLACK,100));
			pan.setVisible(true);
			
			//set.getContentPane().add(pan,BorderLayout.NORTH);
			set.add(pan);
			set.setSize(800,800);
			set.setResizable(false);
			set.setVisible(true);
			
		}
		else if(b.equals(sc)) {
			//Top 10 with names
			//Reset Score maybe
			// rank ---  name -- score --> in this format
		}
		else if(b.equals(ex)) {
			frame.dispose();
		}
		
	}
}
