/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg211401097_211401115_uts;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {

    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("\n--- Welcome To Le Quartier ---\n");
        System.out.print("Silakan Pilh Menu:\n1. Order Makanan\n2. Perhitungan Hari ini\n3. Keuntungan Penjualan\n4. Detail Produk Terjual\n5. Exit\nPilih: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Order();
                break;
            case 2: new Checkout();
                break;
            case 3: new Show();
                break;
            case 4: new Sold();
                break;
            default:
                break;
        }
    }    
    public static void main(String[] args) {
        Menu();
    }

}
