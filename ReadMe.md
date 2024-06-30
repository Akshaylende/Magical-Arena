# Magical Arena Game

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


## Design Overview

- `Player` class represents a player with health, strength, and attack attributes 
- `Arena` class handles the game dynamics between two players like from declaring playTurns, rolling dice feature and calculations 
