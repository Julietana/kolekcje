package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);

        System.out.println(listOfIntegers);
        System.out.println(Collections.max(listOfIntegers));

        // for-range-loop
        // Element : iterable collection
        for(Integer value : listOfIntegers){
            System.out.print(" " + value);
        }

        listOfIntegers.remove(1);
        System.out.println(listOfIntegers);

        boolean contains = listOfIntegers.contains(4);
        System.out.println("contaions: " + contains);

        // kolekcje niegeneryczne - nie wyamaga aby elementy w niej przechowywane byly tego samego typu
        List listNiegeneryczna = new ArrayList();
        listNiegeneryczna.add("string");
        listNiegeneryczna.add(1);
        listNiegeneryczna.add(1.0);
        listNiegeneryczna.add(true);
        System.out.println(listNiegeneryczna);
    }
}
/*
1. Klonowanie repozytorium do siebie
git clone link_do_repozytorium

2. Sprawdzanie zmian w repozytroium
git status

3. Dodawanie zmian ktore maja wejsc w zakres commita
git add nazwa_pliku1 nazwa_pliku2 ... nazwa_plikuN

4. Tworzenie commita
git commit -m "nazwa commita"

5. Wypchniecie zmian na repo
git push

pwd - sprawdzenie aktualnej sciezki (ang print working directory)
ls - sprawdzenie zawartosci aktualnej sciezki (ang list)
cd nazwa_katalogu - przejscie do wybranego katalogu (ang change directory)
clear - wyczysc terminal
 */
