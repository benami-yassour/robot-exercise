package ex.robot.test;

import org.junit.Test;

/**
 *  Setup:
 *     Robot location: unknown
 *     Balls: None
 *  Task: the robot should go to the right wall and back to starting location.
 */
public class Exercise003_ToWallAndBackFromRandom {

    @Test
    public void Run() throws Exception {
        // Initialize robot at a random location.
        Robot robot = new Robot(Robot.RANDOM_LOCATION);
        robot.draw();


        // Add your code here...



        ////////////////////////////////////
        // Verify task
        robot.draw();
        robot.verify();
    }
}
