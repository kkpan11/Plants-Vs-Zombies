# Plants-Vs-Zombies 🌱🌵 Vs 🧟‍♂️🧟‍♀️
## Details
**Created by:
[Bhavya Chopra](https://www.github.com/BhavyaC16) and [Sonali Singhal](https://www.github.com/SonaliSinghal)**

This is a clone of the strategy video game, [Plants vs. Zombies](https://en.wikipedia.org/wiki/Plants_vs._Zombies), originally developed by PopCap Games.

A working demo of the game can be seen [here](https://www.youtube.com/watch?v=AgMRkRLPeFU).

Made as a part of project in Advanced Programming course at IIIT-Delhi.

Uses Java and JavaFx.

## Features
- 5 Levels with increasing difficulties
- 2 Themes (Night Mode and Day Mode)
- Plants Available: Sunflower, Pea Shooter, Cherry Bomb, Walnut, Repeater, Jalapeno
- Zombies Available: Normal Zombie, Conehead Zombie and Buckethead Zombie
- Almanac: Displays details and attack methods and power of each zombie and plant
- Shovel: Tool to shovel plants out of the grid
- Save Game and Restart Game options: User can save multiple game states, and reload them, or delete game progress
- Cool sound effects for all lawn interactions
- Lots of fun :P

## Implementation
- Navigation is via FXML files
- __Load Game__ menu is used to load multiple saved states of the game. Everytime a user saves a game, the game state is given an id, which is displayed as Game_ID along with the level on which the game was saved. 'Delete all progress' removes all the saved game states.
- __Level Menu__ can be used for starting a new game from the unlocked levels. A user cannot play a new level if they haven't won the all previous levels.
- __Exit Game__ saves all the progress and exits the game.
- __In Game Menu__: Allows the user to save the game, restart the game or exit to main menu.
- Levels become harder as the user progresses through the game. The cone and bucket zombies start appearing in subsequent levels, their frequency also increases. 
- Different menus on winning and losing a game. Winning tells the user about the new plant unlock and losing menu gives the message “Zombies ate your brains”
- After placing a plant, a plant is locked for sometime before it can be planted again.
- The __shovel__ can be used to remove a plant from the lawn.
- Sound effects have been added for all interactions on the lawn to enhance the experience.
- The users can also choose between the day and the night mode. Unlike the day mode, no sun tokens fall from the sky in the night mode, and sunflowers are the only source of sun tokens.

## Design Patterns
1. Singleton: For the database and for shovel feature, as we need only one reference through out the game.
2. Iterator - To ensure that Plant, Zombie and Lawnmower lists are accessed in a synchronized way.
3. Facade for menu based implementation


## Screenshots from the game
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/1.png)
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/4.png)
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/Arena.png)
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/2.png)
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/5.png)
![alt_text](https://github.com/BhavyaC16/Plants-Vs-Zombies/blob/master/GameplayScreenshots/3.png)

## How To play
### Build & Run with IntelliJ
To play the game, the following steps can be followed:
1. Clone this repository using the command: `git clone https://github.com/kkpan11/Plants-Vs-Zombies.git`
2. Download the OpenJFX 17 or above version, you can choose one of the following distributions(https://whichjdk.com/):
   - [Gluon](https://gluonhq.com/products/javafx/)
   - [BellSoft](https://bell-sw.com/pages/downloads/) 
   - [Azul](https://www.azul.com/downloads/?package=jdk)

   Or you can just install with [SDKMAN](https://sdkman.io/jdks)
   ```shell
   sdk install java 17.0.5.fx-librca
   ```
3. Configure the [Project Structure](https://www.jetbrains.com/help/idea/project-settings-and-structure.html) settings on IntelliJ to use downloaded SDK as Project SDK and Module SDK.
   - Steps: Go to **File** → **Project Structure** -> **Project Settings** -> *Project* and *Modules*

4. **Build** & **Run** the project on `IntelliJ` and enjoy to play the game

**PS.**
Encountered issues when I try to run. These might be helpful.
   - [Java FX Modular Application, Module not found (Java 17, Intellij)](https://stackoverflow.com/questions/71468784/java-fx-modular-application-module-not-found-java-17-intellij)
   - [Intellij 2021.3.2, JavaFX Maven project not resolving dependencies correctly](https://stackoverflow.com/questions/71526616/intellij-2021-3-2-javafx-maven-project-not-resolving-dependencies-correctly)
   - [JavaFX Font not being rendered correctly](https://stackoverflow.com/questions/67893273/javafx-font-not-being-rendered-correctly)
   - [When running the program in netBeans the font looks extremely weird](https://stackoverflow.com/questions/66891857/when-running-the-program-in-netbeans-the-font-looks-extremely-weird)


## Code and assets
Path to code: `PlantVsZombies/src/sample` <br>
Path to Images and sounds: `PlantVsZombies/src/sample/assets`

## License
### GNU General Public License v3.0
You may copy, distribute and modify the software as long as you track changes/dates in source files. Any modifications to or software including (via compiler) GPL-licensed code must also be made available under the GPL along with build & install instructions.
