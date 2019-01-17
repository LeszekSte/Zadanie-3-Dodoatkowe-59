
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class SpecialOffer {
    Product product;
    String ofertaPromocyjna;
    String poczatekPromocji;
    String konecPromocji;
    double rabat;


    public SpecialOffer(Product product, String ofertaPromocyjna, String poczatekPromocji, String konecPromocji, double rabat) {
        this.product = product;
        this.ofertaPromocyjna = ofertaPromocyjna;
        this.poczatekPromocji = poczatekPromocji;
        this.konecPromocji = konecPromocji;
        this.rabat = rabat;
        this.product.price = round(2, product.price * (1 - rabat));
    }

    String opis() {
        String opisProduktu = "Nazwa - " + product.name +
                ",\nOpis        - " + product.descryption +
                ",\nRabat       - " + rabat * 100 + "%" +
                ",\nCena po rab.- " + product.price + "zł" +
                ",\nTyp         - " + product.category.nameCategory +
                ",\nKat. Opis   - " + product.category.descriptionCategory +
                ",\nPoczątek promocji - " + poczatekPromocji +
                ",\nKoniec   promocji - " + konecPromocji;


        return opisProduktu;
    }


}
