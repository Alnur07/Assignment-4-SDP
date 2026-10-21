# Game Launch System — Facade Pattern

## Overview

**Game Launch System** is a Java project that demonstrates the **Facade structural design pattern**.

The system simplifies the process of launching a computer game by providing a single interface that coordinates several subsystem classes. Instead of interacting with each subsystem separately, the client calls one method: `launchGame()`.

## Objectives

- Implement the Facade design pattern in Java.
- Simplify interaction with multiple subsystem classes.
- Separate responsibilities between classes.
- Apply Clean Code principles.
- Demonstrate how a facade coordinates a sequence of operations.

## Project Structure

```text
src/
└── gamelaunch/
    ├── SystemChecker.java
    ├── GameUpdater.java
    ├── GraphicsManager.java
    ├── AudioManager.java
    ├── GameEngine.java
    ├── GameLaunchFacade.java
    └── GameLaunchClient.java
```

## Subsystem Classes

| Class | Responsibility |
|---|---|
| `SystemChecker` | Checks whether the system requirements are satisfied. |
| `GameUpdater` | Simulates checking for game updates. |
| `GraphicsManager` | Simulates configuring graphics settings. |
| `AudioManager` | Simulates configuring audio settings. |
| `GameEngine` | Simulates starting the game engine. |

## Facade

`GameLaunchFacade` provides a simplified interface through the `launchGame(String gameName)` method.

It coordinates the launch sequence:

1. Validates the game name.
2. Checks system requirements.
3. Checks for game updates.
4. Configures graphics.
5. Configures audio.
6. Starts the game engine.
7. Reports whether the launch process completed successfully.

If the game name is invalid, the system requirements are not satisfied, or the update process fails, the facade stops the launch sequence.

## Client

`GameLaunchClient` contains the `main()` method and demonstrates how to use the system.

The client interacts only with `GameLaunchFacade` and does not directly create or call the subsystem classes.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure the project uses a compatible JDK.
3. Open `GameLaunchClient.java`.
4. Run the `main()` method.
5. Check the console output to see the simulated game launch sequence.

## Example Output

```text
Preparing to launch Cyberpunk 2077...
Checking system requirements for Cyberpunk 2077...
System requirements are satisfied.
Checking for updates for Cyberpunk 2077...
Game is up to date.
Configuring graphics: Full HD, high quality.
Configuring audio: default output device, volume 70%.
Starting game engine...
Cyberpunk 2077 is now running!
Game launch completed successfully.
```

## Clean Code Principles

1. **Meaningful Names:** Classes and methods use descriptive names that communicate their purpose.
2. **Single Responsibility Principle:** Each subsystem class has one primary responsibility.
3. **Encapsulation:** The facade keeps its subsystem references private.
4. **Separation of Concerns:** The facade coordinates operations while subsystem classes perform their own tasks.
5. **Error Handling:** The facade validates the game name and stops the launch when required checks fail.
6. **Small Public API:** The client uses a single `launchGame()` method instead of coordinating multiple subsystem calls.

## Design Pattern Benefits

- Reduces complexity for the client.
- Hides subsystem coordination details.
- Provides a simple and clear interface.
- Keeps subsystem classes independent of the facade.
- Allows advanced clients to use subsystem classes directly when necessary.



