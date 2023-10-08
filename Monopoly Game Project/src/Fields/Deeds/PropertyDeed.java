package Fields.Deeds;

import Fields.Field;

public class PropertyDeed extends Field {
    private String owner; // Needs a player object.
    private String deedColor;
    private int rent;
    private int bankCost;
    private int mortgagePrice;
     private boolean isMortgaged;

    public PropertyDeed(String name, String type, String imagePath, String owner, String deedColor, int rent, int bankCost, int mortgagePrice, boolean isMortgaged) {
        super(name, type, imagePath);
        this.owner = owner;
        this.deedColor = deedColor;
        this.rent = rent;
        this.bankCost = bankCost;
        this.mortgagePrice = mortgagePrice;
        this.isMortgaged = isMortgaged;
    }

    //Getters
    public String getOwner() {
        return owner;
    }

    public String getDeedColor() {
        return deedColor;
    }

    public int getRent() {
        return rent;
    }

    public int getBankCost() {
        return bankCost;
    }

    public int getMortgagePrice() {
        return mortgagePrice;
    }

    public boolean isMortgaged() {
        return isMortgaged;
    }

    //Setters
    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return  super.toString() + ", " +
                "owner='" + owner + '\'' +
                ", deedColor='" + deedColor + '\'' +
                ", rent=" + rent +
                ", bankCost=" + bankCost +
                ", mortgagePrice=" + mortgagePrice +
                ", isMortgaged=" + isMortgaged;
    }
}
