
import java.util.ArrayList;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class Person {
    
    //Global variables
    private final double visarate = .1;
    private final double discoverrate = .05;
    private final double mastercardrate = .01;
    double initialbalance = 0;
    double finalinterest = 0;
    public int numwallets;
    public int numcards;
    
    //recieves list from PersonTest, This is all the cards used
    ArrayList<String> walletofcards = new ArrayList<>();
    
       
    @Test
    //public void simpleinteresttest(int numwallets, int numcards, String cardnames, double initialbalance) {
    public void simpleinteresttest(int numwallets, int numcards, ArrayList<String> walletofcards, double initialbalance) {
        //local variables
        int i;
        int j = 1;
        int k;
        int k2 = 0;
        
        double totalwalletinterest = 0.0;
        double totalwalletinterest2 = 0.0;
        double totalpersoninterest = 0.0;
        double selectedcardrate;
        
        
        //multiple wallets
        if (numwallets > 1) {
              
                System.out.println("Number of wallets = " + numwallets);
                System.out.println("Number of cards = " + (numcards - numwallets + 1));
                System.out.println();
               
                    //for numcards, k2 keeps card number cumulative
                    for (k = k2; k < numcards; k++) {
                        //if END is hit, current number is printed
                        if (walletofcards.get(k).equals("END")) {
                            
                            System.out.println("Wallet " + (j) + " = $" + totalwalletinterest);
                            System.out.println();
                            totalwalletinterest2 = totalwalletinterest;
                            totalwalletinterest = 0;
                            j++;
                            
                            
                        }
                        else {
                            //Grabs cardrate based on Arraylist entry
                            selectedcardrate = findselectedcard(walletofcards.get(k));
                      
                            //Calculates simple interest and prints
                            finalinterest = simpleinterestcalc(selectedcardrate, initialbalance);
                        
                        
                                System.out.println(walletofcards.get(k) + " simple interest is $" + finalinterest);
                        
                            totalwalletinterest = finalinterest + totalwalletinterest;
                        } 
                    }
                    
                    System.out.println("Wallet " + (j) + " = $" + totalwalletinterest);
                    
                    totalwalletinterest2 = totalwalletinterest + totalwalletinterest2;
                    System.out.println();
                    System.out.println("Total for person is $" + totalwalletinterest2);
                    
                    
                    totalpersoninterest = finalinterest + totalpersoninterest;
               
             
        }
        //1 Wallet situation
        else {
            
            System.out.println("Number of wallets = " + numwallets);
            System.out.println("Number of cards = " + numcards);
            System.out.println();
            
            for (k = 0; k < numcards; k++) {
                
                //Grabs cardrate based on Arraylist entry
                selectedcardrate = findselectedcard(walletofcards.get(k));
                      
                //Calculates simple interest and prints
                finalinterest = simpleinterestcalc(selectedcardrate, initialbalance);
                System.out.println(walletofcards.get(k) + " simple interest is $" + finalinterest);
                
                totalpersoninterest = finalinterest + totalpersoninterest;
            }
            
            System.out.println();
            System.out.println("Total interest for this person is $" + totalpersoninterest);
            
        }
        
        
    }
    
     
    
    //Identify a cardname from Arraylist and return its rate
    public double findselectedcard(String cardname) {
        double returncardrate = 0;    
        
        switch (cardname) {
            case "Visa":
                returncardrate = visarate;
                break;
            case "Discover":
                returncardrate = discoverrate;
                break;
            case "Mastercard":
                returncardrate = mastercardrate;
                break;
            case "END":
                break;
            default:
                System.out.println("Input card type cannot be found");
                break;
        }
    
        return returncardrate;
    }
    
    
    //Simple interest calculation
    private double simpleinterestcalc(double selectedcardrate, double initialbalance) {
        
        finalinterest = selectedcardrate * initialbalance;
        return finalinterest;
        
    }
    
   
    
}
