/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author Matthew
 */
public class PersonTest {
    
  @Test 
  public void test1() {
    
    System.out.println("---------------Test 1---------------");
      
    Person tester = new Person();
    
    //String arraylist of cards for testing
    ArrayList<String> walletofcards = new ArrayList<>();
    walletofcards.add("Visa");
    walletofcards.add("Mastercard");
    walletofcards.add("Discover");
    

    //calls method for test
    //int numwallets, int numcards, ArrayList<String> walletofcards, double initialbalance
    tester.simpleinteresttest(1, walletofcards.size(), walletofcards, 100);
  }
  
  @Test 
  public void test2() {
      
    System.out.println();
    System.out.println("---------------Test 2---------------");
    
    Person tester = new Person();
    
    //String arraylist of cards for testing
    ArrayList<String> walletofcards = new ArrayList<>();
    walletofcards.add("Visa");
    walletofcards.add("Discover");
    walletofcards.add("END"); //signifies transition to new wallet
    walletofcards.add("Mastercard");
    

    //calls method for test
    //int numwallets, int numcards, ArrayList<String> walletofcards, double initialbalance
    tester.simpleinteresttest(2, walletofcards.size(), walletofcards, 100);
  }
  
  @Test 
  public void test3() {
      
    System.out.println();
    System.out.println("---------------Test 3---------------");
    
    Person tester = new Person();
    
//Person 2
    System.out.println("Person 1");
    
    //String arraylist of cards for testing
    ArrayList<String> walletofcards = new ArrayList<>();
    walletofcards.add("Mastercard");
    walletofcards.add("Visa");
    walletofcards.add("Discover"); 
    
    //calls method for test
    //int numwallets, int numcards, ArrayList<String> walletofcards, double initialbalance
    tester.simpleinteresttest(1, walletofcards.size(), walletofcards, 100);   
    System.out.println("");
    
//Person 2
    System.out.println("Person 2");
    
    //String arraylist of cards for testing
    walletofcards.clear();
    walletofcards.add("Visa");
    walletofcards.add("Mastercard");
    
    tester.simpleinteresttest(1, walletofcards.size(), walletofcards, 100);
    
  }
    
}
