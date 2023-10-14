import java.util.Random;
// för att generera slumpmässigatal.
import java.util.Scanner;
// läser inmatningen och tar emot spelarens gissningar.
public class GuessingGame {


    public static void main(String[] args) { 
        // Här börjar koden.
       
        

Scanner scanner = new Scanner(System.in);
// kopplar svanner till inmatningstsrömmen
Random random = new Random ();
// skapar ett objekt så den kan generra slumpmässiga tal.

int lowestNumber = 1;
int highestNumber = 100;



String playAgain;
// frågar spelaren om den vill spela igen

do {
// gör så att spelet kan köras mer än en gång
int secretNumber = random.nextInt(highestNumber - lowestNumber +  1);
int numberOfTries = 0;
int guess;

System.out.println("Gissa ett tal mellan 1 och 100");

while (true) {
    System.out.print("Gissning" + (numberOfTries + 1) + ": ");
    // number of tries +1 vissar vilken gissning du är på
if (scanner.hasNextInt()) {
    // kontrollerar att det är ett heltal som inmatas
    guess = scanner.nextInt();
    // lägger in heltalet i guess
    scanner.nextLine();
    // läser in raden som användaren har skrivit och retunerar en sträng.

        if ( guess < lowestNumber || guess > highestNumber) {
            // kontrollerar om gissningen är inom de siffror somär nämnda.
            System.out.println(" Du kan bara gissa på ett tal mellan" + lowestNumber + "och" + highestNumber + ". Försök igen!");
continue;
// fortsätter till nästa iteration
}

numberOfTries++;
// ökar gissningarna varje gång med 1 och räknar antal gissningar.
if (guess < secretNumber) {
    System.out.println("Talet är större.");
} else if (guess > secretNumber) {
    System.out.println("Talet är mindre.");
} else {
    System.out.println("Du gissade rätt på " + numberOfTries + "försök.");
    break;
}
    } else {
System.out.println("Du kan bara skriva ett tal med siffror. Försök igen.");
    scanner.nextLine();

   
}

}  

System.out.print("Vill du spela igen (Ja/Nej?");
playAgain = scanner.nextLine().toLowerCase(); 

} while (playAgain.equals("ja"));
System.out.println("Tack för att du har spelat");

}



    }
