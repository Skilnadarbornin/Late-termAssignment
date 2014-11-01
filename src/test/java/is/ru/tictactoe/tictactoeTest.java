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
		char[][] rightArray = new char[3][3];
		char[][] wrongArray = new char[3][3];
                for(int i = 0; i < 3; i++){
                  for(int j = 0; j < 3; j++){
                        rightArray[i][j] = '-';
			wrongArray[i][j] = '*';
			
                  }
                  }
		assertArrayEquals(rightArray, Game.MakeArray());
		assertNotEquals(wrongArray, Game.MakeArray());
        }
	@Test
	public void testConstructor(){
		char[][] rightArray = new char[3][3];
		char[][] wrongArray = new char[3][3];
                for(int i = 0; i < 3; i++){
                  for(int j = 0; j < 3; j++){
                        rightArray[i][j] = '-';
			wrongArray[i][j] = '%';
                  }
         	}
		assertArrayEquals(rightArray, game.tic);
		assertNotEquals(wrongArray, game.tic);
	}
	/*
	@Test
	public void testMakeMoveX(){
		assertEquals('X', game.MakeMove(2, 2, 'X'));
		assertEquals('O', game.MakeMove(2, 2, 'O'));
	}*/
	
	@Test
	public void WrongNumbers(){
		assertFalse(game.WrongNumbers(2,2));
		assertFalse(game.WrongNumbers(1,1));
		assertFalse(game.WrongNumbers(0,0));
		assertFalse(game.WrongNumbers(0,2));
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

	@Test
	public void testPlayerConstructors(){
		player1 Player1 = new player1("Petur");
		player2 Player2 = new player2("Atli");
		
		assertEquals("Petur", Player1.name);
		assertEquals("Atli", Player2.name);
		assertNotEquals("siggi", Player1.name);
		assertNotEquals("Jon", Player2.name);
		assertEquals('X', Player1.move);
		assertEquals('O', Player2.move);
		assertNotEquals('x', Player1.move);
		assertNotEquals('o', Player2.move);
	}
	
	 @Test
        public void isWinner(){

                player1 Player1 = new player1("Gunni");
                player2 Player2 = new player2("Jon");
                char[][] player1isWinner = new char[3][3];
                char[][] player2isWinner = new char[3][3];
                char[][] notWinner = new char[3][3];
                for(int i = 0; i < 3; i++){
                  for(int j = 0; j < 3; j++){
                        player1isWinner[i][j] = 'X';
                        player2isWinner[i][j] = 'O';
                        notWinner[i][j] = 'L';}
                }

                assertTrue(game.Winner(player1isWinner, Player1.move));
                assertFalse(game.Winner(notWinner, Player1.move));
                assertFalse(game.Winner(notWinner, Player2.move));
                assertTrue(game.Winner(player2isWinner, Player2.move));
                assertFalse(game.Winner(player1isWinner, Player2.move));
                assertFalse(game.Winner(player2isWinner, Player1.move));
       }

}
