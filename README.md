# Maze_Runner
## it is a game where the player has to run and to find his path throw the maze.  
 

### Design description :
 - We used MVC model the model contains of :
   - In the design we assume that each element is a cell except the player and the monsters EX : (wall cell, bomb cell , gift  cell....etc).
   - Each of these types has sub types EX: (health gift, Armor gift, bullets gift , ...etc ).
   - Each of these cell classes has an action function that can be applied on the player when he reach the cell and a draw function to be used in view.
 - The controller is game engine class that manage all the game using a game loop, include timer , compute score and manage all actions of the cells.
 - The view is done with Javafx that calls the draw functions in each cell and handle uploading images, choosing character for the player or etermining level of the game.

### Design patterns used:
  - Factory design pattern:
    Usd in creating cells, players, monsters, bombs, gifts , etc.
  - Flyweight design pattern:
    - It manage the factory as we create only one object from each cell type and use it with multiple references.
    - Used for images creation - just use on image object for each object in the game -.
  - Singleton design pattern :
    Used in creating a single player and in the game engine as there must be one game engine for the game.
  - Command design pattern :
    Used for moving the player, scroll the image and fire weapon.
  - Observer design pattern :
    - The game engine observe the player.
    - Game controller observe the timer.
    - Game controller observe the game engine.
    - The player observe the weapon.
  - State design pattern :
    Define states for the player as the functions differ depending on the state of the player, EX : if the player has armor   gift he can’t die.
  - Strategy design pattern :
    For the monsters movement as each monster has its way of tracing the player or shooting it.
  - Memento design pattern :
    For undo and redo by saving the state of the game after each action in an arraylist.
  - Iterator design pattern :
    Used to iterate on arraylists elements.

### screenshots : 
<img src="https://github.com/Magho/MazeRunnerGame/blob/master/images/1.png" width="400"> <img src="https://github.com/Magho/MazeRunnerGame/blob/master/images/2.png" width="400"> <img src="https://github.com/Magho/MazeRunnerGame/blob/master/images/3.png" width="400"> <img src="https://github.com/Magho/MazeRunnerGame/blob/master/images/4.png" width="400"> 


 ### Team members :
   * Mohamed Mashaal : https://github.com/MohamedMashaal
   * Yousef Ali : https://github.com/youssefAli11997
   * Muhamed Sharaf : https://github.com/muhammadSharaf
   * Mohamed el-Maghraby - Magho- : https://github.com/Magho
 
### User guide :
 
* Run the game from the jar.
* From settings select : 
  * Level of difficulty.
  * Player avatar.
  * Upload images if you want to use instead of default ones.
* Click start the game to play.
* Move by using ( W : up , D : right , A : left , S : down ).
* Fire using ‘X’ and determining the direction with (W,A,S,D). 
* Toggle weapon ( between sword and gun ) using ‘T’.
* Scroll the page by mouse or the buttons on the top left of the screen.
* You can show the high score from the main menu. 

 ### My role  :
   * made the design of the project.
   * implemented cells.gift & cells.bombs & cells.players & cells.weapons & cells.monsters packages.
   * implemented the command design pattern and buttons logic for controling the player.
   * Score computation.
   * factory design pattern in weapon & enemy & player.
   * Memento design pattern for undo and redo.
   * strategy design pattern for monster - not finished yet -.

### License 
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)
[LICENSE.md](https://github.com/Magho/MazeRunnerGame/blob/master/LICENSE.md)

## for more detailed explanation see [Report](https://github.com/Magho/MazeRunnerGame/blob/master/Project%20proposal.pdf)
