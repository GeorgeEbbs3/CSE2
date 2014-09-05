/////////////////////////////////////////
// George Ebbs 
// Lab Two
// Cyclometer Java Program
// September 5th, 2014
/*type This program should: 
a. Print the number of minutes for each trip
b. Print the number of counts for each trip
c. Printthe distance of each trip in miles
d. Print the distance for the two trips combined
*/

//
public class Cyclometer {
    //main method is required for java program
    public static void main(String[] args) {
        // our input data
        int secsTrip1=480; //Prints the number of seconds in Trip1
        int secsTrip2=3220; //Prints the number of seconds in Trip2
        int countsTrip1=1561; //Prints the number of counts for Trip1
        int countsTrip2=9037; //Prints the number of counts for Trip2
        // our intermediate variables
        double wheelDiameter=27.0, //States the double diameter 
        PI=3.14159, //gives value for PI
        feetPerMile=5280, //States how many feet per mile
        inchesPerFoot=12, //States how many inches are in a foot
        secondsPerMinute=60; //States how many seonds are in a minute 
        double distanceTrip1, distanceTrip2, totalDistance; //Doubles the trip distance for Trip1, Trip2, and total distance
        //Print out the numbers that are stored in Variables that store seconds and counts
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute) +"minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute) +"minutes and had "+
            countsTrip2+" counts.");
            
        //run the calculations; store the values.
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } //end of main method
} //end of class

