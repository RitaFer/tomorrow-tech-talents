<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/TomorrowTechTalentsLogo.svg" style="width: 300%, height: auto, margin-left: auto, margin-left: auto" />

<img src="https://github.com/RitaFer/tomorrow-tech-talents/blob/main/assets/oop-stock-images/diagram_librarysystem.png" />

In the following example you must implement a bookstore system and then some scope changes will be applied, so the exercise will be divided into two steps.

## First step

### Implementation Rules
The system must be able to register the following products: **books**, **games**, **movies**, **music albums** and **toys**.

#### Books:
They must have **name**, **id**, **price**, **genres**, **writer**, **publisher** .

#### Games:
Must have **name**, **id**, **price**, **distributor**, **genre** and **studio**

#### Films:
Must have **name**, **id**, **price**, **studio**, **directors**, **genres** and **producers**

#### Music albums:
Must have **name**, **id**, **price**, **musicians/bands**, **genres** and **stamps**

#### Toys:
They must have **name**, **id**, **price** and **type**.
<hr />

In addition our system must have a **cashier**. This cashier must have the money information that is present on it.

#### Some system features:

- You must be able to add, view, change and remove any product from the system.
- You should be able to see how many items of a specific type are in stock.
- You should be able to see the complete listing of items in stock.
- You should be able to see the listing of in-stock items by category.
- You must be able to perform the **purchase operation**, when performing this operation the purchased products are removed from the stock and the money paid must be added to the cashier.

## Second stage:

Two scope changes were urgently requested. Now a product can be added with a label: **intended for adults**. In this case, for the purchase of the product to be carried out, it will be necessary to present the buyer's documents (**Name**, **RG**, **CPF** and **Date of Birth**) if the buyer has less 18 years old the purchase must be blocked.

Another requested change was that every purchase over **R$200.00** in books should receive a **15%** discount.

## Final Tips

- Think about the **SOLID** principles for the exercise.
- Try to carry out the exercise in stages as proposed, in this way you will be simulating a situation closer to the market reality and working better on the *OOP* principles.
- Think and if possible write the structure that will be necessary for the software to be built.
- In addition to the **SOLID** concepts, try also to apply the other concepts learned in the *OOP* classes.
- Write documentation for your project on *Github*, it helps to expose the skills learned and other people who access your repository understand what is happening.
- Create as many entities as you want to facilitate the resolution of the exercise.
- Try to be declarative about the names of methods, classes, interfaces and variables.
- Do not keep the doubts to yourself, share them with the teachers and the class, sometimes more colleagues have the same problem, or it is an issue that was not initially thought of by the teachers.
- Take advantage of the exercise to fix the concepts taught in class.
