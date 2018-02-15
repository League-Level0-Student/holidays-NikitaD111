import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
public static void main(String[] args) {
	Robot l = new Robot();
	Robot r = new Robot();
	Robot.setWindowImage("corgo.jpg");
	r.hide();
	l.hide();
	l.setY(200);
	r.setY(200);
	l.setAngle(0);
	r.setAngle(0);
	r.setSpeed(100);
	l.setSpeed(100);
	l.penDown();
	r.penDown();
	l.setPenColor(Color.PINK);
	r.setPenColor(Color.RED);
	for(int i = 0; i < 55; i++){
		r.move(8);
		r.turn(4);
		l.move(8);
		l.turn(-4);
	}
		for(int i2 = 0; i2 <32; i2++) {
		l.move(10);	
		r.move(10);
		}
	String h = JOptionPane.showInputDialog("собака пожалуйста, корги ");
	if(h == "yes") {
		JOptionPane.showMessageDialog(null,"Finally");
		
	}
	if(h == "no") {
		JOptionPane.showMessageDialog(null,"no");
		
	}
	}
}

