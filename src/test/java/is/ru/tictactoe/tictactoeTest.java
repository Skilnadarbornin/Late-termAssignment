
package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class tictactoeTest {

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
}
