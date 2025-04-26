package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

//zmrzlina
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(120);
        nakresliRovnostrannyTrojuhelnik(250,Color.ORANGE);
        zofka.turnLeft(30);
        zofka.move(70);
        nakresliKolecko(125,Color.MAGENTA);

//snehulak
        ustupDoprava(70);

        zofka.turnRight(180);
        zofka.move(100);
        nakresliKolecko(35,Color.BLUE);
        ustupDoleva(70);
        nakresliKolecko(75,Color.CYAN);
        ustupDoleva(150);
        nakresliKolecko(35,Color.BLUE);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(150);
        ustupDoprava(48);
        nakresliKolecko(50,Color.BLUE);
        zofka.turnLeft(90);
        zofka.move(48);
        ustupDoleva(218);
        zofka.move(20);
        nakresliKolecko(125,Color.BLUE);
        zofka.turnRight(180);
        zofka.move(350);
        zofka.turnRight(90);
//masinka
        nakresliObdelnik(175,250,Color.GREEN);
        ustupDoleva (250);
        zofka.move(175);
        zofka.turnLeft(90);
        nakresliObdelnik(175,320,Color.GREEN);
        zofka.turnRight(90);
        nakresliKolecko(90,Color.GRAY);
        zofka.turnRight(90);
        zofka.move(75);
        nakresliKolecko(38,Color.GRAY);
        zofka.move(120);
        nakresliKolecko(38,Color.GRAY);
        zofka.move(65);
        ustupDoleva (55);
        nakresliRovnoramennyTrojuhelnik(90, Color.RED);
    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.penDown();
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.penUp();
    }

    public void nakresliCtverec (double delkaStrany, Color barvaCary) {
        zofka.penDown();
        nakresliObdelnik(delkaStrany, delkaStrany, barvaCary);
        zofka.penDown();
    }

    public void nakresliObdelnik (double velikostStranyA, double velikostStranyB, Color barvaCary) {
        zofka.penDown();
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnLeft(90);
            zofka.move(velikostStranyB);
            zofka.turnLeft(90);
        }
        zofka.penDown();
    }

    public void nakresliKolecko (double polomerRpixels, Color barvaCary) {
        zofka.penDown();
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(20);
            zofka.move((polomerRpixels*0.173)*2);
        }
        zofka.penUp();
    }

    public void nakresliRovnoramennyTrojuhelnik (double velikostStrany, Color barvaCary) {
        zofka.penDown();
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        zofka.move(Math.sqrt(2*Math.pow(velikostStrany, 2)));
        zofka.turnRight(135);
        zofka.move(velikostStrany);
        zofka.penUp();
    }

    public void ustupDoprava (int oKolik) {
        zofka.turnRight(90);
        zofka.move(oKolik);
        zofka.turnLeft(90);
    }

    public void ustupDoleva (int oKolik){
        zofka.turnLeft(90);
        zofka.move(oKolik);
        zofka.turnRight(90);
    }
}
