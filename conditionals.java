import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = 15;
        // if (age > 18) {
        //     System.out.println("\n \nyes boy you can drive!");
        // } else {
        //     System.out.println(" \n \nno boy you cannot drive yet ! \n ");
        // }

       
        

        // boolean a = true;
        // boolean b = true;
        // boolean c = false;
        // if (a && b && c) {
        //     System.out.println("yes");
        // } else {
        //     System.out.println("N0");
        // }


        // System.out.println("\n");

        // boolean k = true;
        // boolean m = true;
        // boolean n = false;
        // if (k || m || n) {
        //     System.out.println("yes");
        // } else {
        //     System.out.println("N0");
        // }

        // System.out.println("not k is :" + !k);
        // System.out.println("not m is : " + !m);




        // Else-if statement-----------------------------------
        // System.out.println("Enter your age below: ");
        // int ag = sc.nextInt();
        // if (ag < 15) {
        //     System.out.println("you are too young to start programming");
        // } else if (ag >= 18 && ag < 50) {
        //     System.out.println("you can start programming");
        // } else if (ag >= 50 && ag <= 70) {
        //     System.out.println("you should take retirement from programming");
        // }

        // else {
        //     System.out.println("you should be on your bed !");
        // }
        // System.out.println("\n");





        // System.out.println("enter any number between 1 to 20");
        // int num = sc.nextInt();

        // switch (num) {
        //     case 18:
        //         System.out.println("18 depects your age");
        //         break;
        //     case 20:
        //         System.out.println("you will enter in relationship 😂😂");
        //         break;
        //     case 5:
        //         System.out.println("you will never enter in relationship");
        //         break;
        //     case 10:
        //         System.out.println("I am 10");
        //         break;
        //     default:
        //         System.out.println("your number is not special");
        // }
        // System.out.println("\n");
      



        //another switch case unique example
        //    double i;
		// char j = 'b';

		// switch (j) {
		// case 'a':
		// case 'A':
		// 	i = 7.5;
		// 	break;
		// case 'b':
		// case 'B':
		// 	i = 5.5;
		// 	break;

		// case 'c':
		// case 'C':
		// 	i = 2.5;
		// 	break;

		// default:
		// 	i = 0.5;
		// }
		// System.out.println(i);
	    




            //   int k = 1;
          
            //   switch (k) {
          
            //     default:
            //       System.out.println("Have");
          
            //     case 'a':
            //       System.out.println("A");
          
            //     case 'b':
            //       System.out.println("Good Day");
          
            //   } 
            //output -- have a good day
          
            
          
          
          
        // Questions-----------------------------------------------------------

        // wap to find out weather a stu is pass of fail if it requires total 40% and at
        // least 33%in each sub to pass. assume 3 subs nd takes marks as an input from
        // the user

        // System.out.println("STUDENT RESULT CALCULATOR \n NOW TELL ME YOUR MARKS IN SUBJECT 1");
        // int sub1 = sc.nextInt();
        // System.out.println("ENTER YOUR MAKRS OF YOUR SECOND SUBJECT");
        // int sub2 = sc.nextInt();
        // System.out.println("ENTER YOUR MAKRS OF YOUR THIRD SUBJECT");
        // int sub3 = sc.nextInt();
        // System.out.println("ENTER YOUR MAKRS OF YOUR FOURTH SUBJECT");
        // int sub4 = sc.nextInt();
        // System.out.println("ENTER YOUR MAKRS OF YOUR FIFTH SUBJECT");
        // int sub5 = sc.nextInt();

        // double percentage = ((double) (sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;
        // if (percentage < 40 || sub1 < 33 || sub2 < 33 || sub3 < 33 || sub4 < 33 || sub5 < 33) {
        //     System.out.println("You are fail");
        // } else if (sub1 > 100 || sub2 > 100 || sub3 > 100 || sub4 > 100 || sub5 > 100) {
        //     System.out.println("you entered marks greater than 100 please try again");
        // }

        // else {
        //     System.out.println("you are pass");
        // }
        // System.out.println("Your result is: " + percentage + "%");

        

        // question ...WAP to find out the day of the week given the number[1 for
        // monday,2 for tuesday...so on!]

        // System.out.println("enter the number and I will tell you the day of the week");
        // int number = sc.nextInt();
        // switch (number) {
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("tuesday");
        //     case 3 -> System.out.println("wenday");
        //     case 4 -> System.out.println("thursday");
        //     case 5 -> System.out.println("friday");
        //     case 6 -> System.out.println("saturday");
        //     case 7 -> System.out.println("sunday");
        // }





        // WAP to find the type of url type of web
        // .com = commercial webi
        // org = prganizational web
        // .in = indian wed

        // System.out.println("ENTER THE NAME OF YOUR WEBSITE AND I WILL TELL YOU WHAT TYPE OF IT IS:");
        // String web = sc.nextLine().trim();
        // if (web.endsWith(".com")) {
        //     System.out.println("this is an commercial website ");
        // } else if (web.endsWith(".org")) {
        //     System.out.println("this is an organizational web");
        // } else if (!web.contains(".")) {
        //     System.out.println("please enter a valid web name");
        // } else {
        //     System.out.println("it is indian web");
        // }




        // wap for ROCK PAPER SEASOR

        // System.out.println("LETS PLAY ROCK PAPER SEASOR \n\n\n");

        // Random ran = new Random();
        // System.out.println("now we will play rock paper and sessor:");
        // System.out.println("1. Rock");
        // System.out.println("2. Paper");
        // System.out.println("3. Scissors");

        // int syswin = 0;
        // int uwin = 0;

        // for (int q = 0; q < 6; q++) {
        //     int numb = ran.nextInt(3 - 1 + 1) + 1;
        //     String play;
        //     if (numb == 1) {
        //         play = "rock";
        //     } else if (numb == 2) {
        //         play = "paper";
        //     } else {
        //         play = "seassor";
        //     }
        //     System.out.print("enter your number : ");
        //     int user = sc.nextInt();

        //     if (numb == user) {
        //         System.out.println("tie hogya jiiii ! \n\n");
        //     } else if ((user == 1 && numb == 2) || (user == 2 && numb == 3) || (user == 3 && numb == 1)) {
        //         System.out.println("system wins !\n\n");

        //         syswin = syswin + 1;
        //     } else {
        //         System.out.println("you won !!!");

        //         uwin = uwin + 1;
        //     }
        // }
        // if (syswin == 3) {
        //     System.out.println("hence the system wins");
        // } else if (syswin == uwin) {
        //     System.out.println("the mathch is tied");
        // } else {
        //     System.out.println("you won the final game !!!!");
        // }




        
             
        // System.out.println("enter 1st no. : ");
        // int num1 = sc.nextInt();
        
        // System.out.println("enter 2nd no. : ");
        // int num2 = sc.nextInt();

        // System.out.println("the greater number is : " + (num1>num2? num1:num2));




        //odd even ternary

        // System.out.println("welcome to odd even ");

        // System.out.println("enter the number 1: ");
        // int num3 = sc.nextInt();
        

        // System.out.println("enter the number 2: ");
        // int num4 = sc.nextInt();

        // System.out.println("the even number is : " + (num3%2==0?num3:num4));



       //absolute number

    //    System.out.println("enter any number for its absolute number : ");
    //    int num5 = sc.nextInt();
       
    //    System.out.println(num5>=0? num5: -num5);





    // WAP to categorize the students number in high moderate or low

    // System.out.println("enter the number's of student : ");
    // int numb = sc.nextInt();

    // System.out.println(numb>80? "High": (numb>50&&numb<80 ? "moderate": "Low") );




    //  System.out.println("welcome to number to month calculator !");
    //  System.out.println("enter the number bw 1-12");
    //  int monthNum=sc.nextInt();
    //  String month = getMonthName(monthNum);
    //  System.out.println(month);




     System.out.println(" \n\n welcome to simple Switch calculator ! \n\n");
     System.out.println("enter any one operation you want to perform \n \"-\" for substract , \n \"+\" for addition ,\n  \" * \" for multiply , \n  \"/ \" for divide ");
     
     String operation = sc.next();

     System.out.println("now enter the first number : ");
     int nmbr1 = sc.nextInt();

     System.out.println("now enter the 2nd number : ");
     int nmbr2 = sc.nextInt();

     double answer = switch (operation){
        case "+" -> nmbr1 + nmbr2;
        case "*" -> nmbr1 * nmbr2;
        case "/" -> nmbr1 / nmbr2;
        case "-" -> nmbr1 - nmbr2;
        default -> -1;
     };

     if(answer==-1){
         System.out.println("you made an Error!");
        }
     else  System.out.println("ur answer is : " + answer);



    }

    public static String getMonthName(int num) {
        return switch (num) {
            case 1 -> "january";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "jume";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "sept";
            case 10 -> "oct";
            case 11 -> "nov";
            case 12 -> "december";
            default -> "MARS MONTH";

        };

    }

}
