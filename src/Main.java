public class Main {
    public static void main(String[] args) {

        String opisProd = "typ Górskie";



        Category category = new Category("Rowery",opisProd);
        Product product1 = new Product("Merida","Fajny rowerek", 1500, category);
        Product product2 = new Product("Romet","Dzieciecy", 700, category);

        opisProd = "typ Scigacz";
        Category motors = new Category("Motor",opisProd);
        Product product3 = new Product("Honda","jednoosobowy", 25_000,motors);

        Product product4 = new Product("Honda","jednoosobowy", 25_000);


        Product product5 = new Product("Honda","Rocznik 2017", 15_000,motors);
        SpecialOffer specialOffer = new SpecialOffer(product5,"Wyprzedaż rocznika","2019-02-01","2019-02-28",0.2);


        System.out.println(product1.opis());
        System.out.println(product2.opis());
        System.out.println(product3.opis());
        System.out.println(product4.opis1());
        System.out.println(specialOffer.opis());

    }


}
