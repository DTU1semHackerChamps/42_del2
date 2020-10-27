public class Player {
    private int balance;
    private int position;
    private boolean playerTurn;
    private String playerName;



    public Player(int a, int b, boolean c, String name){

        balance = a;
        position = b;
        playerTurn = c;
        playerName = name;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int addBalance(int tileBalanceChange){
        balance += tileBalanceChange;
        return balance;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public int addPosition(int faceValue){
       position += faceValue;

       if(position > 12){
            position -= 12;
       }
       return position;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }
    public boolean getPlayerTurn(){
        return playerTurn;
    }

    public boolean hasWon(){
        boolean winStatus = false;
        if(balance >= 3000){
            winStatus = true;
        }
        return winStatus;
    }

    private Player shiftPlayer (Player player1, Player player2){
        Player currentPlayer;
        if (player1.getPlayerTurn()){
            player1.setPlayerTurn(false);
            currentPlayer = player1;
        } else {
            player1.setPlayerTurn(true);
            currentPlayer = player2;
        }
        return currentPlayer;
    }

    private static void extraTurn (Player player1, boolean tileExtraTurn){
        if (tileExtraTurn) {
            if(player1.getPlayerTurn()){
                player1.setPlayerTurn(false);
            } else {
                player1.setPlayerTurn(true);
            }
        }
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
