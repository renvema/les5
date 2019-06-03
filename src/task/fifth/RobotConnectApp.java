package task.fifth;

public class RobotConnectApp {
    public static void main(String[] args) {
        RobotConnectionManager robotConnection = null;
        moveRobot(robotConnection, 3, 2);
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
