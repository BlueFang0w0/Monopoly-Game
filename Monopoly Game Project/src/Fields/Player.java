package Fields;

public class Player {
    private String imagePath;
    private String playerName;
    private int currentFieldIndex;
    private int moneyReserve;
    private int jailFreeTokens;

    public Player(String imagePath, String playerName, int currentFieldIndex, int moneyReserve, int jailFreeTokens) {
        this.playerName =playerName;
        this.imagePath = imagePath;
        this.currentFieldIndex = currentFieldIndex;
        this.moneyReserve = moneyReserve;
        this.jailFreeTokens = jailFreeTokens;
    }

    public String getImagePath() {
        return imagePath;
    }

    //money methods
    public void getPaid(int amount){
        this.moneyReserve+= amount;
    }

    public void pay(int amount){
        this.moneyReserve-= amount;
    }

    public int getTotal(){
        return this.moneyReserve;
    }

    //jail token methods
    public void incrementJailTokens(){
        this.jailFreeTokens++;
    }
    public void decrementJailTokens(){
        this.jailFreeTokens--;
    }

    public int getNumberOfJailTokens(){
        return this.jailFreeTokens;
    }

    //field index methods
    public int getCurrentFieldIndex(){
        return this.currentFieldIndex;
    }

    public void setCurrentFieldIndex(int newPos){
        this.currentFieldIndex = newPos;
    }

    public String getPlayerName(){
        return this.playerName;
    }


}
