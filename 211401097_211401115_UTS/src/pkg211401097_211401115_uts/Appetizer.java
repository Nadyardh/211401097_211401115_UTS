/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg211401097_211401115_uts;

import java.util.Scanner;
public class Appetizer {
    public static float harga;
    public void Show(){
        System.out.println("Appetizer Menu");
}
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Jumlah Pesanan : ");
       int kuantitas = input.nextInt();
       harga+=1.5*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasBeefBurger = Sold.KuantitasBeefBurger+kuantitas;
               break;
           case 1:
               Sold.KuantitasOnionRings = Sold.KuantitasOnionRings+kuantitas;
               break;
           case 2:
               Sold.KuantitasChikenStrips = Sold.KuantitasChikenStrips+kuantitas;
               break;
           case 3:
               Sold.KuantitasCheesePizza = Sold.KuantitasCheesePizza+kuantitas;
               break;
           case 4:
               Sold.KuantitasNachos = Sold.KuantitasNachos+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int BeefBurger = 70000;
    int OnionRings = 30000;
    int ChikenStrips = 65000;
    int CheesePizza = 55000;
    int Nachos = 40000;
            
    int[] biayaProduksi = new int[] {BeefBurger,OnionRings,ChikenStrips,CheesePizza,Nachos};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Makanan:" +
                "\n1.Beef Burger      Rp " + 1.5*biayaProduksi[0] +
                "\n2.Onion Rings      Rp " + 1.5*biayaProduksi[1] +
                "\n3.Chiken Strips    Rp " + 1.5*biayaProduksi[2] +
                "\n4.Cheese Pizza     Rp " + 1.5*biayaProduksi[3] +
                "\n5.Nachos           Rp " + 1.5*biayaProduksi[4] +
                "\n6.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                Kuantitas(0);
                Menu();
                break;
            case 2:
                Kuantitas(1);
                Menu();
                break;
            case 3:
                Kuantitas(2);
                Menu();
                break;
            case 4:
                Kuantitas(3);
                Menu();
                break;
            case 5:
                Kuantitas(4);
                Menu();
                break;
            case 6:
                new Order();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }

}
