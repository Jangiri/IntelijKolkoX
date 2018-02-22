package Testy;

public class TestyTablica {

    public static void main(String[] args) {

        int a = 4;

        String[][] plansza = new String[a][a];

        System.out.println("");

        int licznikI = 0;
        char licznikJ = 'a';

        for (int i = 0; i < plansza.length ; i++) {
            for (int j = 0; j < plansza.length  ; j++) {
                if (i == 0 ){
                    plansza[i][j] = String.valueOf(licznikI);
                    licznikI ++;
                }else if (j == 0 ){
                    plansza[i][j] = String.valueOf(licznikJ);
                    licznikJ++;

                }else
                plansza[i][j] = "-";
            }
        }


        for (int i = 0; i < plansza.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < plansza.length ; j++) {
                System.out.printf( " " + String.valueOf(plansza[i][j]) + " |");
            }


        }
        System.out.println("");






////-----------------------------test- start--------------------------
//        System.out.println("test taba");
//
//        char [][]tablicaDoGry = {
//                {'-', '-', '-'},
//                {'-', '-', '-'},
//                {'-', '-', '-'}
//        };
//
//        int liczniktaba = 1;
//        for (int i = 0 ; i < tablicaDoGry.length ; i++) {
//            for (int j = 0; j < tablicaDoGry.length; j++) {
//                System.out.printf(liczniktaba + " |" + String.valueOf(tablicaDoGry[i][j]));
//
//            }liczniktaba++;
//        }
////-----------------------------test- start--------------------------


    }









}
