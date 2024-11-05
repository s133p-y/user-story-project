import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    //shows the arrays that are included in the user story
UserStory userStory = new UserStory("Country.txt", "Visitors.txt", "Rating.txt", "Accomodation.txt");
//makes a recommendation depending on the input in the parantheses using the information from the user story class
    System.out.println(userStory.makeReccomendation(4.5, "Yes"));

    


    
    
    
  }
}