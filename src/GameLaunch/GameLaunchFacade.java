package gamelaunch;

public class GameLaunchFacade {

    private final SystemChecker systemChecker;
    private final GameUpdater gameUpdater;
    private final GraphicsManager graphicsManager;
    private final AudioManager audioManager;
    private final GameEngine gameEngine;

    public GameLaunchFacade() {
        systemChecker = new SystemChecker();
        gameUpdater = new GameUpdater();
        graphicsManager = new GraphicsManager();
        audioManager = new AudioManager();
        gameEngine = new GameEngine();
    }

    public boolean launchGame(String gameName) {

        if (gameName == null || gameName.isBlank()) {
            System.out.println("Launch failed: game name cannot be empty.");
            return false;
        }

        System.out.println("Preparing to launch " + gameName + "...");

        if (!systemChecker.checkRequirements(gameName)) {
            System.out.println("Launch cancelled: system requirements were not met.");
            return false;
        }

        if (!gameUpdater.updateGame(gameName)) {
            System.out.println("Launch cancelled: the game could not be updated.");
            return false;
        }

        graphicsManager.configureGraphics();
        audioManager.configureAudio();
        gameEngine.startGame(gameName);

        System.out.println("Game launch completed successfully.");
        return true;
    }
}
