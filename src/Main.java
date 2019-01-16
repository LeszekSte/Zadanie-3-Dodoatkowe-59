public class Main {
    public static void main(String[] args) {

        String opisProd = "typ Górskie";



       Category category = new Category("Rowery",opisProd);
        Product product = new Product("Merida","Fajny rowerek", 1500, category);


        System.out.println(category.opis());
        System.out.println(product.opis());
        System.out.println(product.category.descriptionCategory);

    }


}
