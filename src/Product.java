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
    Product(String name, String descryption, double price) {
        this.descryption = descryption;
        this.name = name;
        this.price = price;
    }

    String opis() {
        String opisProduktu = "Nazwa - " + name + ", Opis - " + descryption + ", Cena - " + price
                    + ", Typ - " + category.nameCategory + ", Kategoria - " + category.descriptionCategory;
        return opisProduktu;
        }

    String opis1() {
        String opisProduktu = "Nazwa - " + name + ", Opis - " + descryption + ", Cena - " + price;
        return opisProduktu;
    }



}