public class Product {

    String name;
    double price;
    String descryption;
    Category category;


    Product(String name, String opis1, double price, Category category) {
        this.descryption = opis1;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    String opis() {
//        category = new Category();
        return "Nazwa - " + name + ", Opis - " + descryption + ", Cena " + price;
        //
//                "\nNazwa kategori" + category.nameCategory +"\nOpis kategori" + category.descriptionCategory*?);
//

    }
}