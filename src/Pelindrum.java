import java.util.Scanner;

public class Pelindrum {
    public static void main(String [] args){
        Scanner SC1=new Scanner(System.in);

        System.out.println("Enter your number: ");
int number=SC1.nextInt();
String numberStr=  String.valueOf(number);
String reverseStr= new StringBuilder(numberStr).reverse().toString();
if (numberStr.equals(reverseStr)){
    System.out.println(number + " is pelindrom");
}
else {
    System.out.println(number+"is not a pelindrom");
}
    }
}
