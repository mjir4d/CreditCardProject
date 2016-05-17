/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
class FindCard {
    
    protected static double findselectedcard(String cardname) {
        double returncardrate = 0;    
        
        switch (cardname) {
            case "Visa":
                returncardrate = .1;
                break;
            case "Discover":
                returncardrate = .05;
                break;
            case "Mastercard":
                returncardrate = .01;
                break;
            case "END":
                break;
            default:
                System.out.println("Input card type cannot be found");
                break;
        }
    
        return returncardrate;
    }
    
}
