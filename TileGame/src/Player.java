public class Player {
    private int balance;
    private int position;
    private boolean playerTurn;
    private boolean extraTurn;
    private boolean hasWon;


    public Player(int a, int b, boolean c, boolean d, boolean e){

        balance = a;
        position = b;
        playerTurn = c;
        extraTurn = d;
        hasWon = e;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }


}
