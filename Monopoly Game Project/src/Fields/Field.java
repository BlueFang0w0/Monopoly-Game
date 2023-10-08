package Fields;

public abstract class Field {
    private String name;
    private String type;
    private String imagePath;

    public Field(String name, String type, String imagePath) {
        this.name = name;
        this.type = type;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", imagePath='" + imagePath + '\'' ;
    }
}
