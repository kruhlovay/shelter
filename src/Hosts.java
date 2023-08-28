import java.util.Scanner;

public class Hosts {
    Scanner sc = new Scanner(System.in);
    public String defineHost(){
        System.out.println("Insert name and surname of a new host");
        String name;
        name = sc.nextLine();
        return name;
    }

    public int telephone(){
        System.out.println("Insert the telephone number");
        int number = sc.nextInt();
        return number;
    }

    public boolean isBlackListed(){
        System.out.println("Type whether the host is blacklisted: yes or no");
        String blacklisted;
        Scanner sc = new Scanner(System.in);
        blacklisted= sc.nextLine();
        if(blacklisted == "yes"){
            return true;
        }
        else if(blacklisted == "no"){

            return false;
        }
        else {
            return false;
        }
    }

    public void collectInfo(){
        System.out.println("Name of host: "+defineHost() + ", Telephone number: "+ telephone()+", the host is blacklisted: "+ isBlackListed());
    }
}
