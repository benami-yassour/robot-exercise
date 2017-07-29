package ex.robot.test;

import org.junit.Test;

import java.util.Random;

/**
 *  Setup:
 *     Robot location: unknown
 *     Balls: Many balls at unknown locations
 *  Task: the robot should pick the ball put it near the right wall and go back to
 *     the starting location.
 */
public class Exercise005_PickManyBalls {

    @Test
    public void Run() throws Exception {
        // Initialize robot at a random location.
        Robot robot = new Robot(Robot.RANDOM_LOCATION);
        Random rand = new Random();
        int numberOfBalls = rand.nextInt(30);
        for (int i=0 ; i < numberOfBalls ; i++) {
            robot.addBall(-1);
        }
        robot.draw();



        // Add your code here...




        ////////////////////////////////////
        // Verify task
        robot.draw();
        robot.verify();
    }
}
