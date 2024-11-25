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
public class TicTacToeMonteCarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonteCarloControl mcc = new MonteCarloControl();
        Board board = new Board();
        
        for(int i = 1;i <= 3; i++){
            board.CreateBoard(i);
        }
        mcc.InsertValue(100,1);
        mcc.InsertValue(100,2);
        mcc.InsertValue(100,3);
    }
    
}
