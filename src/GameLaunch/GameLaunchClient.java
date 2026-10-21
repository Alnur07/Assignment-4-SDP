package gamelaunch;

public class GameLaunchClient {

    public static void main(String[] args) {

        GameLaunchFacade gameLauncher = new GameLaunchFacade();

        gameLauncher.launchGame("Cyberpunk 2077");
    }
}
