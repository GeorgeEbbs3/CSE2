///////////////////////////////////////////
// George Ebbs
// hw02
// Aritmetic Java Program
// September 8, 2014

// This program will give practice to manipulate data stored in variables


public class Arithmetic {
    //now to establish main method
    public static void main(String[] args) {
        //the imput data 
        int nSocks=3; //number of socks
        double sockCost$=2.58; //Cost per pair of socks '$' is part of variable name
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; // Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per box of envelopes
        double taxPercent=0.06; //PA sales tax of 6%
        
        //declare variables for calculations
        //variables for socks
        double totalSockCost= nSocks*sockCost$; //total cost of socks pre-tax
        double taxValueforSocks= totalSockCost*taxPercent; //tax value for socks
        double finalSockCost= taxValueforSocks+totalSockCost; //final cost of socks (including tax)
        
        //variables for Glasses
        double totalGlassCost= nGlasses*glassCost$; //total cost of glasses pre-tax
        double taxValueforGlasses= totalGlassCost*taxPercent; //tax value for glasses
        double finalGlassCost= taxValueforGlasses+totalGlassCost; //final cost of Glasses (including tax)
        
        //variables for Envelopes 
        double totalEnvelopeCost= nEnvelopes+envelopeCost$; //total cost of envelopes pre-tax
        double taxValueforEnvelopes= totalEnvelopeCost*taxPercent; //tax value for envelopes
        double finalEnvelopeCost= taxValueforEnvelopes+totalEnvelopeCost; //final cost of envelopes (including tax)
        
        //variables for entire bill (all items included)
        double totalCartCost= totalSockCost+totalGlassCost+totalEnvelopeCost; //cost of all items in cart pre-tax
        double taxValueforCart= totalCartCost*taxPercent; //tax value for entire cart
        double finalCartCost= taxValueforCart+totalCartCost; //final cost for all items (including tax) 
        
        // Print out the output data
        //Output Data for Socks
        System.out.println("The first items bought were socks.");
        System.out.println("There were a total of "+ (nSocks) +" bought.");
        System.out.println("Each sock had a cost of "+ (sockCost$) +" dollars.");
        System.out.println("The total cost for the socks including sales tax was "+ (finalSockCost) +".");
        System.out.printf("The sales tax for each sock was %.2f",taxValueforSocks);
        
        //Output for Glasses
        System.out.println("\nThe second items bought were glasses.");
        System.out.println("There were a total of "+ (nGlasses) +" bought.");
        System.out.println("Each glass had a cost of "+ (glassCost$) +" dollars.");
        System.out.printf("The total cost for the glasses including sales tax was %.2f", finalGlassCost);
        System.out.printf("\nThe sales tax for each glass was %.2f", taxValueforGlasses);
        
        //Output for Envelopes
        System.out.println("\nThe third items bought were Envelopes.");
        System.out.println("There were a total of "+ (nEnvelopes) +" bought");
        System.out.println("Each Envelope as a cost of "+ (envelopeCost$) +" dollars.");
        System.out.printf("The total cost for the envelopes including sales tax was %.2f", finalEnvelopeCost);
        System.out.printf("\nThe sales tax for each envelope was %.2f", taxValueforEnvelopes); 
        
        //Output for Cart
        System.out.println("\nThe total cost of the purchases before taxes was "+ (totalCartCost) +".");
        System.out.printf("The total sales tax for all the items in the cart was %.2f", taxValueforCart);
        System.out.printf("\nThe total cost of the purchases including sales tax was %.2f", finalCartCost);
        
        
        
    } //end of main method
} // end of class 