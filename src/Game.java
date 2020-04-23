public class Game {

    private int attempts;
    private int secret;
    private GameMessenger messenger;
    private GameNumberReader reader;

    public Game(int attempts, int secret, GameMessenger messenger, GameNumberReader reader){
        this.attempts = attempts;
        this.secret = secret;
        this.messenger = messenger;
        this.reader = reader;
    }

    public void play(){
        doGreetings();
        boolean guess = guess();
        showGameOver(guess);
    }

    private boolean guess() {
        boolean guessedCorrectly = false;
        while (attempts > 0 && !guessedCorrectly) {
            int guessedNumber = reader.getGuessedNumber();
            if (guessedNumber == secret) {
                guessedCorrectly = true;

            } else {
                doYouTryAgain();
            }
            attempts--;
        }
        return guessedCorrectly;
    }
    private void showGameOver(boolean guessedCorrectly){
        if (!guessedCorrectly){
            doYouLose();
        }else {
            doYouWin();
        }
    }

    private void doGreetings() {
        messenger.print("Welcome to the game! Guess a number:");
    }

    private void doYouWin() {
        messenger.print("Congrats! You won!");

    }

    private void doYouLose() {
        messenger.print("You lost");
    }

    private void doYouTryAgain() {
        messenger.print("Wrong number, try again!");
    }
}
