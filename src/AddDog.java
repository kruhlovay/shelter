import java.util.Scanner;

public class AddDog extends Shelter{
    public AddDog(String city) {
        super(city);
    }
    public String dograce(){
        System.out.println("Insert dog's race");
        Scanner sc = new Scanner(System.in);
        String dograce = sc.nextLine().toLowerCase();
        return dograce;
    }

    public float height(){
        System.out.println("Insert the dog's height");
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        return height;
    }

    public String size(){
       float height = height();

        String size;
        if (height>1){
            size = "big";
        }
        else if(height<1 && height>0.5){
            size = "medium";
        }
        else{
            size = "small";
        }
        System.out.println(size);
        return size;
    }


    public void chooseDogHouse(AddDog addDog){

        switch(addDog.size()){
            case "small":
                System.out.println("Houses 1-5");
                break;
            case "medium":
                System.out.println("Houses 6-11");
                break;
            case "big":
                System.out.println("Houses 11-16");
                break;
            default:
                System.out.println("Not valid height");
            }
        }
    }

