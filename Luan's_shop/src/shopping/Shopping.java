/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import Items.Item1;
import Items.Item2;
import Items.Item3;
import Items.Item4;
import java.util.Scanner;

/**
 *
 * @author Luan Navarro Silva - 2020344
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    ShoppingBag myBag = new ShoppingBag(); //this is myBag. I can buy things to put in it
    Scanner sc = new Scanner(System.in); //activates Scanner
    int itemPick = 0 ; //initialized to force the loop
    int quantity1, quantity2, quantity3, quantity4; //how many items were bought
    int price1 = 0, price2 = 0, price3 = 0, price4 = 0; //price of the item depending how many were bought
    Item1 i1 = new Item1(1, "Health Potion", 5); //item 1
    Item2 i2 = new Item2(2, "Mana Potion", 5); //item 2
    Item3 i3 = new Item3(3, "Sword", 20); //item 3
    Item4 i4 = new Item4(4, "Shield", 20); //item 4

        while(itemPick != 6){ //while loop

            System.out.println("-- Welcome to Luan's shop--"); //system prints the items and a welcome message :)
            
            System.out.println(i1.designedNumber + " - " + i1.name + " - " + i1.price + "$");
            System.out.println(i1.itemDescription() + "\n");
            
            System.out.println(i2.designedNumber + " - " + i2.name + " - " + i2.price + "$");
            System.out.println(i2.itemDescription() + "\n");
            
            System.out.println(i3.designedNumber + " - " + i3.name + " - " + i3.price + "$");
            System.out.println(i3.itemDescription() + "\n");
            
            System.out.println(i4.designedNumber + " - " + i4.name + " - " + i4.price + "$");
            System.out.println(i4.itemDescription() + "\n");
            
            System.out.println("5 - Leave Shop" + "\n");
            
            System.out.println("What would you like to purchase?"); //user has to choose what he wants to purchase (or leave the shop)
            
            itemPick = sc.nextInt(); //the option will be stored in the variable "itemPick"
        

            switch (itemPick) { 
            case 1:
                myBag.buyItem(i1.name);
                System.out.println("\n" + "How many health potions?");
                quantity1 = sc.nextInt();
                System.out.println("");
                price1 = quantity1 * i1.price;
                continue; //to continue with the loop
            case 2:
                myBag.buyItem(i2.name);
                System.out.println("\n" + "How many mana potions?");
                quantity2 = sc.nextInt();
                System.out.println("");
                price2 = quantity2 * i2.price;
                continue;
            case 3:
                myBag.buyItem(i3.name);
                System.out.println("\n" + "How many swords?");
                quantity3 = sc.nextInt();
                System.out.println("");
                price3 = quantity3 * i3.price;
                continue;
            case 4:
                myBag.buyItem(i4.name);
                System.out.println("\n" + "How many shields?");
                quantity4 = sc.nextInt();
                System.out.println("");
                price4 = quantity4 * i4.price;
                continue;
            case 5:
                System.out.println("");
                System.out.println("You purchased:" +"\n");
                System.out.println(myBag.emptyBag());
                System.out.println("The total spent was " + (price1 + price2 +price3 +price4) + "$" + "\n");
                System.out.println("Thank you for buying with us! Please come again!");
                System.exit(0);
            
            default:
                System.out.println("Error, please only insert numbers 1 - 5");
            }    
        }            
    }       
}
        
    
    
