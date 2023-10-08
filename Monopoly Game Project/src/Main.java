import Fields.Deeds.PropertyDeed;
import Fields.Field;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");
        //PropertyDeed testingDeed = new PropertyDeed();
        Field testField = new Field("Royce Street", "Action", "src/resources/Placeholder.svg");
        System.out.println(testField.toString());
    }

}

