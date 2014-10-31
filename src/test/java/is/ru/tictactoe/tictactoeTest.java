package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class tictactoeTest {
	
	Game game = new Game();

        public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.tictactoeTest");
        }

        @Test
        public void testDoubled() {
                assertEquals(8, Game.doubled(4));
        }
	
	@Test
        public void testArrayInput(){
		char[][] array = new char[3][3];
                for(int i = 0; i < 3; i++){
                  for(int j = 0; j < 3; j++){
                        array[i][j] = '-';
                  }
                  }
		assertArrayEquals(array, Game.MakeArray());
        }
	@Test
	public void testConstructor(){
		char[][] array = new char[3][3];
                for(int i = 0; i < 3; i++){
                  for(int j = 0; j < 3; j++){
                        array[i][j] = '-';
                  }
         	}
		assertArrayEquals(array, game.tic);
	}
	@Test
	public void testMakeMoveX(){
		assertEquals('X', game.MakeMove(2, 2, 'X'));
	}
	 @Test
        public void testMakeMoveO(){
                assertEquals('O', game.MakeMove(2, 2, 'O'));
        }


}
