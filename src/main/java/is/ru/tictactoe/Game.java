package is.ru.tictactoe;
import java.util.Scanner;

public class Game {	
	
	public static char[][] tic;	
	
	Game()
	{
        	tic = new char[3][3];
         	for(int i = 0; i < 3; i++){
           		for(int j = 0; j < 3; j++){
                		tic[i][j] = '-';
          		}
          	}
        }

public static char[][] MakeArray()
{
     tic = new char[3][3];
     for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
                tic[i][j] = '-';
        }
        }
        return tic;
}

public static char MakeMove(int col, int row, char move)
{	Game game = new Game();
	game.tic[col][row] = move;
	return tic[col][row];
}

public static boolean WrongNumbers(int x, int y)
{
	return (x > 2 || x < 0 || y > 2 || y < 0);
}

public void PrintBoard(char[][] tic)
{
	int count = 0;
	System.out.println();
	for(int j = 0; j < 3; j++)
	{	
		System.out.print("| ");
		for(int i = 0; i < 3; i++)
		{	System.out.print(tic[i][j] + " | ") ; }
			System.out.println();
			if(count < 2)
				System.out.println("-------------");
			count++;
		}
		System.out.println();
}

public static void main(String[] args) {

	Game game = new Game();
	Scanner in = new Scanner(System.in);	
	System.out.print("Select name for Player 1: ");
	String name = in.nextLine();
	player1 player1 = new player1(name);
	System.out.println("Player 1 = " + player1.name);
	System.out.print("Select name for Player 2: ");
	name = in.nextLine();
	player2 player2 = new player2(name);
	System.out.print("Player 2 = " + player2.name );

	System.out.println();
	game.PrintBoard(tic);
}
}
