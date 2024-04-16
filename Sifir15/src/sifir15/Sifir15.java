
package sifir15;
import java.util.Scanner;
public class Sifir15 {

    
    public static void main(String[] args) {
        int i, sifir,hasil;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan sifir yang dikehendaki: ");
        sifir = input.nextInt();
        for(i = 1;i<=12;i++)
        {
            hasil = i*sifir;
            System.out.println(i + " x " +sifir+ "= " +hasil);
        }
        
    }
    
}
