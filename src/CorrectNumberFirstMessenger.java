public class CorrectNumberFirstMessenger implements GameMessenger {

    private boolean isCorrect = false;

    @Override
    public void print(String string) {

        System.out.println(string);
        isCorrect = string.equals("Conrgats! You won!");
    }
    public boolean isCorrect(){
        return isCorrect;
    }
}
