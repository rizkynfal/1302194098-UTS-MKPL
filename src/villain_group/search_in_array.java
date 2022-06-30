/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villain_group;

/**
 *
 * @author Komang
 */
import java.util.Scanner;

public class search_in_array {
    public static void main (String[] args){
        
       
        int loop_i, loop_j, loop_k, loop_z;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ini baris 1, berisi 3 bil kelipatan 5, dimulai dari 5: ");
        for (loop_i = 0; loop_i < 3; loop_i++) {
            search [0][loop_i] =search [0][0] + 5;
            search [0][0] = search[0][loop_i];
            System.out.print(search [0][loop_i] + " ");
        }
        System.out.println(" ");
        
        System.out.println("Ini baris 2, berisi 4 bil genap, dimulai dari 2 : ");
        for (loop_j = 0; loop_j < 9; loop_j++) {
            if (loop_j < 9) {
                search [1][loop_j] = loop_j + 1;
                if (search [1][loop_j] % 2 == 0) {
                    System.out.print(search [1][loop_j] + " ");
                }
            }
        }
        System.out.println(" ");
        
        System.out.println("Ini baris 3, berisi 5 bil kuadrat dari bil asli, dimulai dari 1 : ");
        for (loop_k = 0; loop_k < 5; loop_k++) {
            search [2][loop_k] = (loop_k + 1) * (loop_k + 1);
            System.out.print(search [2][loop_k] + " ");
        }
        System.out.println(" ");
        
        System.out.println("Ini baris 4, berisi 6 bil asli berurutan dimulai dari 3 : ");
        for (loop_z = 0; loop_z < 7; loop_z++) {
            search [3][loop_z] = search [3][0] + 1;
            search [3][0] = search [3][loop_z];
            
            if (search [3][loop_z] >= 3){
                System.out.print(search [3][loop_z] + " ");
            }
        }
        System.out.println(" ");
        
        int mencari;
        System.out.print("Masukkan angka yang ingin dicari : ");
        mencari = scan.nextInt();
        boolean cek = false;
        for (int cari_baris = 0; cari_baris < search.length; cari_baris++) {
            for (int cari_kolom = 0; cari_kolom < search.length; cari_kolom++) {
                if (search [cari_baris][cari_kolom] == mencari) {
                    System.out.println("Angka yang dicari " + mencari);
                    System.out.println(mencari + " Berada pada baris " + cari_baris + ", kolom " + cari_kolom);
                    cek = true;
                }
            }
            
        }
        if (cek == false) {
           System.out.println("Angka yang dicari tidak ada");
        }
    }
}
