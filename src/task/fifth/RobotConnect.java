package task.fifth;

public class RobotConnect {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                return;

            } catch (RobotConnectionException e) {

                if (i == 2) throw e;

            } finally {
                try {
                    if (connection != null) connection.close();
                } catch (RobotConnectionException e) {

                }
            }
        }
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
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
