/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoemontecarlo;

import java.util.Random;

/**
 *
 * @author Genki
 */
public class MonteCarloControl {

    Board board = new Board();
    Random random = new Random();
    int boardGame = 1, i = 0, player = 2, Round = 1;
    int rows, columns, positionX, positionY;
    boolean win;
    float playerOne = 0, playerTwo = 0;

    public void InsertValue(int iterations, int Board) {
        int gameRound = 1;
        Round = 1;
        playerOne = 0;
        playerTwo = 0;
        player = 2;
        while (Round <= iterations) {
            if (player % 2 != 0) {
                player = 1;
            } else {
                player = 2;
            }
            
            //Random value
            positionX = random.nextInt(3);
            positionY = random.nextInt(3);
            
            //Insert Value
            if(gameRound == 9){
                playerOne += 0.5;
                playerTwo += 0.5;
                board.ClearBoard(Board);
            }else{
                duplicateCheck(positionX, positionY, Board);
            }
            win = checkWin(player, Board, gameRound);
            if (win == true) {
                Round++;
                gameRound = 1;
            }
            player++;
            gameRound++;
        }
        float winrate = (playerOne / (Round-1)) * 100;
        System.out.printf("Winrate for Board %d is %.2f%n \n", Board, winrate);

    }

    //Find Duplicate Value in the Table
    public void duplicateCheck(int rows, int columns, int table) {
        if (table == 1) {
            if (board.Table1[rows][columns].equals(" ")) {
                if (player % 2 != 0) {
                    board.Table1[rows][columns] = "O";
                } else if (player % 2 == 0) {
                    board.Table1[rows][columns] = "X";
                }
            } else {
                positionX = random.nextInt(3);
                positionY = random.nextInt(3);
                duplicateCheck(positionX, positionY, table);
            }
        } else if (table == 2) {
            if (board.Table2[rows][columns].equals(" ")) {
                if (player % 2 != 0) {
                    board.Table2[rows][columns] = "O";
                } else if (player % 2 == 0) {
                    board.Table2[rows][columns] = "X";
                }
            } else {
                positionX = random.nextInt(3);
                positionY = random.nextInt(3);
                duplicateCheck(positionX, positionY, table);
            }
        } else if (table == 3) {
            if (board.Table3[rows][columns].equals(" ")) {
                if (player % 2 != 0) {
                    board.Table3[rows][columns] = "O";
                } else if (player % 2 == 0) {
                    board.Table3[rows][columns] = "X";
                }
            } else {
                positionX = random.nextInt(3);
                positionY = random.nextInt(3);
                duplicateCheck(positionX, positionY, table);
            }
        }

    }

    //Check winning
    public boolean checkWin(int player, int table, int gameRound) {
        if (table == 1) {
            for (int i = 0; i < 3; i++) {
                if ((board.Table1[i][0].equals("O") && board.Table1[i][1].equals("O") && board.Table1[i][2].equals("O")) || (board.Table1[i][0].equals("X") && board.Table1[i][1].equals("X") && board.Table1[i][2].equals("X"))) {
                    if (player % 2 != 0) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(1);
                    return true;
                } else if ((board.Table1[0][i].equals("O") && board.Table1[1][i].equals("O") && board.Table1[2][i].equals("O")) || (board.Table1[0][i].equals("X") && board.Table1[1][i].equals("X") && board.Table1[2][i].equals("X"))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(1);
                    return true;
                } else if (((board.Table1[0][0].equals("O") && board.Table1[1][1].equals("O") && board.Table1[2][2].equals("O")) || (board.Table1[0][0].equals("X") && board.Table1[1][1].equals("X") && board.Table1[2][2].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(1);
                    return true;
                } else if (((board.Table1[0][2].equals("O") && board.Table1[1][1].equals("O") && board.Table1[2][0].equals("O")) || (board.Table1[0][2].equals("X") && board.Table1[1][1].equals("X") && board.Table1[2][0].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(1);
                    return true;
                } else {
                    if (gameRound == 9) {
                        board.ClearBoard(1);
                        playerOne += 0.5;
                        playerTwo += 0.5;
                        return true;
                    }
                }
            }
        } else if (table == 2) {
            for (int i = 0; i < 3; i++) {
                if ((board.Table2[i][0].equals("O") && board.Table2[i][1].equals("O") && board.Table2[i][2].equals("O")) || (board.Table2[i][0].equals("X") && board.Table2[i][1].equals("X") && board.Table2[i][2].equals("X"))) {
                    if (player % 2 != 0) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(2);
                    return true;
                } else if ((board.Table2[0][i].equals("O") && board.Table2[1][i].equals("O") && board.Table2[2][i].equals("O")) || (board.Table2[0][i].equals("X") && board.Table2[1][i].equals("X") && board.Table2[2][i].equals("X"))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(2);
                    return true;
                } else if (((board.Table2[0][0].equals("O") && board.Table2[1][1].equals("O") && board.Table2[2][2].equals("O")) || (board.Table2[0][0].equals("X") && board.Table2[1][1].equals("X") && board.Table2[2][2].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(2);
                    return true;
                } else if (((board.Table2[0][2].equals("O") && board.Table2[1][1].equals("O") && board.Table2[2][0].equals("O")) || (board.Table2[0][2].equals("X") && board.Table2[1][1].equals("X") && board.Table2[2][0].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(2);
                    return true;
                } else {
                    if (gameRound == 9) {
                        board.ClearBoard(2);
                        playerOne += 0.5;
                        playerTwo += 0.5;
                        return true;
                    }
                }
            }
        } else if (table == 3) {
            for (int i = 0; i < 3; i++) {
                if ((board.Table3[i][0].equals("O") && board.Table3[i][1].equals("O") && board.Table3[i][2].equals("O")) || (board.Table3[i][0].equals("X") && board.Table3[i][1].equals("X") && board.Table3[i][2].equals("X"))) {
                    if (player % 2 != 0) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(3);
                    return true;
                } else if ((board.Table3[0][i].equals("O") && board.Table3[1][i].equals("O") && board.Table3[2][i].equals("O")) || (board.Table3[0][i].equals("X") && board.Table3[1][i].equals("X") && board.Table3[2][i].equals("X"))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(3);
                    return true;
                } else if (((board.Table3[0][0].equals("O") && board.Table3[1][1].equals("O") && board.Table3[2][2].equals("O")) || (board.Table3[0][0].equals("X") && board.Table3[1][1].equals("X") && board.Table3[2][2].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(3);
                    return true;
                } else if (((board.Table3[0][2].equals("O") && board.Table3[1][1].equals("O") && board.Table3[2][0].equals("O")) || (board.Table3[0][2].equals("X") && board.Table3[1][1].equals("X") && board.Table3[2][0].equals("X")))) {
                    if (player == 1) {
                        playerOne++;
                    } else {
                        playerTwo++;
                    }
                    board.ClearBoard(3);
                    return true;
                } else {
                    if (gameRound == 9) {
                        board.ClearBoard(3);
                        playerOne += 0.5;
                        playerTwo += 0.5;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
