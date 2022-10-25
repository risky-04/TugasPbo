/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_today;

import java.util.Scanner;

public class bio_data {
    public static void main(String[] args) {
        String nama,alamat;
        int umur,nisn;
        
        Scanner datadiri = new Scanner(System.in);
        System.out.println("<----data diri---->");
        System.out.println("Nama anda :");
        nama = datadiri.nextLine();
        System.out.println("Alamat :");  
        alamat = datadiri.nextLine();
        System.out.println("umur :");
        umur = datadiri.nextInt();
        System.out.println("nisn :");
        nisn = datadiri.nextInt();
        System.out.println("-------------");
        System.out.println("Nama:"+nama);
        System.out.println("Alamat:"+alamat);
        System.out.println("Umur:"+umur);
        System.out.println("Nisn:"+nisn);
        
        
        
    }
}
