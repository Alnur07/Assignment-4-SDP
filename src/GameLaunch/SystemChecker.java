package gamelaunch;

public class SystemChecker {

    public boolean checkRequirements(String gameName) {
        System.out.println("Checking system requirements for " + gameName + "...");

        boolean requirementsMet = true;

        if (requirementsMet) {
            System.out.println("System requirements are satisfied.");
        } else {
            System.out.println("System requirements are not satisfied.");
        }

        return requirementsMet;
    }
}
