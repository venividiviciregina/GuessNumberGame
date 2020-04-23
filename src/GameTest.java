import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void testGame1(){
     //1. specify test.input
        CorrectNumberFirstReader reader = new CorrectNumberFirstReader();
        CorrectNumberFirstMessenger messenger= new  CorrectNumberFirstMessenger();
        int attempts = 2;
        int secret = 3;

     //2. run test method
        Game game = new Game(attempts, secret, messenger, reader);
        game.play();

     //3. check the output
        assertTrue(messenger.isCorrect());
    }
    @Test
    public void testGame2(){
        //1. specify test.input
        CorrectNumberFirstReader reader = new CorrectNumberFirstReader();
        CorrectNumberFirstMessenger messenger= new  CorrectNumberFirstMessenger();
        int attempts = 2;
        int secret = 2;

        //2. run test method
        Game game = new Game(attempts, secret, messenger, reader);
        game.play();

        //3. check the output
        assertFalse(messenger.isCorrect());
    }
}
