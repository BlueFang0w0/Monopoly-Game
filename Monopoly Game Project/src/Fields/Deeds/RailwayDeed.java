package Fields.Deeds;

import java.util.Arrays;

public class RailwayDeed extends PropertyDeed{

    private int[] improvedRent;

    public RailwayDeed(String name, String type, String imagePath, String owner, String deedColor, int rent, int bankCost, int mortgagePrice, boolean isMortgaged, int[] improvedRent) {
        super(name, type, imagePath, owner, deedColor, rent, bankCost, mortgagePrice, isMortgaged);
        this.improvedRent = improvedRent;
    }

    public int[] getImprovedRent() {
        return improvedRent;
    }

    @Override
    public String toString() {
        return "RailwayDeed{" +
                super.toString() + ", " +
                "improvedRent=" + Arrays.toString(improvedRent) +
                '}';
    }
}
