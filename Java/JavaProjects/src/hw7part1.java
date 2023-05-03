
/*
* Program:  hw7part1.java
*
* Author: Mihiretu Jackson
* Date: 4/10/23
* Course: CSCI150
*
* Program Description:
* Write a series of method calls to tie a game of tic-tac-toe. Create hw7part1.java using the code given
below and include the method calls inside the main() method. 
*/
public class hw7part1 {
    public static void displayboard(int[][] x){
    for (int i=0; i<x.length; i++){
    for (int j=0; j<x.length; j++){
    if (x[i][j] == 1){
    System.out.print(" X ");
   if (j<x.length - 1) System.out.print("|");
    }else if(x[i][j] == 2){
    System.out.print(" O ");
   if (j<x.length - 1) System.out.print("|");
    }else{
    System.out.print(" ");
   if (j<x.length - 1) System.out.print("|");
    }
    }
    if (i<x.length - 1)System.out.println("\n-----------");
    else System.out.println("\n");
    }
    }
    public static void markBoard(int[][] a, int p, int x, int y){
    if (a [x-1][y-1] != 0)
    throw new IllegalArgumentException("CELL( " + x + ", " + y +
    ") IS ALREADY SET");
    if (x>3 || x<1 || y>3 || y<1)
    throw new IllegalArgumentException("ROW AND COLUMN ARGUMENTS MUST "
    + "BE BETWEEN 1 AND 3");
    if (p != 1 && p!= 2)
    throw new IllegalArgumentException("PLAYER INPUT MUST BE EITHER 1 "
    + "OR 2");
   
    a[x-1][y-1] = p;
    }
    public static void main(String[] args) {
   int[][] board = new int[3][3];
    //player 1
    markBoard(board, 1, 1, 1);
    displayboard(board);
     //player 2
    markBoard(board, 2, 2, 2);
    displayboard(board);
     //player 1
    markBoard(board, 1,1, 3);
    displayboard(board);
     //player 2
    markBoard(board, 2,1 , 2);
    displayboard(board);
     //player 1
    markBoard(board, 1,3 , 2);
    displayboard(board);
     //player 2
    markBoard(board, 2,2 , 3);
    displayboard(board);
     //player 1
    markBoard(board, 1,2 , 1);
    displayboard(board);
      //player 2
    markBoard(board, 2,3, 1);
    displayboard(board);
       //player 1
    markBoard(board, 1,3, 3);
    displayboard(board);
       
    }
   }
