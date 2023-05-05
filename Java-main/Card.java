import java.security.SecureRandom;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();
        String[] face = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] CardFace = new String[52];
        String[] CardNum = new String[52];

        for (int i = 0; i < 52; i++) {
            CardFace[i] = face[i / 13];
            CardNum[i] = number[i % 13];
        }

        int z = 0;
        int ft = 52;
        int count = 0;
        for (int a = 0; a < 2; a++) {
            Scanner input = new Scanner(System.in);
            System.out.println("How many Cards:");
            int numOfCards = input.nextInt();

            int abc = numOfCards;

            for (int i = z; i < 52; i++) {
                int randNum = randomNum.nextInt(ft - z) + z;
                String tFace = CardFace[randNum];
                String tNum = CardNum[randNum];

                CardFace[randNum] = CardFace[i];
                CardNum[randNum] = CardNum[i];

                CardFace[i] = tFace;
                CardNum[i] = tNum;
            }

            for (int i = 0; i < numOfCards; i++) {
                String faces = CardFace[count];
                String nums = CardNum[count];
                count++;
                System.out.println(faces + "_" + nums);
            }
            z = z + abc;
            count = count + abc;
            System.out.println("____________________");
        }
    }
}