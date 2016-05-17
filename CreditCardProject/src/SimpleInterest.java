
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
class SimpleInterest {
    
    //Global variables
    protected double initialbalance = 0;
    protected double finalinterest = 0;
    protected int numwallets;
    protected int numcards;
    
    //recieves list from PersonTest, This is all the cards used
    ArrayList<String> walletofcards = new ArrayList<>();
    
    @Test
    protected void simpleinteresttest(int numwallets, int numcards, ArrayList<String> walletofcards, double initialbalance) {
        
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
                            selectedcardrate = FindCard.findselectedcard(walletofcards.get(k));
                      
                            //Calculates simple interest and prints
                            finalinterest = InterestCalc.simpleinterestcalc(selectedcardrate, initialbalance);
                        
                        
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
                selectedcardrate = FindCard.findselectedcard(walletofcards.get(k));
                      
                //Calculates simple interest and prints
                finalinterest = InterestCalc.simpleinterestcalc(selectedcardrate, initialbalance);
                System.out.println(walletofcards.get(k) + " simple interest is $" + finalinterest);
                
                totalpersoninterest = finalinterest + totalpersoninterest;
            }
            
            System.out.println();
            System.out.println("Total interest for this person is $" + totalpersoninterest);
            
        }
        
    }
}
        
      
