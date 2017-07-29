package ex.robot.test;

import java.util.Random;

/**
 * Created by benami on 11/3/16.
 */
public class Robot {
    public static final int RANDOM_LOCATION = -1;

    private static final int WALL_LOCATION = 11;
    private int location;
    private int startLocation;
    private boolean nearWall = false;
    private int[] balls;
    private boolean holdingBall = false;

    public Robot(int location) {
        if (location < 0 || location > WALL_LOCATION) {
            location = getRandomLocation();
        }
        this.location = location;
        startLocation = location;
        balls = new int[WALL_LOCATION];
    }

    // Adds a ball to the board.
    public void addBall(int location) throws Exception {
        if (location < 0 || location > WALL_LOCATION) {
            location = getRandomLocation();
        }
        balls[location]++;
    }

    // Moves one step forward.
    public void stepForward() throws Exception {
        location++;
        updateNewLocation();
    }

    // Moves one step backword.
    public void stepBackword() throws Exception {
        location--;
        updateNewLocation();
    }

    // Returns true if the robot is next left wall (location 0).
    public boolean senseLeftWall() {
        return location == 0;
    }

    // Returns true if the robot is next right wall (location 0).
    public boolean senseRightWall() {
        return location == WALL_LOCATION - 1;
    }

    // Returns true if the robot is near the ball (same location).
    public boolean senseBall() {
        return balls[location] > 0;
    }

    // Pick up the ball.
    public void pickBall() throws Exception {
        if (balls[location] <= 0) {
            throw new Exception("There is no ball here!!!");
        }
        holdingBall = true;
        balls[location]--;
    }

    // Drop the ball.
    public void dropBall() throws Exception {
        holdingBall = false;
        balls[location]++;
    }

    // Draws the robot.
    public void draw() {
        System.out.print("###");
        for (int i=0; i < WALL_LOCATION ; i++) {
            if (i == location) {
                System.out.print("R");
            } else if (balls[i] > 0) {
                System.out.print(Integer.toString(balls[i]));
            } else {
                System.out.print("-");
            }
        }
        System.out.println("###");
    }

    public void verify() {
        if (!verifyAllBallsNearWall()) {
            System.out.println("Task failed!!!");
            System.out.println("Not all balls near right wall.");
            return;
        }
        if (holdingBall) {
            System.out.println("Task failed!!!");
            System.out.println("The robot is still holding a ball.");
            return;
        }
        if (!verifyStartLocation()) {
            System.out.println("Task failed!!!");
            System.out.println("The robot is not at the stating location.");
            return;
        }
        if (!verifyRobotWasNearFarWall()) {
            System.out.println("Task failed!!!");
            System.out.println("The robot didn't get to the right wall.");
            return;
        }
        System.out.println("Task Succeeded!");
        System.out.println("Well Done!!!");
    }

    //////////////////////////////////////////////////////////////////
    // Private functions.

    private void updateNewLocation() throws Exception {
        if (location == WALL_LOCATION || location < 0) {
            throw new Exception("Hit the wall!!!");
        }
        if (location == WALL_LOCATION - 1) {
            nearWall = true;
        }
    }

    private int getRandomLocation() {
        Random rand = new Random();
        return rand.nextInt(WALL_LOCATION);
    }

    private boolean verifyRobotWasNearFarWall() {
        return nearWall;
    }

    private boolean verifyStartLocation() {
        return location == startLocation;
    }

    private boolean verifyAllBallsNearWall() {
        for (int i=0 ; i < WALL_LOCATION - 1; i++) {
            if (balls[i] > 0) {
                return false;
            }
        }
        return true;
    }


}
