# Towers of Hanoi - Java Terminal Visualization

This is a terminal-based implementation of the **Towers of Hanoi** puzzle in Java. The program allows the user to interact with the classic puzzle by selecting the number of disks and visualizing the recursive solution process in the terminal.

## Features:
- **Interactive Gameplay**: Allows users to select the number of disks for the puzzle (between 1 and 7).
- **Recursive Solution**: Solves the Towers of Hanoi puzzle using a recursive algorithm.
- **Terminal Visualization**: Displays the state of the towers after each move, showing how the disks are transferred between pegs.

## How It Works:

The puzzle consists of 3 pegs (A, B, and C) and a number of disks of different sizes. Initially, all the disks are stacked on peg A in descending order. The objective is to move all the disks from peg A to peg C, using peg B as an auxiliary, following these rules:
1. Only one disk can be moved at a time.
2. Each move consists of taking the top disk from one peg and placing it on another peg.
3. No disk may be placed on top of a smaller disk.

The program uses recursion to solve the puzzle and visualizes the state of the towers after every move.

---

## Getting Started

### Prerequisites:

- **Java**: The program requires **Java 8** or higher.
  - Download Java: [Java Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

### Installing:

1. **Clone the repository** to your local machine:

   ```terminal
   git clone https://github.com/yourusername/towers-of-hanoi-java.git
