import java.util.*;
import java.io.*;

public class Knight{

    private int[][]board; //arraylist for the whole board
    public boolean solved = false;
    private int maxx,maxy; //width and height of board

    public Knight(int i){
	board = new int[i][i];
	for (int j = 0;j<board.length;j++){
	    for (int k = 0;k<board.length;k++){
		board[k][j] = 0;
	    }
	}
	maxx = i-1;
	maxy = i-1;
    }

    public void solve(){
	solve(0,0,1);
    }
	    
    public void solve(int x, int y, int n){
	if ((!solved) && (x <= maxx) && (y <= maxy) && (x >= 0) && (y >= 0)){
	    if (n > (maxx+1)*(maxy+1)){
		solved = true;
	    } else if (board[x][y] == 0){
		board[x][y] = n;
		solve(x+2,y+1,n+1);
		solve(x+2,y-1,n+1);
		solve(x-2,y+1,n+1);
		solve(x-2,y-1,n+1);
		solve(x+1,y+2,n+1);
		solve(x+1,y-2,n+1);
		solve(x-1,y+2,n+1);
		solve(x-1,y-2,n+1);
		if (!solved){
		    board[x][y] = 0;
		} else {
		    System.out.println("Step "+n+": ("+x+","+y+")\n");
		}
	    }
	}
    }
		
	    

    public String toString(){
	String output = "";
	for (int j = 0;j<board.length;j++){
	    for (int k = 0;k<board.length;k++){
		if (board[k][j] < 10){
		    output = output + "  "+ board[k][j];
		}else{
		    output = output + " " + board[k][j];
		}
		if (k == board.length-1){
		    output = output + "\n";
		}
	    }
	}
	return output;
    }
}