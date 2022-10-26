package com.company;

//Permutation problem (arrange them in a single line) => Total permutation = n!

import java.util.ArrayList;
import java.util.List;

public class backTracking {
    public static void possiblePermutation(String str,String per)
    {
        if(str.length() == 0)
        {
            System.out.println(per);
            return;
        }
        for(int i = 0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            possiblePermutation(newStr,per+curr);
        }
    }

//    N-Queen problem (n * n chessboard) (n Queens) (print all solution where queens are safe.)

    public static void helper(char [][] board, List<List<String>> allBoard,int col)
    {
        if(col == board.length)
        {
            saveBoard(board,allBoard);
            return;
        }
        for(int row = 0;row<board.length;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col] = 'Q';
                helper(board,allBoard,col+1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row,int col,char[][] board){
        for(int j = 0;j < board.length;j++)
        {
//            Horizontal check.
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }

        //            Vertical check.
        for(int i = 0;i < board[0].length;i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

//      Upper left.
        int r = row;
        for(int c = col;c>=0 && r>=0;c--,r--){
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
//      Upper right.
        r = row;
        for(int c = col;c<board.length && r>=0;c++,r--){
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
//      Lower left.
        r = row;
        for(int c = col;c>=0 && r<board.length;c--,r++){
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
//      Lower right.
        r = row;
        for(int c = col;c<board.length && r<board.length;c++,r++){
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
       return true;
    }

    public static void saveBoard(char[][] board,List<List<String>> allBoard)
    {
        String row = "";
        List<String> res = new ArrayList<>();
        for(int i = 0;i < board.length;i++)
        {
            row = "";
            for(int j = 0;j<board[0].length;j++)
            {
                if(board[i][j] == 'Q'){
                    row += "Q";
                }
                else
                {
                    row += '.';
                }
            }
            res.add(row);
        }
        allBoard.add(res);
    }


    public static void main(String[] args) {
//        String str = "ABC";
//        possiblePermutation(str,"");
        int n = 4;
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoard,0);
        System.out.println(allBoard);

    }
}
