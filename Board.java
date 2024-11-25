/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoemontecarlo;

/**
 *
 * @author Genki
 */
public class Board {

    public Board[] board = new Board[3];
    public static String[][] Table1 = new String[3][3];
    public static String[][] Table2 = new String[3][3];
    public static String[][] Table3 = new String[3][3];
    int rows, columns;

    public Board() {
        
    }

    public void CreateBoard(int board) {
        switch (board) {
            case 1:
                for (rows = 0; rows < 3; rows++) {
                    for (columns = 0; columns < 3; columns++) {
                        if (rows == 0 && columns == 0) {
                            Table1[rows][columns] = "O";
                        } else {
                            Table1[rows][columns] = " ";
                        }
                    }
                }
                break;
            case 2:
                for (rows = 0; rows < 3; rows++) {
                    for (columns = 0; columns < 3; columns++) {
                        if (rows == 0 && columns == 1) {
                            Table2[rows][columns] = "O";
                        } else {
                            Table2[rows][columns] = " ";
                        }
                    }
                }
                break;
            case 3:
                for (rows = 0; rows < 3; rows++) {
                    for (columns = 0; columns < 3; columns++) {
                        if (rows == 1 && columns == 1) {
                            Table3[rows][columns] = "O";
                        } else {
                            Table3[rows][columns] = " ";
                        }
                    }
                }
                break;
        }
    }

    public void PrintBoard(int table) {
        for (rows = 0; rows < 3; rows++) {
            for (columns = 0; columns < 3; columns++) {
                if (table == 1) {
                    System.out.print(Table1[rows][columns]);
                } else if (table == 2) {
                    System.out.print(Table2[rows][columns]);
                } else if (table == 3) {
                    System.out.print(Table3[rows][columns]);
                }
                if (columns < 2) {
                    System.out.print("|");
                }
            }
            System.out.println("");
            if (rows < 2) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    public void ClearBoard(int table) {
        for (rows = 0; rows < 3; rows++) {
            for (columns = 0; columns < 3; columns++) {
                if (table == 1) {
                    if(rows == 0 && columns == 0){
                        Table1[rows][columns] = "O";
                    }else{
                        Table1[rows][columns] = " ";
                    }
                } else if (table == 2) {
                    if(rows == 0 && columns == 1){
                        Table2[rows][columns] = "O";
                    }else{
                        Table2[rows][columns] = " ";
                    }
                } else if (table == 3) {
                    if(rows == 1 && columns == 1){
                        Table3[rows][columns] = "O";
                    }else{
                        Table3[rows][columns] = " ";
                    }
                }
            }
        }
    }
}
