package com.zipcodewilmington.assessment1.part1;


import sun.plugin2.ipc.windows.WindowsNamedPipe;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        if (handSign == ROCK){
            winningMove = PAPER;
        } else if (handSign == PAPER){
            winningMove = SCISSOR;
        } else if (handSign == SCISSOR){
            winningMove = ROCK;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        if (handSign == ROCK){
            losingMove = SCISSOR;
        } else if (handSign == PAPER){
            losingMove = ROCK;
        } else if (handSign == SCISSOR){
            losingMove = PAPER;
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1 == ROCK){
            if (handSignOfPlayer2 == PAPER){
                winner = PAPER;
            } else if (handSignOfPlayer2 == SCISSOR){
                winner = ROCK;
            }
        } else if (handSignOfPlayer1 == PAPER){
            if (handSignOfPlayer2 == ROCK){
                winner = PAPER;
            } else if (handSignOfPlayer2 == SCISSOR){
                winner = SCISSOR;
            }
        } else if (handSignOfPlayer1 == SCISSOR){
            if (handSignOfPlayer2 == ROCK){
                winner = ROCK;
            } else if (handSignOfPlayer2 == PAPER){
                winner = SCISSOR;
            }
        }
        return winner;
    }
}
