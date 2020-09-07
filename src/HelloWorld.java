import java.util.Scanner;

public class HelloWorld {

    // Første Programmerings time hvor vi lære at skrive "Hello World"
    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("Hello World");

        // Jeg leger bare med noget ekstra
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv noget!");
        String str = sc.nextLine();
        //System.out.println(str);
        System.out.println("Du har skrevet: " + str + "\nSmart ikke?");

    }
}
