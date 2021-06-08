/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billgenerator;

/**
 *
 * @author manish
 */
public class GetMenuFactory {
    public Menu getItem(String itemType){
        if(itemType == null){
            return null;
        }
        if(itemType.equalsIgnoreCase("momo")){
            return new Momo();
        }else if(itemType.equalsIgnoreCase("French Fries")){
            return new FrenchFries();
        }else if (itemType.equalsIgnoreCase("Chow mein")){
            return new Chowmein();
        }
        return null;
    }
    
}
