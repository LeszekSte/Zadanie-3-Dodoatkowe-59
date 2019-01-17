public class Product {

    String name;
    double price;
    String descryption;
    Category category;


    Product(String name, String descryption, double price, Category category) {
        this.descryption = descryption;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    String opis() {
        return "Nazwa - " + name + ", Opis - " + descryption + ", Cena - " + price
                + ", Typ - " + category.nameCategory + ", Kategoria - " + category.descriptionCategory;


    }
}