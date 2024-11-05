import java.util.Scanner;
/*
* Manages data about tourism around the world
*/
public class UserStory {
private Tour[] tours;


// Displays the arrays used for information
  public UserStory(String countriesFile, String visitorsFile, String ratingsFile, String accomodationsFile) {
    tours = createTours(countriesFile, visitorsFile, ratingsFile, accomodationsFile);
  }
// Shows which array matches with the file
public Tour[] createTours(String countriesFile, String visitorsFile, String ratingsFile, String accomodationsFile){
  String[] countries = FileReader.toStringArray(countriesFile);
  int[] visitors = FileReader.toIntArray(visitorsFile);
  double[] ratings = FileReader.toDoubleArray(ratingsFile);
  String[] accomodations = FileReader.toStringArray(accomodationsFile);
  Tour[] t = new Tour[countries.length];

//for loop at index i
  for(int i=0; i<t.length; i++){
    t[i] = new Tour(countries[i], visitors[i], ratings[i], accomodations[i]);
  }
return t;
}

//makes a reccomendation depending on the input
  public Tour makeReccomendation(double uRating, String uAccom){
    // 3. Traverse the Tour array
    for(int i=0; i<tours.length; i++){
    // 4. Check if the user rating is inbetween some threshold (.5)
      if(uRating - tours[i].getRating() < .5)  {
      // 5. CHeck if the users accomodation matches the tour 
        if (uAccom.equals(tours[i].getAccomodation())) {
        // 6. If both are true, print out that tour object
        return(tours[i]);
        }
      }
    // 7. If no match, say  "Sorry no tours with that given info"
    }  
    System.out.println("Sorry no tours with that given info");
    return null;
  }
//scanner attempt not called in program
public double promptUserForRating () {
 Scanner input = new Scanner (System.in);
  System.out.println("What rating would you like 0-4?");
  double option = input.nextDouble();
  input.close ();
  return option;
}
  public String promptUserForAcc () {
    Scanner input = new Scanner (System.in);
    System.out.println ("Yes or No accomodation");
    String option = input.nextLine();
    input.close ();
    return option;
  }



 //toString method 
  public String toString() {
    String result = "";

    for (Tour t : tours) {
      result += t + "\n\n";
    }
    return result;
  }
  
}