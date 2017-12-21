
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot rob  = new Robot();
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
        ohChristmasTree.drawOrnaments();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    

    	rob.hide();
    	rob.setSpeed(100);
    	rob.penDown();
    	rob.setPenColor(Color.GREEN);
    	rob.setPenWidth(50);
    	 for (int i = 0; i < 10; i++) {
    	    rob.setPenColor(Color.RED);
    	    rob.move(100);
rob.turn(144);
    	    	rob.setPenColor(Color.GREEN);

    		}

        // 1. Make a variable for turnAmount and set it to 175
int turnAmount = 175;

        // 2. Start the Robot facing to the right
rob.setAngle(90);

        // 5. Repeat steps 3 through 11, 11 times
for(int i = 0;i<13 ;i++) {

            // 3. Move the robot the width of the tree
    rob.move((int) treeWidth);
            // 4. Turn the robot the current turnAmount to the right
    rob.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
    treeWidth = treeWidth*scale;
            // 7. Move the robot the width of a tree again
    rob.move((int) treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
    rob.turn(-turnAmount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    treeWidth = treeWidth*scale;
            // 11. Decrease turnAmount by 1
    turnAmount = turnAmount - 1;
}

}
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
rob.move((int) (treeWidth/2));

        // 2. Change the robot so that it is pointing straight down
rob.setAngle(180);

        // 4. Set the pen width to the tree width divided by 10
rob.setPenWidth((int) (treeWidth/10));

        // 5. Change the color of the line the robot draws to brown
rob.setPenColor(187,102,000);

        // 3. Move the robot a quarter the tree width
rob.move((int) (treeWidth/4));

    }
    
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    
    }
void drawOrnaments() {
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(100, 123);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(200, 400);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(324, 350);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(703, 400);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(178, 309);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(400, 56);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(354, 286);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(456, 237);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(542, 234);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(456, 123);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(450, 124);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(800, 500);
		rob.move(5);
		rob.turn(144);
	}
	for (int i = 0; i <11; i++) {
		rob.setPenColor(Color.CYAN);
		rob.moveTo(756, 400);
		rob.move(5);
		rob.turn(144);
	}
	
	
	
}
}



