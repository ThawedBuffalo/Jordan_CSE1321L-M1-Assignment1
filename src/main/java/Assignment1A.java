import java.util.Scanner;

public class Assignment1A {
    public static void main(String[] args) {
        String scheme;
        String subdomain;
        String secondDomain;
        String topLevelDomain;
        String subdirectory;

        Scanner scan = new Scanner(System.in);

        // get the scheme input
        System.out.print("Enter a Scheme: ");
        scheme = scan.next();

        // get the subdomain input
        System.out.print("Enter a Subdomain: ");
        subdomain = scan.next();

        // get the second level domain input
        System.out.print("Enter a Second-level domain: ");
        secondDomain = scan.next();

        // get the top level domain input
        System.out.print("Enter a Top-level domain: ");
        topLevelDomain = scan.next();

        // get the sub-dir input
        System.out.print("Enter a Subdirectory: ");
        subdirectory = scan.next();

        // print out the URL
        System.out.println();
        System.out.println("Your URL is: ");
        System.out.println(scheme+ "://" +subdomain+ "." +secondDomain+ "." +topLevelDomain+ "/" +subdirectory);
    }
}
