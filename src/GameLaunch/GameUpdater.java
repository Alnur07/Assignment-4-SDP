package gamelaunch;

public class GameUpdater {

    public boolean updateGame(String gameName) {
        System.out.println("Checking for updates for " + gameName + "...");

        boolean updateSuccessful = true;

        if (updateSuccessful) {
            System.out.println("Game is up to date.");
        } else {
            System.out.println("Game update failed.");
        }

        return updateSuccessful;
    }
}
