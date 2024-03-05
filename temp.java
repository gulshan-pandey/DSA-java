import java.util.*;
public class temp {
    
    public static void main(String[] args) {
        
        Map <String,String> countrymap = new HashMap <> ();

        countrymap.put("India","New Delhi");
        countrymap.put("China","Beijing");
        countrymap.put("Pak","islamabad");
        countrymap.put("England","london");
        countrymap.put("France","paris");
        countrymap.put("Nepal","kathmandu");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the country to get its capital: ");
        String name = sc.next();

        if(countrymap.containsKey(name)){
            System.out.println("the capital is : "+ countrymap.get(name));
        }
        else System.out.printf("sorry I dont have the capital of %s",name);



        
    }
}
