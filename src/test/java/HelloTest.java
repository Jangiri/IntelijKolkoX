import LepszyMain.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HelloTest {
//    @Test
//    public void helloWorks(){
//        assertEquals(4 , 2+2);
    //  }


    //---------------------testy X dobre-----------------------
    @Test
    public void wygranaKrzyzykaPoKolumnie1() {
        char[][] plansza = {
                {'X', '-', '-'},
                {'X', '-', '-'},
                {'X', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }


    @Test
    public void wygranaKrzyzykaPoKolumnie2() {
        char[][] plansza = {
                {'-', 'X', '-'},
                {'-', 'X', '-'},
                {'-', 'X', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoKolumnie3() {
        char[][] plansza = {
                {'-', '-', 'X'},
                {'-', '-', 'X'},
                {'-', '-', 'X'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoWierszu1() {
        char[][] plansza = {
                {'X', 'X', 'X'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoWierszu2() {
        char[][] plansza = {
                {'-', '-', '-'},
                {'X', 'X', 'X'},
                {'-', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoWierszu3() {
        char[][] plansza = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'X', 'X', 'X'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoPrzekatnej1() {
        char[][] plansza = {
                {'X', '-', '-'},
                {'-', 'X', '-'},
                {'-', '-', 'X'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('X', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoPrzekatnej2() {
        char[][] plansza = {
                {'-', '-', 'X'},
                {'-', 'X', '-'},
                {'X', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('X', rezultat);
    }

    //---------------------testy O dobre-----------------------

    @Test
    public void wygranaKolkaPoKolumnie1() {
        char[][] plansza = {
                {'O', '-', '-'},
                {'O', '-', '-'},
                {'O', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }


    @Test
    public void wygranaKolkaPoKolumnie2() {
        char[][] plansza = {
                {'-', 'O', '-'},
                {'-', 'O', '-'},
                {'-', 'O', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoKolumnie3() {
        char[][] plansza = {
                {'-', '-', 'O'},
                {'-', '-', 'O'},
                {'-', '-', 'O'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoWierszu1() {
        char[][] plansza = {
                {'O', 'O', 'O'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoWierszu2() {
        char[][] plansza = {
                {'-', '-', '-'},
                {'O', 'O', 'O'},
                {'-', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoWierszu3() {
        char[][] plansza = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'O', 'O', 'O'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoPrzekatnej1() {
        char[][] plansza = {
                {'O', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', 'O'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('O', rezultat);
    }

    @Test
    public void wygranaKolkaPoPrzekatnej2() {
        char[][] plansza = {
                {'-', '-', 'O'},
                {'-', 'O', '-'},
                {'O', '-', '-'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('O', rezultat);
    }

    //---------------------testy remins po wierszu i kolumnie-----------------------

    @Test
    public void remisKrzyzykaPoWierszu1() {
        char[][] plansza = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('R', rezultat);
    }

    @Test
    public void remisKrzyzykaPoWierszu2() {
        char[][] plansza = {
                {'X', '-', 'X'},
                {'X', '-', '-'},
                {'-', 'X', 'X'},
        };
        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
        assertEquals('R', rezultat);
    }

    @Test
    public void wygranaKrzyzykaPoWierszuKolumnieMetodaWygranaPoPrzekatnej() {
        char[][] plansza = {
                {'X', '-', 'X'},
                {'X', '-', 'O'},
                {'O', 'X', 'X'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('R', rezultat);
    }

    @Test
    public void wygranaKolkaPoWierszuKolumnieMetodaWygranaPoPrzekatnej1() {
        char[][] plansza = {
                {'O', '-', 'X'},
                {'O', '-', 'O'},
                {'X', 'O', 'X'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('R', rezultat);
    }

    @Test
    public void wygranaKolkaPoWierszuKolumnieMetodaWygranaPoPrzekatnej2() {
        char[][] plansza = {
                {'O', 'O', 'O'},
                {'O', '-', 'O'},
                {'X', 'O', 'X'},
        };
        char rezultat = Main.sprawdzWynikPoPrzekatnej(plansza);
        assertEquals('R', rezultat);
    }


//-----------------------
//    @Test
//    public void remisWierszKolumna1(){
//        char[][] plansza = {
//                { 'X', 'O', 'O'},
//                { 'O', 'X', 'X'},
//                { 'X', 'O', 'O'},
//        };
//        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
//        assertEquals('R',rezultat);
//    }

    //---------------------ters tablicy drukowania ---------------

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    //   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        //     System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testDrukowaniaTablicy() {
        //   Main.drukujPlansze();
        char[][] plansza = {
                {'X', 'O', 'X'},
                {'X', 'O', '-'},
                {'O', 'X', 'O'},
        };

        String newLine = System.getProperty("line.separator");

        String planszaWydruk =
                "Twoja plansza do gry! " + newLine +
                        "0 1 2 3 " + newLine +
                        "a X|O|X" + newLine +
                        "  -+-+-" + newLine +
                        "b X|O|-" + newLine +
                        "  -+-+-" + newLine +
                        "c O|X|O" + newLine;


        Main.drukujPlansze(plansza);
        assertEquals(planszaWydruk+newLine,outContent.toString());
    }

    @Test
    public void testDrukowaniaTablicyPustej() {
        //   Main.drukujPlansze();
        char[][] plansza = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        String newLine = System.getProperty("line.separator");

        String planszaWydruk =
                "Twoja plansza do gry! " + newLine +
                        "0 1 2 3 " + newLine +
                        "a -|-|-" + newLine +
                        "  -+-+-" + newLine +
                        "b -|-|-" + newLine +
                        "  -+-+-" + newLine +
                        "c -|-|-" + newLine;


        Main.drukujPlansze(plansza);
        assertEquals(planszaWydruk+newLine,outContent.toString());
    }

    @Test
    public void testDrukowaniaTablicyXiO() {
        char[][] plansza = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'O'},
        };

        String newLine = System.getProperty("line.separator");

        String planszaWydruk =
                "Twoja plansza do gry! " + newLine +
                        "0 1 2 3 " + newLine +
                        "a X|O|X" + newLine +
                        "  -+-+-" + newLine +
                        "b X|X|O" + newLine +
                        "  -+-+-" + newLine +
                        "c O|X|O" + newLine;


        Main.drukujPlansze(plansza);
        assertEquals(planszaWydruk+newLine,outContent.toString());
    }




    @After
    public void restoreStreams() {
        System.setOut(System.out);
        //      System.setErr(System.err);
    }


//
//    @Test
//    public void wygranaKrzyzykaPoPrzekatnej(){
//        char[][] plansza = {
//                { 'X', 'X', '-'},
//                { 'O', 'X', 'O'},
//                { 'X', 'X', 'X'},
//        };
//        char rezultat = Main.sprawdzWynikWierszkolumna(plansza);
//        assertEquals('X',rezultat);
//    }


}
