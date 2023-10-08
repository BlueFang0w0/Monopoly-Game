import Fields.Deeds.PropertyDeed;
import Fields.Deeds.RailwayDeed;
import Fields.Field;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //PropertyDeed testingDeed = new PropertyDeed();
        //Field testField = new Field("Royce Street", "Action", "src/resources/Placeholder.svg");
        //System.out.println(testField.toString());
        String name = "Pennsylvania Railroad";
        String type = "Railway";
        String imagePath = "path/to/image.png";
        String owner = "John Doe";
        String deedColor = "Blue";
        int rent = 25;
        int bankCost = 200;
        int mortgagePrice = 100;
        boolean isMortgaged = false;
        int[] improvedRent = {50, 100, 200, 400};

        // Create an instance of RailwayDeed using the constructor
        RailwayDeed railwayDeed = new RailwayDeed(name, type, imagePath, owner, deedColor, rent, bankCost, mortgagePrice, isMortgaged, improvedRent);
        System.out.println(railwayDeed.toString());
    }


}

