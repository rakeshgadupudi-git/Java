import java.util.Scanner;
public class YoutubeNamegenerator{
    public static void main(String args[]){
        Scanner objScanner= new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = objScanner.nextLine();
        System.out.println("Enter your surname");
        String surname = objScanner.nextLine();
     System.out.println(" The Name Of Youtube Channel is "+name+ " " + surname);

    objScanner.close();
    }

}