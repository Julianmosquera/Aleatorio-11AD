
package aleatorio.pkg11ad;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author julian
 */
public class Product {
    private String cod;
    private String descr;
    private int price;

    public Product() {
    }

    public Product(String cod, String descr, int price) {
        this.cod = cod;
        this.descr = descr;
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String nf;
        return "Cod: " + cod + "\nDescripción: " + descr + "\nPrice: " + (nf = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(price));
    }

}
    

