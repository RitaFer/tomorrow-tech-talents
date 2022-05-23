<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/TomorrowTechTalentsLogo.svg" style="width: 300%, height: auto, margin-left: auto, margin-left: auto" />

### Create the Player class described in the “diagram” below:

<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/oop-stock-images/2022-05-09_19h38_53.png" />

#### a)
Register/Instantiate at least one complete team 11 players.

#### b)
Create a method that checks the game condition, that is, a boolean method that will return true if the player is able to play and false if the player is suspended. Note that a player is suspended for 3 yellow cards or when receiving a red card.

#### c)
In another class, create the main method, which registers the players and at the end will print the team list together with the information of who is able to play, as shown in the figure below. (Override toString() method)

<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/oop-stock-images/2022-05-09_19h38_44.png" />

#### d)

Create new methods in the Player class:

- applyYellowCard(int quantity): void - Applies the number of cards, informed to the player, additionally it can make a player suspended.

- applyRedCard(): void - Applies a red card to the player, makes a player suspended.

- fulfillSuspencao(): void – This method will reset the amount of
cards and make the player able to play

- sufferInjury(): void – This method will randomly generate an injury to the player. The severity of the injury will be reflected in a reduction in the quality of the player, the more serious the greater the reduction in quality. Create a scale of reduction from a minimum of 1 point to a maximum of 15% of the player's total quality. Note that the quality can never be negative. The table below can be used as a reference:

<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/oop-stock-images/2022-05-09_19h38_29.png" />

- runTraining(): void – Like the previous method, this method will increase the player's quality randomly by a number between 1 and 3. Note that you can only run 1 training before each match (you must add an attribute in the class to be able to control this information).
