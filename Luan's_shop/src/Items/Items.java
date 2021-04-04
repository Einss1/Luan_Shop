/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Luan
 */
public abstract class Items {
    
    //Properties
    public int designedNumber;  
    public String name;
    public int price;

    //Constructor
    public Items(int designedNumber, String name, int price) {
        
        this.designedNumber = designedNumber;
        this.name = name;
        this.price = price;
    }
    
    //Methods
    public int getdesignedNumber() {
        return this.designedNumber;
    }
 
    public String getName() {
        return this.name;
    }
 
    public int getPrice() {
        return this.price;
    }
    
    //abstract method
    public abstract String itemDescription();
}


