public class Demo {
    public static void main(String[] args) {

        Game game = new Game(3, 5, new ConsoleGameMessenger(), new ConsoleGameNumberReader()) ;
        game.play();

    }
}
