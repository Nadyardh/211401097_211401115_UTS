/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg211401097_211401115_uts;

/**
 *
 * @author user1
 */
import java.util.Scanner;
public class Drinks {
    public static float harga;
    public void Show(){
        System.out.println("Drinks Menu");
    }
public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Jumlah Pesanan : ");
       int kuantitas = input.nextInt();
       harga+=1.5*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasSparklingWater = Sold.KuantitasSparklingWater+kuantitas;
               break;
           case 1:
               Sold.KuantitasIcedCoffee = Sold.KuantitasIcedCoffee+kuantitas;
               break;
           case 2:
               Sold.KuantitasKiwiCooler = Sold.KuantitasKiwiCooler+kuantitas;
               break;
           case 3:
               Sold.KuantitasMartili = Sold.KuantitasMartili+kuantitas;
               break;
           case 4:
               Sold.KuantitasTequilaSunrise = Sold.KuantitasTequilaSunrise+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int SparklingWater = 25000;
    int IcedCoffee = 30000;
    int KiwiCooler = 40000;
    int Martili = 40000;
    int TequilaSunrise = 45000;
            
    int[] biayaProduksi = new int[] {SparklingWater,IcedCoffee, KiwiCooler,Martili, TequilaSunrise};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Drinks:" +
                "\n1.Sparkling Water      Rp " + 1.5*biayaProduksi[0] +
                "\n2.Iced Coffee          Rp " + 1.5*biayaProduksi[1] +
                "\n3.KiwiCooler           Rp " + 1.5*biayaProduksi[2] +
                "\n4.Martili              Rp " + 1.5*biayaProduksi[3] +
                "\n5.TequilaSunrise       Rp " + 1.5*biayaProduksi[4] +
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
