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
public class Checkout {
static float totalOmset = Appetizer.harga + MainCourse.harga + Dessert.harga + Drinks.harga;
    static float totalBiayaProduksi = 0.25f * totalOmset;
    static float gajiKaryawan = 0.5f * totalBiayaProduksi;
    static float pajak = 0.1f * totalOmset;
    static float totalKeuntungan = totalOmset - totalBiayaProduksi - pajak - gajiKaryawan;
public Checkout(){
    System.out.println("Total Omset Penjualan: " + totalOmset);
    System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
    System.out.println("Biaya Produksi: " + totalBiayaProduksi);
    System.out.println("Biaya Pajak: " + pajak);
    System.out.println("Hasil Laba/Keuntungan Bersih : totalOmset - BiayaProduksi -  Pajak - Gaji karyawan dan Fasilitas pendukung = " + totalKeuntungan);
    Main.Menu();
}
}
