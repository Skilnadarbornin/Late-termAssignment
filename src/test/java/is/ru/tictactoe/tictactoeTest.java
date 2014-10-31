
package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class tictactoeTest {

        public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.tictactoeTest");
        }

        @Test
        public void testDoubled() {
                assertEquals(8, Game.doubled(4));
        }
}
