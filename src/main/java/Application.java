import java.io.FileNotFoundException;

public class Application {

    public  void start()throws FileNotFoundException {

        System.out.println("/////////////////////////////////////\n");
        System.out.println("Witaj w programie");
        System.out.println("Sprawdz swoj hiszpanski");

        System.out.println("Pierwsze pytanie:");

        Draw draw = new Draw();
        int counter = 1;
        int counterBadAnswer = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Słowo nr : " + counter);
            System.out.println("");
            draw.getDraw();
            counter++;


            while (draw.getCheck() != 1) {
                System.out.println("Odpowiedz nieprawidłowa, Spróbuj jeszcze raz.");
                counterBadAnswer++;
                System.out.println("Próba nr." + counterBadAnswer);

            }
            System.out.println("Brawo! Odpowiedz poprawna");

        }

        System.out.println("Koniec. Odpowiedziales poprawnie na: " + (counter - 1));


    }
}

