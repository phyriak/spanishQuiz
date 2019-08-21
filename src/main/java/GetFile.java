
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GetFile {

    List<Words> listOfWords = new ArrayList<>();
    //Words words = new Words();

    public void readFromFile() throws FileNotFoundException {

        File file = new File("words.txt");
        Scanner input = new Scanner(file);


        //Map<String, String> dictionary = new HashMap<>();


        while (input.hasNextLine()) {   //dopóki jest linia
            String line = input.nextLine();
            String[] split = line.split(" - "); ///spilt
            String spanishWord = split[0]; //Ala
            String polishWord = split[1]; // kota

            Words a = new Words(spanishWord, polishWord);

            listOfWords.add(a);
            //System.out.println(a);

        }
    }

    public int randomNumber() {


        Random rand = new Random();


// Obtain a number between [0 - 49].
        int n = rand.nextInt(listOfWords.size());

       // System.out.println(listOfWords.get(n).spanishWord);


        return n;

    }





    public String readPolishWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj tłumaczenie: ");

        return input.nextLine();
    }

}



