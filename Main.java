import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("happyorsad.txt");
        Scanner scan = new Scanner(file);

        int happyCounter = 0;
        int sadCounter = 0;
        String[] line = scan.nextLine().split(" ");

        for (int i = 0; i < line.length; i++) {
            if(line[i].equals(":-)")){
                happyCounter++;
            } else if (line[i].equals(":-(")){
                sadCounter++;
            }
        }

        if(happyCounter == sadCounter){
            System.out.println("unsure");
        } else if (happyCounter == 0 && sadCounter == 0){
            System.out.println("none");
        } else if (happyCounter < sadCounter){
            System.out.println("sad");
        } else if (happyCounter > sadCounter){
            System.out.println("happy");
        }



    }
}