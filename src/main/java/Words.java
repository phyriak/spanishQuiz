import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Words {

    public String spanishWord;
    public String polishWord;


    public Words(String spanishWord, String polishWord) {
        this.spanishWord = spanishWord;
        this.polishWord = polishWord;
    }

    public Words() {

    }

    @Override
    public String toString() {
        return "Words{" +
                "spanishWord= " + spanishWord +
                ", polishWord=" + polishWord +
                '}';
    }

    public String getSpanishWord(String spanishWord) {
        return this.spanishWord;
    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;

    }

    public String getPolishWord(String polishWord) {
        return this.polishWord;
    }

    public void setPolishWord(String polishWord) {
        this.polishWord = polishWord;
    }


}




