package ex.robot.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  Setup:
 *     Robot location: 0
 *     Balls: None
 *  Task: the robot should go to the right wall (10 steps) and back to location 0.
 */
public class Exercise001_ToWallAndBack {

    @Test
    public void Run() throws Exception {
        Robot robot = new Robot(0);
        robot.draw();
        robot.draw();
        robot.draw();
        robot.draw();
        robot.draw();
        robot.draw();
        robot.draw();
        robot.draw();



        // Add your code here...



        ////////////////////////////////////
        // Verify task
        robot.draw();
        robot.verify();
    }
}
