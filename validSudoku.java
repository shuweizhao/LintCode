class Solution {
    /**
      * @param board: the board
        @return: wether the Sudoku is valid
      */
    	public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || 
        board.length != board[0].length || board.length % 3 != 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //determine rows on the board is valid or not
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j] - 48)) {
                        return false;
                    }
                    else {
                        map.put(board[i][j] - 48, 1);
                    }
                }
            }
            map.clear();
        }
        //determine cols on the board is valid or not
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (map.containsKey(board[j][i] - 48)) {
                        return false;
                    }
                    else {
                        map.put(board[j][i] - 48, 1);
                    }
                }
            }
            map.clear();
        } 
        //determine blocks on the board is valid or not
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[0].length; j = j + 3) {
                for (int k = 0; k < 9; k++) {
                    int row = i + k / 3;
                    int col = j + k % 3;
                    if (board[row][col] != '.') {
                        if (map.containsKey(board[row][col] - 48)) {
                            return false;
                        }
                        else {
                            map.put(board[row][col] - 48, 1);
                        }
                    }
                }
                map.clear();
            }
        }
        return true;
    }

};
