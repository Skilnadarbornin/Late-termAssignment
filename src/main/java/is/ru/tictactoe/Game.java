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

public static void MakeMove(int x, int y, char move)
{	
	Scanner in = new Scanner(System.in);

	while(WrongNumbers(x, y) || IllegalMove(x, y))
	{
		if(WrongNumbers(x, y))
		{
			System.out.println("You have to choose integers between 0 and 2, please try again.");
			x = in.nextInt();
			y = in.nextInt();
		}
		else
		{
			System.out.println("You can't make that move, please try again");
			x = in.nextInt();
			y = in.nextInt();
		}
	}
	tic[x][y] = move;
}

public static boolean WrongNumbers(int x, int y)
{
	return (x > 2 || x < 0 || y > 2 || y < 0);
}

public static boolean IllegalMove(int x, int y)
{
	return (tic[x][y] != '-');
}

public void PrintBoard()
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
public boolean Winner(char move)
{
	for(int i = 0; i < 3; i++)
	{
		if(tic[i][0] == move && tic[i][1] == move && tic[i][2] == move)
		{return true;}
	}
	for(int k = 0; k < 3; k++)
	{
		if(tic[0][k] == move && tic[1][k] == move && tic[2][k] == move)
		{return true;}
	}
	if(tic[0][0] == move && tic[1][1] == move && tic[2][2] == move)
	{return true;}
	if(tic[2][0] == move && tic[1][1] == move && tic[0][2] == move)
	{return true;}
	
	return false;
}

public static int counter = 0;
public void PlayerMove(String name, char move)
{
	counter++;
	Scanner in = new Scanner(System.in);

	System.out.println(name + " make a move, you can choose columns[0-2 & rows[0-2]");
	int x = in.nextInt();
	int y = in.nextInt();
	MakeMove(x,y,move);
	PrintBoard();
	if(Winner(move))
	{
		System.out.println(name + " wins!");
		return;
	}
}

public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        int i = Integer.parseInt(ans);
        System.out.println(doubled(i));
}
	*/

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
	game.PrintBoard();
	//int count = 0;

	while(counter <= 8)
	{
		if(counter % 2 == 0)
		{
			game.PlayerMove(player1.name, player1.move);
			//count++;
			if(game.Winner(player1.move))
			{
				return;
			}
		}
		else
		{
			game.PlayerMove(player2.name, player2.move);
			//count++;
			if(game.Winner(player2.move))
			{
				return;
			}
		}
	}
	System.out.println("DRAW! What a bummer.");
}
}
