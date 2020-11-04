package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    public Boolean isInFavorOfX(Character[][] matrix) {
        Character winner = 'g';
        if ((matrix[0][0].equals(matrix[0][1])) && (matrix[0][0].equals(matrix[0][2]))) {
            winner = (matrix[0][0]);/*vertical*/
        } else if ((matrix[1][0].equals(matrix[1][1])) && (matrix[1][0].equals(matrix[1][2]))) {
            winner = (matrix[1][0]);
        } else if ((matrix[2][0].equals(matrix[2][1])) && (matrix[2][0].equals(matrix[2][2]))) {
           winner = (matrix[2][0]);
        } /*horizontal*/ else if ((matrix[0][0].equals(matrix[1][0])) && (matrix[0][0].equals(matrix[2][0]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][1].equals(matrix[1][1])) && (matrix[0][1].equals(matrix[2][1]))) {
            winner = (matrix[0][1]);
        } else if ((matrix[0][2].equals(matrix[1][2])) && (matrix[0][2].equals(matrix[2][2]))) {
            winner = (matrix[0][2]);
        } /*diagonal*/ else if ((matrix[0][0].equals(matrix[1][1])) && (matrix[0][0].equals(matrix[2][2]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][2].equals(matrix[1][1])) && (matrix[0][2].equals(matrix[2][0]))) {
            winner = (matrix[0][2]);
        }

        if (winner.toString().equals('X')){
            return true;
        } else {
            return false;
        }
    }


    public Boolean isInFavorOfO(Character[][] matrix) {
        Character winner = 'g';
        if ((matrix[0][0].equals(matrix[0][1])) && (matrix[0][0].equals(matrix[0][2]))) {
            winner = (matrix[0][0]);/*vertical*/
        } else if ((matrix[1][0].equals(matrix[1][1])) && (matrix[1][0].equals(matrix[1][2]))) {
            winner = (matrix[1][0]);
        } else if ((matrix[2][0].equals(matrix[2][1])) && (matrix[2][0].equals(matrix[2][2]))) {
            winner = (matrix[2][0]);
        } /*horizontal*/ else if ((matrix[0][0].equals(matrix[1][0])) && (matrix[0][0].equals(matrix[2][0]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][1].equals(matrix[1][1])) && (matrix[0][1].equals(matrix[2][1]))) {
            winner = (matrix[0][1]);
        } else if ((matrix[0][2].equals(matrix[1][2])) && (matrix[0][2].equals(matrix[2][2]))) {
            winner = (matrix[0][2]);
        } /*diagonal*/ else if ((matrix[0][0].equals(matrix[1][1])) && (matrix[0][0].equals(matrix[2][2]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][2].equals(matrix[1][1])) && (matrix[0][2].equals(matrix[2][0]))) {
            winner = (matrix[0][2]);
        }

        if (winner.toString().equals('O')){
            return true;
        } else {
            return false;
        }
    }


    public Boolean isTie() {
        return null;
    }

    public String getWinner(Character[][] matrix) {
        Character winner = 'g';
        if ((matrix[0][0].equals(matrix[0][1])) && (matrix[0][0].equals(matrix[0][2]))) {
            winner = (matrix[0][0]);/*vertical*/
        } else if ((matrix[1][0].equals(matrix[1][1])) && (matrix[1][0].equals(matrix[1][2]))) {
            winner = (matrix[1][0]);
        } else if ((matrix[2][0].equals(matrix[2][1])) && (matrix[2][0].equals(matrix[2][2]))) {
            winner = (matrix[2][0]);
        } /*horizontal*/ else if ((matrix[0][0].equals(matrix[1][0])) && (matrix[0][0].equals(matrix[2][0]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][1].equals(matrix[1][1])) && (matrix[0][1].equals(matrix[2][1]))) {
            winner = (matrix[0][1]);
        } else if ((matrix[0][2].equals(matrix[1][2])) && (matrix[0][2].equals(matrix[2][2]))) {
            winner = (matrix[0][2]);
        } /*diagonal*/ else if ((matrix[0][0].equals(matrix[1][1])) && (matrix[0][0].equals(matrix[2][2]))) {
            winner = (matrix[0][0]);
        } else if ((matrix[0][2].equals(matrix[1][1])) && (matrix[0][2].equals(matrix[2][0]))) {
            winner = (matrix[0][2]);
        }
        return winner.toString();
    }
}
