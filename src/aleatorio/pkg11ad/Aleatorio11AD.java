
package aleatorio.pkg11ad;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author julian mosquera
 */
public class Aleatorio11AD {
 public static void main(String[] args) throws FileNotFoundException, IOException {
        
            // TODO code application logic here
            RandomAccessFile raf = new RandomAccessFile("texto1.txt", "rw");
            Product p;
            String code = "";
            String desc = "";
            String[] cod = {"p1", "p2", "p3"};
            String[] descr = {"parafusos", "cravos ", "tachas"};
            int[] price = {3, 4, 5};

            for (int i = 0; i < cod.length; i++) {
                raf.writeChars(String.format("%-3s", cod[i]).replace(' ', '*'));
                raf.writeChars(String.format("%-10s", descr[i]).replace(' ', '*'));
                raf.writeInt(price[i]);
            }
            int reg = Integer.parseInt(JOptionPane.showInputDialog("Nº Registro."));
            raf.seek((reg - 1) * 30);

            for (int i = 0; i < 13; i++) {
                if (i < 3) {
                    code += raf.readChar();
                } else {
                    desc += raf.readChar();
                }
            }

            p = new Product(code.replace("*", ""), desc.replace("*", ""), raf.readInt());
            System.out.println(p);
            raf.close();

      
    

}}
   

