/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_today;
import java.util.Scanner;
/**
 *
 * @author HP
 */

public class persegi {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, luas,keliling;
        System.out.println("Persegi");
        System.out.print("Masukkan Panjang sisi : ");
        s = input.nextDouble();
        luas = s * s;
        keliling = 4* s;
        System.out.print("Luas  = " + (int)luas + " \nKeliling = "+ (int)keliling);
        System.out.println("");
        }
    
}


