package ex.robot.test;

import org.junit.Test;

/**
 *  Setup:
 *     Robot location: 0
 *     Balls: One ball at location 5
 *  Task: the robot should pick the ball put it near right wall (location 10) and go back to
 *     location 0.
 */
public class Exercise002_PickBall {

    @Test
    public void Run() throws Exception {
        Robot robot = new Robot(0);
        robot.addBall(5);
        robot.draw();



        // Add your code here...



        ////////////////////////////////////
        // Verify task
        robot.draw();
        robot.verify();
    }
}
