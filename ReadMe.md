# Magical Arena Game

### Description
This is a simple turn-based combat simulation game where two players take turns attacking each other until one of them dies. Each player has health, strength, and attack attributes. The outcome of each attack and defense is determined by rolling dice.

# Game Rules #
1. Each player has health, strength, and attack attributes.
2. Players attack in turns.
3. The attacking player rolls an attacking dice (1-6) and the defending player rolls a defending dice (1-6).
4. The attack value multiplied by the dice roll determines the attack damage.
5. The strength value multiplied by the dice roll determines the defense value.
6. The difference between the attack damage and defense value reduces the defender's health.
7. The game ends when a player's health reaches 0.

## How to Run the game

1. compile the code: 
    open the terminal in any editor with the current project Magical-Arena. 
    ```sh
        javac -d bin src/arena/*.java
    ```

2. Run the game:
    a. In the terminal execute the following code  
    ```sh
        java -cp bin arena.Arena
    ```
    b. provide the required details for players


## How to Run Unit Cases
    1. compile the tests: 
    open the terminal in any editor with the current project Magical-Arena. 
    ```sh
        javac -cp junit-4.12.jar src/arena/*.java  -d bin test/arena/*.java
    ```
    2. Run the tests:
    In the terminal execute the following code  
    ```sh
        java -cp bin:junit-4.12.jar org.junit.runner.JUnitCore ArenaTest
    ```
     
## Design Overview

- `Player` class represents a player with health, strength, and attack attributes 
- `Arena` class handles the game dynamics between two players like from declaring playTurns, rolling dice feature and calculations 
