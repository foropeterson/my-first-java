import java.util.Scanner;

/**
 * Helloworld
 */
public class Helloworld {
    


public static void main(String[] args) {
    //int age = 27;
        //System.out.println("peterson is "+ age + "years old!");
      //    double number1 = 5.8;
    //int number2 = (int) number1;
    //System.out.println(number2);
       //int num1 = 12;
       //int num2 = 15;
        //System.out.println(num1 == num2);
        //System.out.println(num1 != num2);
        //System.out.println(num1 < num2);
        //System.out.println(num1 > num2);
        //System.out.println(num1 >= num2);
      //int age = 24;
       // age >=18;
       // age <=40;
       //System.out.println(age>=18 && age<=40);
      //boolean isStudent = false;
       //boolean islibralyMember =false;
       //System.out.println(!isStudent||islibralyMember);
       //int score = 0;
       //int turns = 10;
       //score ++;
       //turns --;
       //System.out.println(score);
       //System.out.println(turns);
       //int number = 55;
       //number++;
       //System.out.println(number);
//String name = "peterson foro";
//System.out.println(name);
//String  name = "peterson";
//String name = new String("peterson foro");
//System.out.println(name);
//String literalString1 = "abc";
//String literalString2 = "abc";

//String objectString2 =new String ("xyz");
//System.out.println(literalString1 == literalString2);
//System.out.println(ObjectString1 == objectString2);
//String name ="peterson";
//String country ="kenya";
//int age = 24;
//double gpa = 3.8;
//String company = "tracom service limmited";
//char percentSign = '%';
//boolean amITellingTheTruth = false;

//String formattedString = String.format("my name is %s iam from %s iam %d years old and i work for %s my gpa is %f i have attended 100%c of my accademy classes. These are all %b claims   ", name,country,age,company,gpa,percentSign,amITellingTheTruth);
//System.out.println(formattedString);
//String name = "peterson foro";
//System.out.println(name.length());
//System.out.println(name.isEmpty());
//System.out.println(name.toUpperCase());
//System.out.println(name);
//System.out.println(name.toLowerCase());
//System.out.println("helloworld am "+name+" from "+country+" am "+age+" years i work for "+company+".");

//String string1 = new String("abc");
//String string2 = new String("ABC");

//System.out.println(string1.equalsIgnoreCase  (string2));
//String  string = "the sky is blue.";
//String updatedString = string.replace("blue", "red");
//System.out.println(updatedString);
//System.out.println(string.replace("blue",   "red"));
//System.out.println(string);
//System.out.println(string.contains("sky"));
Scanner scanner = new Scanner(System.in);
//System.out.println("what is your name?");
//String name = scanner.nextLine();
//System.out.printf("hello %s how old are you",name);
//int age  = Integer.parseInt (scanner.nextLine());
//System.out.printf("%d is good to start coding what language do you prefer",age);
//String language = scanner.nextLine();
//System.out.printf("%s is a very popular programming language. ",language);
System.out.print("enter the first number");
double number1 = scanner.nextDouble();
System.out.print("enter the second number");
scanner.nextLine();
double number2 = scanner.nextDouble();
scanner.nextLine();
System.out.print("what operation do you want to perform?");

String operation = scanner.nextLine();
switch (operation) {
    case "sum":
        System.out.printf("%f+%f =%f",number1, number2, number1 + number2);
       
}
//if (operation.equals("sum")){
    //System.out.printf("%f+%f =%f",number1, number2, number1 + number2);
    //scanner.nextLine();

//}
//else if(operation.equals("sub")){
  //   System.out.printf("%f-%f =%f",number1, number2, number1 - number2);
//}
//else if(operation.equals("multiplication")){
  //   System.out.printf("%f*%f =%f",number1, number2, number1 * number2);
//}
//else if(operation.equals("div")){
  //  if (number2 ==0) {
    //    System.out.println("use you common sense there is no way you can divide a number by zero");
//}
//else{
  //  System.out.printf("%f/%f =%f",number1, number2, number1 / number2);
//}
  //  } 
//else {
  //  System.out.printf("why do you love sex");
//}


scanner.close();
    }
    
}