public class Category {
    String nameCategory;
    String descriptionCategory;

    public Category(String name, String descryption) {
        this.nameCategory = name;
        this.descriptionCategory = descryption;
    }
    Category(){}

    String opis() {
        return "Nazwa - " + nameCategory + " " + ", Opis - " + descriptionCategory;
    }
}
