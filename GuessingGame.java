import java.util.Random;
// för att generera slumpmässigatal.
import java.util.Scanner;
// läser inmatningen och tar emot spelarens gissningar.
public class GuessingGame {


    public static void main(String[] args) { 
       
        

Scanner scanner = new Scanner(System.in);
Random random = new Random ();

int lowestNumber = 1;
int highestNumber = 100;



String playAgain;

do {

int secretNumber = random.nextInt(highestNumber - lowestNumber +  1);
int numberOfTries = 0;
int guess;

System.out.println("Gissa ett tal mellan 1 och 100");

while (true) {
    System.out.print("Gissning" + (numberOfTries + 1) + ": ");
if (scanner.hasNextInt()) {
    guess = scanner.nextInt();
    scanner.nextLine();

        if ( guess < lowestNumber || guess > highestNumber) {
            System.out.println(" Du kan bara gissa på ett tal mellan" + lowestNumber + "och" + highestNumber + ". Försök igen!");
continue;
}

numberOfTries++;
if (guess < secretNumber) {
    System.out.println("Talet är större.");
} else if (guess > secretNumber) {
    System.out.println("Talet är mindre.");
} else {
    System.out.println("Du gissade rätt på " + numberOfTries + "försök.");
    break;
}
    } else {
System.out.println("Du kan bara gissa på heltal. Försök igen.");
    scanner.nextLine();

   
}

}  

System.out.print("Vill du spela igen (Ja/Nej?");
playAgain = scanner.nextLine().toLowerCase(); 

} while (playAgain.equals("ja"));
System.out.println("Tack för att du har spelat");

}



    }
