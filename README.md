# Magical-Arena
Overview

Magical Arena is a simple text-based combat game where two players battle against each other using dice rolls to determine the outcome of their attacks. Players can input their attributes or use default values to engage in a turn-based fight until one player is defeated.

Features

	-Two players can compete against each other.
	-Players can input their own attributes (name, health, strength, attack) or use default values. 
	-The game uses dice rolls to determine attack and defense outcomes.
	-The game continues until one player's health reaches zero.

 
Requirements

	-Java Development Kit (JDK) 8 or higher
	-A text editor or Integrated Development Environment (IDE) for Java (e.g., IntelliJ IDEA, Eclipse)
 
Getting Started

	-Download the .zip file 
	-Compile the program using a Java IDE
	-Run the MagicalArena.java file as a Java Application
	-Follow the Prompts:
 		-You will be prompted to decide whether to input player attributes or use default values.
		-If you choose to input attributes, enter the name, health, strength, and attack for both players.
		-The game will then start, and you will see the combat results in the terminal.


Code Structure

	-Dice Class: Contains a method to simulate rolling a 6-sided die.
	-Player Class: Represents a player with attributes such as name, health, strength, and attack. It includes methods for taking damage and checking health.
	-Game Class: Manages the game logic, including turns and determining the winner.
	-MagicalArena Class: The main class that runs the game and handles user input.
