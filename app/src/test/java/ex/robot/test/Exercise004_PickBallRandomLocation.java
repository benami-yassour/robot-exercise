package ex.robot.test;

import org.junit.Test;

/**
 *  Setup:
 *     Robot location: unknown
 *     Balls: One ball at unknown location
 *  Task: the robot should pick the ball put it near the right wall and go back to
 *     the starting location.
 */
public class Exercise004_PickBallRandomLocation {

    @Test
    public void Run() throws Exception {
        // Initialize robot at a random location.
        Robot robot = new Robot(Robot.RANDOM_LOCATION);
        robot.addBall(-1);
        robot.draw();



        // Add your code here...




        ////////////////////////////////////
        // Verify task
        robot.draw();
        robot.verify();
    }
}
