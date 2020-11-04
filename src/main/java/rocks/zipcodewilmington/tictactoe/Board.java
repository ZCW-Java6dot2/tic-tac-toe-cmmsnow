package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] tictac;
    
    public Board(Character[][] tictac) {
        this.tictac = tictac;
    }

    public Boolean isInFavorOfX() {
        Character winner = 'X';
        if (winner.equals(tictac[0][0]) && winner.equals(tictac[0][1]) && winner.equals(tictac[0][2])) {
            return true;
        } else if (winner.equals(tictac[1][0]) && winner.equals(tictac[1][1]) && winner.equals(tictac[1][2])) {
            return true;
        } else if (winner.equals(tictac[2][0]) && winner.equals(tictac[2][1]) && winner.equals(tictac[2][2])) {
            return true;
        } else if (winner.equals(tictac[0][0]) && winner.equals(tictac[1][0]) && winner.equals(tictac[2][0])) {
            return true;
        } else if (winner.equals(tictac[0][1]) && winner.equals(tictac[1][1]) && winner.equals(tictac[2][1])) {
            return true;
        } else if (winner.equals(tictac[0][2]) && winner.equals(tictac[1][2]) && winner.equals(tictac[2][2])) {
            return true;
        } else if (winner.equals(tictac[0][0]) && winner.equals(tictac[1][1]) && winner.equals(tictac[2][2])) {
            return true;
        } else if (winner.equals(tictac[0][2]) && winner.equals(tictac[1][1]) && winner.equals(tictac[2][0])) {
            return true;
        } else {
            return false;
        }
    }


    public Boolean isInFavorOfO() {
        Character winner = 'g';
        if ((tictac[0][0].equals(tictac[0][1])) && (tictac[0][0].equals(tictac[0][2]))) {
            winner = (tictac[0][0]);/*horizontal*/
        } else if ((tictac[1][0].equals(tictac[1][1])) && (tictac[1][0].equals(tictac[1][2]))) {
            winner = (tictac[1][0]);
        } else if ((tictac[2][0].equals(tictac[2][1])) && (tictac[2][0].equals(tictac[2][2]))) {
            winner = (tictac[2][0]);
        } /*vertical*/ else if ((tictac[0][0].equals(tictac[1][0])) && (tictac[0][0].equals(tictac[2][0]))) {
            winner = (tictac[0][0]);
        } else if ((tictac[0][1].equals(tictac[1][1])) && (tictac[0][1].equals(tictac[2][1]))) {
            winner = (tictac[0][1]);
        } else if ((tictac[0][2].equals(tictac[1][2])) && (tictac[0][2].equals(tictac[2][2]))) {
            winner = (tictac[0][2]);
        } /*diagonal*/ else if ((tictac[0][0].equals(tictac[1][1])) && (tictac[0][0].equals(tictac[2][2]))) {
            winner = (tictac[0][0]);
        } else if ((tictac[0][2].equals(tictac[1][1])) && (tictac[0][2].equals(tictac[2][0]))) {
            winner = (tictac[0][2]);
        }

        if (winner.equals('O')){
            return true;
        } else {
            return false;
        }
    }


    public Boolean isTie() {
        if (isInFavorOfX().equals(false) && isInFavorOfO().equals(false)) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfX().equals(true) && isInFavorOfO().equals(false)) {
            winner = "X";
        } else if (isInFavorOfX().equals(false) && isInFavorOfO().equals(true)) {
            winner = "O";
        }
        return winner;
    }
}
