package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class tictactoeTest {
	
	Game game = new Game();

        public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.tictactoeTest");
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
		assertEquals('O', game.MakeMove(2, 2, 'O'));
	}
	
	@Test
	public void WrongNumbers(){
		assertFalse(game.WrongNumbers(2,2));
		assertFalse(game.WrongNumbers(1,1));
		assertFalse(game.WrongNumbers(0,0));
		assertFalse(game.WrongNumbers(0,2));
	}
	
	@Test
	public void WrongNumbersagain(){
		assertTrue(game.WrongNumbers(23,23));
		assertTrue(game.WrongNumbers(1,12));
		assertTrue(game.WrongNumbers(-10, 77));
		assertTrue(game.WrongNumbers(-4, - 44));
		assertTrue(game.WrongNumbers(0, -23));
	}
	
	@Test
	public void IllegalMove(){
		char[][] array = new char[3][3];
		array[1][2] = '-';
		array[0][2] = 2;
		assertFalse(game.IllegalMove(array,1,2));
		assertTrue(game.IllegalMove(array,0,2));
	}
}
