/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author manish
 */
public class GenerateBill {

    public static void main(String[] args) throws IOException {
        String momo = "Momo";
        String chowMein = "Chow Mein";
        String frenchFries = "French Fries";
        GetMenuItem planFactory = new GetMenuItem();
        System.out.println("Select the menu items:");
        System.out.println("1.Momo");
        System.out.println("2.French Fries");
        System.out.println("3.Chow mein");
        System.out.println("4.Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(br.readLine());
        String item = null;
        int quantity = 0;
        switch (choice) {
            case 1: {
                item = "Momo";
                System.out.println("Enter the quantity:");
                quantity = Integer.parseInt(br.readLine());
                break;
            }
            case 2: {
                item = "French Fries";
                System.out.println("Enter the quantity:");
                quantity = Integer.parseInt(br.readLine());
                break;

            }
            case 3: {
                item = "Chow mein";
                System.out.println("Enter the quantity:");
                quantity = Integer.parseInt(br.readLine());
                break;

            }
            default:

                break;
        }
        if (item != null) {
            Plan p = planFactory.getPlan(item);

            System.out.println("Bill amount for " + item + " of " + quantity + " plates is:");
            p.getRate();
            p.calculatebill(quantity);
        }

    }
}
