public class ChessBoard {

    private static final int    BOARD_DIM = 8;
    private static final char   BLACK = 'ч';
    private static final char   WHITE = 'б';
    private static char[][]     chessBoard;

    public static void main(String[] args) {
        chessBoard = initBoard();
        printBoard();
    }

    private static char[][] initBoard() {
        char[][] board = new char[BOARD_DIM][BOARD_DIM];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = fillCell(i, j);
            }
        }

        return board;
    }

    private static char fillCell(int i, int j) {
        if ((i + j) % 2 == 0) {
            return BLACK;
        } else {
            return WHITE;
        }
    }

    private static void printBoard() {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

}
