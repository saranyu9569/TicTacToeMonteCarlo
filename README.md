# TicTacToe with Monte Carlo

"TicTacToe with Monte Carlo" is a Java-based implementation of the classic *Tic Tac Toe* game, where the AI uses the Monte Carlo method to evaluate and simulate possible moves to determine the best move based on the probability of winning. The game is displayed and played via the command line interface (CLI).

## Features

- **Monte Carlo AI**: The AI uses Monte Carlo simulations to evaluate each possible move and determine the best position to play, based on the probability of winning.
- **Command-line Interface (CLI)**: The game is displayed and played entirely in the terminal, providing a straightforward interface for gameplay.
- **AI Move Simulation**: The AI simulates possible future game states using random moves to calculate the probability of winning from each potential move.
  
## Installation

To run this project, ensure you have Java 8 or higher installed. You can download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

Clone the repository to your local machine:
git clone https://github.com/yourusername/tictactoe-montecarlo.git

Navigate to the project directory:
cd tictactoe-montecarlo

Compile and run the project:
javac Main.java java Main

## How the AI Works

1. **AI Move Evaluation**: The AI evaluates every available move by simulating random games from each move. The Monte Carlo method is used to calculate which move has the highest chance of leading to a win.
2. **Monte Carlo Simulation**: The AI randomly plays out games from each possible move and tracks the outcomes to determine the best move to make.
3. **Winning**: The game ends when a player (AI) has successfully aligned three symbols horizontally, vertically, or diagonally.

## Technologies Used

- **Java**: The main programming language for the game logic and AI implementation.
- **Monte Carlo Simulation**: A method used by the AI to evaluate each possible move by simulating random future game states.
- **Command-Line Interface (CLI)**: The game interface is displayed through the terminal.

## Contributing

Feel free to fork this project and submit your improvements, bug fixes, or new features. You can contribute by:

- Reporting issues or bugs
- Adding new features or optimizations
- Improving the AI logic

Please create a pull request for any contributions.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.