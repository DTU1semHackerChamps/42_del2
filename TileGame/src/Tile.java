public class Tile {
    /**
     * constructor
     */
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


    /**
     * array of tile list
     * @return returns array of the specified initiated tiles
     */
    public static Tile [] tileListInit(){
        Tile [] Tiles = new Tile[12];
        Tile Start = new Tile (0,false);
        Tile Tower = new Tile (250,false);
        Tile Crater = new Tile (-100,false);
        Tile PalaceGates = new Tile (100,false);
        Tile ColdDesert = new Tile (-20,false);
        Tile WalledCity = new Tile (180,false);
        Tile Monastery = new Tile (0,false);
        Tile BlackCave = new Tile (-70,false);
        Tile HutsInTheMountain = new Tile (60,false);
        Tile TheWerewall = new Tile (-80,true);
        Tile ThePit = new Tile (-50,false);
        Tile Goldmine = new Tile (650,false);

        Tiles[0] = Start;
        Tiles[1] = Tower;
        Tiles[2] = Crater;
        Tiles[3] = PalaceGates;
        Tiles[4] = ColdDesert;
        Tiles[5] = WalledCity;
        Tiles[6] = Monastery;
        Tiles[7] = BlackCave;
        Tiles[8] = HutsInTheMountain;
        Tiles[9] = TheWerewall;
        Tiles[10] = ThePit;
        Tiles[11] = Goldmine;

        return Tiles;
    }
}
