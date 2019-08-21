import java.io.FileNotFoundException;
import java.util.Scanner;

public class Draw {

    String spanishWord;
    String polishWord;
    Scanner input = new Scanner(System.in);


    public void getDraw() throws FileNotFoundException {


        GetFile getFile = new GetFile();
        getFile.readFromFile();

        int n = getFile.randomNumber();
        spanishWord = getFile.listOfWords.get(n).spanishWord;
        polishWord = getFile.listOfWords.get(n).polishWord;

        System.out.println(spanishWord);
        System.out.println(polishWord);


        //System.out.println("Podaj odpowiedz: ");
        // String input = scan.nextLine();
    }


    public int getCheck() {

        int n = 0;
        String wordFromPlayer = input.nextLine();

        if (polishWord.equals(wordFromPlayer)) {
            n = 1;

            //System.out.println(Result.OK);
        } else {

            //System.out.println(Result.NO);
        }
        return n;
    }


}
