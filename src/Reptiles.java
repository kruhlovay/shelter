import java.util.Arrays;
import java.util.Scanner;

public class Reptiles extends Shelter {

    public Reptiles(String city) {
        super(city);
    }

    public String defineAnimal() {
        System.out.println("Please define the animal");
        String animal;
        Scanner sc = new Scanner(System.in);
        animal = sc.nextLine();
        return animal;
    }
    public int count;
    public int addAnimal() {
        System.out.println("You've added " + defineAnimal());
      return ++count;
    }


      public boolean isVetRequired(){
          System.out.println("Please define whether the vet is required. Possible answers are \"Yes\" or \"No\"");
          String answer;
          Scanner sc = new Scanner(System.in);
          answer = sc.nextLine();
          if (answer=="no"){
              return false;
          }
          else if (answer=="yes"){
              return true;
          }
          else{
              return false;
          }

      }

}
