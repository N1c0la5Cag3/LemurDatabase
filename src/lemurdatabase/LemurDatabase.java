/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import java.util.Scanner;

/**
 *
 * @author luoos2514
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lemurs would you like to add?");
        String addLemurs = sc.nextLine();
        int addLemursNum = Integer.parseInt(addLemurs);
        
        /*Lemur[] LEMURS = new DesertLemur[addLemursNum];
        Mammal LEMUUUUUR = new Lemur();
        LEMUUUUUR = new DesertLemur();
        
        for (Object Lemur: LEMURS){
            System.out.println("LEMURS");
        }*/
        
    }
    
}
