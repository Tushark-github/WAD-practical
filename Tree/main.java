import java.util.*;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter the roll no - ");
        int rollno = sc.nextInt();

        // System.out.print("Enter the name- ");
        String name = sc.next();

        System.out.println("Output is " + rollno + " " + name);

    }
}