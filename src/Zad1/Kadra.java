package Zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadra extends Osoba{
    String wyksztalcenie, stanowisko;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void inicjuj1() throws IOException {
        inicjuj();

        System.out.println("Podaj wykształcenie:");
        wyksztalcenie = br.readLine();

        System.out.println("Podaj stanowisko:");
        stanowisko = br.readLine();
    }

    public void drukuj1(){
        drukuj();
        System.out.println(wyksztalcenie + "\n" + stanowisko);
    }
}
