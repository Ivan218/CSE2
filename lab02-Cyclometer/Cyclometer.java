//Ivan Rivera
//lab02 Cyclometer
//September 4, 2015
//CSE2-110,111

/*The purpose of the program is to take two pieces of info (time and the number of rotations the front wheel has)
and calculate other pertinent information that is true such as the distance of each trip and the total distance between
the two trips.
*/
public class Cyclometer {
    
    //Define main method of the program
    public static void main (String args[]) {
        
        //Store given data below
        int secsTrip1=480;  //Store duration of trip 1 in seconds
       	int secsTrip2=3220;  //Store duration of trip 2 in seconds
		int countsTrip1=1561;  //Store rotations of front wheel for trip 1
		int countsTrip2=9037; //Store rotations of front wheel for trip 2
		
		//Store intermediate variables and necessary constants
		double wheelDiameter=27.0,  //Diameter of wheel to calculate distance traveled given the time and number of rotations of a trip
  	    PI=3.14159, //Store a necessary constant, pi
  	    feetPerMile=5280,  //Store a necessary conversion constant; from miles to feet
  	    inchesPerFoot=12,   //Store a necessary conversion constant; from feet to inches
  	    secondsPerMinute=60;  //Store a necessary conversion constant; from minutes to seconds
	    double distanceTrip1, distanceTrip2,totalDistance;  //define some variables without yet assigning a value to them
		
		//Print time of each trip in minutes and counts for each trip
		System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
	    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
		
		
		distanceTrip1 = countsTrip1 * wheelDiameter * PI; //Calculates distance in inches
    	//Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1 /= inchesPerFoot * feetPerMile; // Gives distance in miles using /= notation
        distanceTrip2 = countsTrip2 * wheelDiameter * PI/inchesPerFoot/feetPerMile;//Gives distance in miles without /= notation
    	totalDistance = distanceTrip1 + distanceTrip2; //Calculates and stores in var totalDistance
    	
        //Print out the output data.
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    	System.out.println("The total distance was " + totalDistance + " miles");

		
    } //end of main method
    
} //end of class