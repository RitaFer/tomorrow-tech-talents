<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/TomorrowTechTalentsLogo.svg" style="width: 300%, height: auto, margin-left: auto, margin-left: auto" />

<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/oop-stock-images/2022-05-09_19h38_53.png" />

You must implement a simplified system of a card game, with no game operation required, but implementing some rules and components, such as cards and boards.

### Implementation Rules

#### Cards:
Every card has:
 - A method to see the name.
 - A method to see the type.
 - A method to see the cost.

#### Attack Card:
Every attack card has:
 - A method to see power.
 - A method to see resistance.

#### Special Attack Cards:
In addition to all **Card** and **Attack Card** behaviors a method to display effects.

#### Board:
All boards have the methods:
 - To insert a deck.
 - Receive an attack card and check if it can be played or not.
 - Returns if a player wins.

#### Board Versus:
 - It has two decks of 50 cards and inserts both at the beginning of the game.
 - 5 attack cards and 2 special attack cards fit on each side of the field..
 - Wins when the opponent's health reaches 0.

#### Party Board:
 - It has five decks of 80 cards and inserts five at the beginning of the game.
 - A total of 34 attack cards fit on the field, adding up to all players.
 - Wins when all opponents' health reaches 0.

## Final Tips

 - Create as many entities as you want to facilitate the resolution of the exercise.
 - Try to pay attention and think carefully about when abstract classes or interfaces should be implemented.
 - Try to be declarative about the names of methods, classes, interfaces and variables.
 - Do not keep the doubts to yourself, share them with the teachers and the class, sometimes more colleagues have the same problem, or it is an issue that was not initially thought of by the teachers.
 - Take advantage of the exercise to fix the concepts taught in class.
