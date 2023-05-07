/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg211401097_211401115_uts;
/**
 *
 * @author user
 */
import java.util.Scanner;

public class Dessert {
    public static float harga;
    public void Show(){
        System.out.println("Dessert Menu");
    }
    
public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Jumlah Pesanan : ");
       int kuantitas = input.nextInt();
       harga+=1.5*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasCheeseCake = Sold.KuantitasCheeseCake+kuantitas;
               break;
           case 1:
               Sold.KuantitasDaifukuMochi = Sold.KuantitasDaifukuMochi+kuantitas;
               break;
           case 2:
               Sold.KuantitasTiramisu = Sold.KuantitasTiramisu+kuantitas;
               break;
           case 3:
               Sold.KuantitasFranceGelato = Sold.KuantitasFranceGelato+kuantitas;
               break;
           case 4:
               Sold.KuantitasOreoChurros = Sold.KuantitasOreoChurros+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int CheeseCake = 50000;
    int DaifukuMochi = 30000;
    int Tiramisu = 40000;
    int FranceGelato = 60000;
    int OreoChurros = 35000;
            
    int[] biayaProduksi = new int[] {CheeseCake,DaifukuMochi,Tiramisu,FranceGelato,OreoChurros};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Dessert:" +
                "\n1.Cheese Cake        Rp " + 1.5*biayaProduksi[0] +
                "\n2.Daifuku Mochi      Rp " + 1.5*biayaProduksi[1] +
                "\n3.Tiramisu           Rp " + 1.5*biayaProduksi[2] +
                "\n4.France Gelato      Rp " + 1.5*biayaProduksi[3] +
                "\n5.Oreo Churros       Rp " + 1.5*biayaProduksi[4] +
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



