package is.ru.tictactoe;
import java.util.Scanner;

public class Game {
	
	public static char[][] tic;	
	
	Game(){
         tic = new char[3][3];
         for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
                tic[i][j] = '-';
          }
          }
        }

	
public static  int doubled(int n)
{
        return n * 2;
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

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        int i = Integer.parseInt(ans);
        System.out.println(doubled(i));

}


}
