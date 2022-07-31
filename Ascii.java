import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a character : ");
        //read integer from user
        char ch = scanner.next();
     
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}