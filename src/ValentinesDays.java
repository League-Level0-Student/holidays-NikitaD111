import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDays {
public static void main(String[] args) {
	Robot Philly = new Robot();
	Robot Jeff = new Robot();
	Robot.setWindowImage("doggos.jpg");
	Jeff.hide();
	Philly.hide();
	Philly.setY(200);
	Jeff.setY(200);
	Philly.setAngle(0);
	Jeff.setAngle(0);
	Jeff.setSpeed(100);
	Philly.setSpeed(100);
	Philly.penDown();
	Jeff.penDown();
	Philly.setPenColor(Color.PINK);
	Jeff.setPenColor(Color.RED);
	for(int i = 0; i < 55; i++){
		Jeff.move(8);
		Jeff.turn(4);
		Philly.move(8);
		Philly.turn(-4);
	}
		for(int i2 = 0; i2 <31; i2++) {
		Philly.move(10);	
		Jeff.move(10);
		}

	Jeff.setX(750);
	Jeff.setAngle(-90);
	Philly.setX(50);
	Philly.setAngle(90);
		Philly.move(80);
		Philly.turn(180);
		Philly.move(40);
		Philly.turn(90);
		Philly.move(200);
		Philly.turn(90);
		Philly.move(40);
		Philly.turn(180);
		Philly.move(80);
	for (int i = 0; i<30; i++) {
		Jeff.move(3);
		Jeff.turn(3);
	}	
	Jeff.move(150);
	Jeff.setX(750);
	Jeff.setY(502);
	Jeff.setAngle(90);
	for (int i = 0; i < 30; i++) {
		Jeff.move(3);
		Jeff.turn(-3);
	}
	Jeff.move(150 );

	}	
}

