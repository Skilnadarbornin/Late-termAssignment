package is.ru.tictactoe;
import java.util.Scanner;

public class Game {

public static  int doubled(int n)
{
        return n * 2;
}

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        int i = Integer.parseInt(ans);
        System.out.println(doubled(i));

}
}
