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
public class Item3 extends Items {

    public Item3(int designedNumber, String name, int price) {
        super(designedNumber, name, price);
    }
    
    /**
     *
     * @return
    */
    
    @Override
    public String itemDescription() {
        
        return ("A steel sword!");
    }
}