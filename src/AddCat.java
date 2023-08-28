import java.util.Scanner;

public class AddCat extends Shelter{
    public AddCat(String city) {
        super(city);
    }
    public String catrace(){
        System.out.println("Insert cat's race");
        Scanner sc = new Scanner(System.in);
        String catrace = sc.nextLine().toLowerCase();
        return catrace;
    }

    public String color(){
        System.out.println("Insert cat's color");
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine().toLowerCase();
        return color;
    }

    public void catInfoCollector(AddCat addCat){
                String name = addCat.getName();
                int age = addCat.getAge();
               boolean isSterilized = addCat.isSterilized();
               String race = addCat.catrace();
               String color = addCat.color();
               addCat.addAndCount();
        System.out.println("You've added 1 cat: race =" + race + ", age = "+ age+", name = "+ name + ", sterilized = "+ isSterilized + ", color is  "+ color);
    }

}