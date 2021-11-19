package Zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osoba {
    private String nazwisko, imie, ulica, kod, miasto;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void inicjuj() throws IOException {
        System.out.println("Podaj imię:");
        imie = br.readLine();

        System.out.println("Podaj nazwisko:");
        nazwisko = br.readLine();

        System.out.println("Podaj ulicę:");
        ulica = br.readLine();

        System.out.println("Podaj kod:");
        kod = br.readLine();

        System.out.println("Podaj miasto:");
        miasto = br.readLine();
    }

    public void drukuj(){
        System.out.println(imie + " " + nazwisko + "\n" + ulica + " " + kod + " " + miasto);
    }
}
