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
public class Order {
    Scanner input = new Scanner(System.in);  // Create a Scanner object

// Appetizer appetizer = new Appetizer();
public Order(){
        System.out.println("Order Selected!");
        System.out.println("Silakan Pilih Menu:\n1. Appetizer\n2. Main Course\n3. Dessert\n4. Drinks\n5. Kembali\nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.flush();
                Appetizer appetizer = new Appetizer();
                appetizer.Show();
                appetizer.Menu();
                break;
            case 2:
                System.out.flush();
                MainCourse maincourse = new MainCourse();
                maincourse.Show();
                maincourse.Menu();
                break;
            case 3:
                System.out.flush();
                Dessert dessert = new Dessert();
                dessert.Show();
                dessert.Menu();
                break;
            case 4:
                System.out.flush();
                Drinks drinks = new Drinks();
                drinks.Show();
                drinks.Menu();
                break;
            case 5:
                Main.Menu();
                break;
            default:
                break;
        }
    }
}
