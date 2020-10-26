public class Tile
{
    private int balanceChange;
    private boolean extraTurn;

    public Tile(int a, boolean b)
    {
        balanceChange = a;
        extraTurn = b;


    }

    public void setBalanceChange(int balanceChange) {
        this.balanceChange = balanceChange;
    }

    public void setExtraTurn(boolean extraTurn) {
        this.extraTurn = extraTurn;
    }

    public int getBalanceChange() {
        return balanceChange;
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }
}
