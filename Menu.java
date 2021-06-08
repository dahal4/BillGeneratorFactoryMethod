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
public abstract class Menu {
    protected double rate;
    abstract void getRate();
        
    
    void calculatebill(int quantities){
        System.out.println(quantities*rate);
        
    }
    
}
