package Petle;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        //Tworzymy obiekt typu Skaner
        Scanner skaner=new Scanner(System.in);

        String opcja;

        //Tworzymy pętle DoWhile
        do{
            //Długość jednego boku
            System.out.println("Podaj długość jednego boku prostokąta");
            int dlugoscX=skaner.nextInt();
            System.out.println("X= "+dlugoscX);


            //Długość drugiego boku
            System.out.println("Podaj długość drugiego boku prostokąta");
            int dlugoscY=skaner.nextInt();
            System.out.println("Y= "+dlugoscY);

            //Obliczamy pole prostokata i wypisanie wyniku
            int rectangleArea=dlugoscX*dlugoscY;
            System.out.println("Pole prostokąta o wymiarach "+dlugoscX+ dlugoscY+" wynosi "+ rectangleArea+".");


            //Pytanie o chęć zakończenia pracy
            System.out.println("Jeśli chcesz zakończyć wciśnij 'K', jeśli chcesz kontunuować wciśnij dowolny klawisz.");
            //Tworzymy opcję wyboru "K" zakończenia programu
            opcja=skaner.next();
        }
        //Jeśli nie została wybrana 'K' pętla wraca do początku
        while (!opcja.equalsIgnoreCase("K"));
        System.out.println("Dziękuję. Do zobaczenia następnym razem!");


    }
}
