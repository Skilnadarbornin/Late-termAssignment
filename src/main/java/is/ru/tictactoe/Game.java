package is.ru.tictactoe;
import java.util.Scanner;

public class Game {

public static  int doubled(int n)
{
        return n * 2;
}

public static char[][] ArrayInput(char x)
{
	char[][] tic = new char[3][3];
     for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
                tic[i][j] = x;
        }
        }
        return tic;
}

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        int i = Integer.parseInt(ans);
        System.out.println(doubled(i));

}
}
