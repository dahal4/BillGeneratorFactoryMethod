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
    public Menu getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("momo")){
            return new Momo();
        }else if(planType.equalsIgnoreCase("French Fries")){
            return new FrenchFries();
        }else if (planType.equalsIgnoreCase("Chow mein")){
            return new Chowmein();
        }
        return null;
    }
    
}
