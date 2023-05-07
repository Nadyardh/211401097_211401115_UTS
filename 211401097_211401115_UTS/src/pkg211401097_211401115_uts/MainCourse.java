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
public class MainCourse {
    public static float harga;
    public void Show(){
        System.out.println("Main Course Menu");
    }
public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Jumlah Pesanan : ");
       int kuantitas = input.nextInt();
       harga+=1.5*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasShrimpScampi = Sold.KuantitasShrimpScampi+kuantitas;
               break;
           case 1:
               Sold.KuantitasGrilledChicken = Sold.KuantitasGrilledChicken+kuantitas;
               break;
           case 2:
               Sold.KuantitasRibeyeSteak = Sold.KuantitasRibeyeSteak+kuantitas;
               break;
           case 3:
               Sold.KuantitasCordonBleu = Sold.KuantitasCordonBleu+kuantitas;
               break;
           case 4:
               Sold.KuantitasSwedishMeatball = Sold.KuantitasSwedishMeatball+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int ShrimpScampi = 100000;
    int GrilledChicken = 80000;
    int RibeyeSteak = 150000;
    int CordonBleu = 80000;
    int SwedishMeatball = 80000;
            
    int[] biayaProduksi = new int[] {ShrimpScampi,GrilledChicken, RibeyeSteak,CordonBleu, SwedishMeatball};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Main Course:" +
                "\n1.Shrimp Scampi            Rp " + 1.5*biayaProduksi[0] +
                "\n2.Grilled Chicken          Rp " + 1.5*biayaProduksi[1] +
                "\n3.Ribeye Steak             Rp " + 1.5*biayaProduksi[2] +
                "\n4.Cordon Bleu              Rp " + 1.5*biayaProduksi[3] +
                "\n5.Swedish Meatball         Rp " + 1.5*biayaProduksi[4] +
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
