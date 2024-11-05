/*
* Represents a tour
*/
public class Tour {
  
  private String country; // type of country
  private int visitor; // the number of vistors who visit that tour spot
  private double rating; // the rating of the places around the world
  private String accomodation; // if the hotel has an accomodation or not 
/*
  * Sets country, visitor, rating, and accomodation to the specified values
  */
  public Tour(String country, int visitor, double rating, String accomodation){
    this.country = country;
    this.visitor = visitor;
    this.rating = rating;
    this.accomodation = accomodation;
  }
  //toString method
  public String toString(){
    return "Country: " + country + "\nNumber of Visitors: " + visitor + "\nRating of the place: " + rating + "\nAccomodations: " + accomodation;
  }
/*
  * Getter methods for each of the variables that gets the value asked by the user
  */
  public String getCountry(){
    return country;
  }
  public int getVisitor(){
    return visitor;
  }
  public double getRating(){
    return rating;
  }
  public String getAccomodation(){
    return accomodation;
  }
}