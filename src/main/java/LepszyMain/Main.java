package LepszyMain;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String newLine = System.getProperty("line.separator");


        System.out.println("Witaj w grze kółko i krzyżyk!");
        System.out.println("Podaj wielkość planszy na której chcesz grac, przykład:"+newLine+"Wpisz od 3 do 9 ");  //10 trzeba zrobic


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        char[][] planszaDoGry = new char[a][a];
        wypelnijPlansze(planszaDoGry);

        // drukujPlansze(planszaDoGry);

        System.out.println("");

        char wynik = 0;
        char wynik2 = 0;

        int remis = 0;
        int tablicaKwadrat = a*a;

        System.out.println("remis glowny a = " + tablicaKwadrat);

        while (wynik == 0 || wynik2 == 0 || remis == tablicaKwadrat) {

            drukujPlansze(planszaDoGry);

            wprowadzX(planszaDoGry);
     //       System.out.println("remis b= " +remis);
            wynik = sprawdzWynikWierszkolumna(planszaDoGry);
            wynik2 = sprawdzWynikPoPrzekatnej(planszaDoGry);

            if (wynik == 'X' || wynik2 == 'X') {
                System.out.println("Wygana X pochodzę z main-a");
                return;
            } else if (wynik == 'R') {
                System.out.println("Remis - pochodzę z main-a");
                return;
            }

      //     System.out.println("remis c = " +remis);          //
            remis++;
            czyRemis(a , remis);
      //      System.out.println("remis f= " +remis);
            if (remis == tablicaKwadrat){                   // to musi byc bo nie działa inaczej
                System.out.println("Remis po ruchu X - pochodzę z Main-a ");
                break;
            }


      //     System.out.println("remic c2 = " + remis);          //

            wprowadzO(planszaDoGry);

      //      System.out.println("remis = " +remis);
            wynik = sprawdzWynikWierszkolumna(planszaDoGry);
            wynik2 = sprawdzWynikPoPrzekatnej(planszaDoGry);

            if (wynik == 'O' || wynik2 == 'O') {
                System.out.println("Wygrana kółko - pochodzę z main-a");
                return;
            } else if (wynik == 'R') {
                System.out.println("Remis - pochodzę z main-a");
                return;
            }


     //       System.out.println("remis d= " +remis);              //
            remis++;
    //        System.out.println("remis e= " +remis);

            czyRemis(a , remis);
            if (remis == tablicaKwadrat){                   // to musi byc bo nie działa inaczej tutaj tez
                System.out.println("Remis po ruhu O - pochodzę z Main-a");                // bo jak gramy w 4x4 to nie zaskakuje funkcja
                break;
            }
        }
//            for(int i =0 ; i<10 ; i++) {
//                for (int j = 0; j < 10; j++) {

        //cos tam dziala
//            drukujPlansze(planszaDoGry); {
//                if (planszaDoGry[0][0] == 'X' && planszaDoGry[0][1] == 'X' && planszaDoGry[0][2] == 'X') {
//                    System.out.println("wygrał X");
//                    break;
//                }
//                if (planszaDoGry[0][0] == 'X' && planszaDoGry[1][1] == 'X' && planszaDoGry[2][2] == 'X') {
//                    System.out.println("wygrał X");
//                    break;
//                }


        // }
//            }

    }

    public static void czyRemis(int wielkoscTablicy , int iloscRuchow){

        int planszaZapelniona = wielkoscTablicy*wielkoscTablicy;

        System.out.println(iloscRuchow+ "/" + planszaZapelniona);

        if (planszaZapelniona == iloscRuchow){
            System.out.println("Remis , koniec gry (pochodzę z funkcji czyRemis)");
        }


    }


    //}

    public static char sprawdzWynikPoPrzekatnej(char[][] plansza) {

        int liczbaKolek = 0;
        int liczbaKrzyzykow = 0;
        int b = 0;

//        int remis = 0;
//        int zmiennaDoRemisu = plansza.length*plansza.length;

        for (int i = 0; i < plansza.length; i++) {

            if (plansza[i][b] == 'O') {
                ++liczbaKolek;
                if (liczbaKolek == plansza.length) {
                    System.out.println("Wygrywa zawodnik O (pochodze z funkcjisprawdzWynikPoPrzekatnej)");
                    return 'O';

                }
            } else if (plansza[i][b] == 'X') {
                ++liczbaKrzyzykow;
                if (liczbaKrzyzykow == plansza.length) {
                      System.out.println("Wygrywa zawodnik X (pochodze z funkcjisprawdzWynikPoPrzekatnej)");
                    return 'X';
                }
            }
            b++;
        }

        liczbaKolek = 0;
        liczbaKrzyzykow = 0;
        b = plansza.length - 1;

        for (int i = 0; i < plansza.length; i++) {

            if (plansza[b][i] == 'O') {
                ++liczbaKolek;
                if (liczbaKolek == plansza.length) {
                    //   System.out.println("Wygrywa zawodnik O");
                    return 'O';

                }
            } else if (plansza[b][i] == 'X') {
                ++liczbaKrzyzykow;
                if (liczbaKrzyzykow == plansza.length) {
                    //   System.out.println("Wygrywa zawodnik X");
                    return 'X';
                }
            }
            b--;
        }

        return 0;
    }

    public static char sprawdzWynikWierszkolumna(char[][] plansza) {


        int liczbaKolek = 0;
        int liczbaKrzyzykow = 0;

      //  int remis = 0;

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {

                if (plansza[i][j] == 'X') {
                    liczbaKrzyzykow++;
                    if (liczbaKrzyzykow == plansza.length) {
                        System.out.println("Wygrały Krzyżyki pochodzę z z funkcji sprawdzWierszKolumna po i");
                        return 'X';
                    }
                }
                if (plansza[i][j] == 'O') {
                    liczbaKolek++;
                    if (liczbaKolek == plansza.length) {
                        System.out.println("Wygrały Kółka pochodzę z z funkcji sprawdzWierszKolumna po i");
                        return 'O';
                    }
                }
            }
            liczbaKolek = 0;
            liczbaKrzyzykow = 0;
        }

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {

                if (plansza[j][i] == 'X') {
                    liczbaKrzyzykow++;
                    if (liczbaKrzyzykow == plansza.length) {
                        System.out.println("Wygrały Krzyżyki pochodzę z z funkcji sprawdzWierszKolumna po j");
                        return 'X';
                    }
                }
                if (plansza[j][i] == 'O') {
                    liczbaKolek++;
                    if (liczbaKolek == plansza.length) {
                        System.out.println("Wygrały Kółka pochodzę z funkcji sprawdzWierszKolumna po j");
                        return 'O';
                    }
                }
            }
            liczbaKolek = 0;
            liczbaKrzyzykow = 0;
        }
        return 0;
    }

    public static void graj() {
        while (true) {

        }

    }

    public static char wprowadzX(char[][] plansza) {

        while (true) {
            System.out.println("Podaj gdzie chcesz postawić \"X\" zgodnie ze wzorem np. a1 , b2");
            Scanner scanner1 = new Scanner(System.in);
            String odczyt = scanner1.nextLine();
            // System.out.println(odczyt.toLowerCase());

            int wiersz = odczyt.charAt(0) - 'a';
            int kolumna = odczyt.charAt(1) - '1';


            for (int i = 0; i < plansza.length; i++) {
                for (int j = 0; j < plansza.length; j++) {

                    if (plansza[wiersz][kolumna] == '-' && plansza[wiersz][kolumna] != 'X' && plansza[wiersz][kolumna] != 'O') {
                        plansza[wiersz][kolumna] = 'X';
                        break;
                    }
                }
            }
            System.out.println(drukujPlansze(plansza));
            return ' ';
        }
    }


//            for (int i = 0; i < plansza.length; i++) {
//                for (int j = 0; j < plansza.length; j++) {
//
//
////                if(wiersz || kolumna != plansza.length){
////                    System.out.println("wyszedles poza tablice");
////                    continue;
////                }
//            }
//            System.out.println(drukujPlansze(plansza));
//            return ' ';
//        }
//    }


    public static char wprowadzO(char[][] plansza) {

        while (true) {
            System.out.println("Podaj gdzie chcesz postawić \"O\" zgodnie ze wzorem np. a1 , b2");
            Scanner scanner1 = new Scanner(System.in);
            String odczyt = scanner1.nextLine();

            int wiersz = odczyt.toLowerCase().charAt(0) - 'a';
            int kolumna = odczyt.charAt(1) - '1';

            for (int i = 0; i < plansza.length; i++) {
                for (int j = 0; j < plansza.length; j++) {

                    if (plansza[wiersz][kolumna] == '-') {
                        plansza[wiersz][kolumna] = 'O';
                        break;
                    }
//                if(wiersz || kolumna != plansza.length){
//                    System.out.println("wyszedles poza tablice");
//                    continue;
//                }
                }
            }
            System.out.println(drukujPlansze(plansza));
            return ' ';
        }
    }


    public static void wypelnijPlansze(char[][] plansza) {

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                plansza[i][j] = '-';
            }
        }
    }

    public static char drukujPlansze(char[][] plansza) {

        System.out.println("Twoja plansza do gry! ");

        // wspolrzedne 0-10
        int licznik2 = 0;
        for (int i = 0; i <= plansza.length; i++) {
            System.out.printf(licznik2 + " ");
            licznik2++;
        }

        char licznik = 'a';
        System.out.println();
        for (int i = 0; i < plansza.length; i++) {
            //wspolrzedne a-z
            System.out.print(licznik + " ");
            licznik++;
            for (int j = 0; j < plansza.length; j++) {
                System.out.printf(String.valueOf(plansza[i][j]));

                //dodaje | pomiedzy kolumnami (bez ostatniej) - prowadzacy dodał w 3 sekundy
                //usunalem spacje przed | i zastapiem "-" bo plansza sie przesuwala
                if (j != plansza.length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();

            //dodaje -+- pomiędzy wierszami planszy (godzina w plecy)
            if (i != plansza.length - 1) {
                System.out.printf("  -+-");
                for (int z = 0; z < plansza.length - 2; z++) {
                    System.out.print("+-");
                }
            }
            System.out.println();
        }
        return ' ';
    }

    //  -------------------test- start--------------------------


}
