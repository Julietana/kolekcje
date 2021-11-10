package com.company;

import java.util.*;

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


        /*
        Stworz kolekcje Stringow zawierajaca nazwy 3 miesiecy
        a) usun wybrany miesiac
        b) sprawdz czy jakis istnieje w kolekcji
         */

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Styczen");
        listOfStrings.add("Kwiecien");
        listOfStrings.add("Maj");

        listOfStrings.remove("Styczen");
        listOfStrings.remove(listOfStrings.size()-1);
        System.out.println(listOfStrings);

        List<String> listOfMonths = new ArrayList<>();
        listOfMonths.add("Lipiec");
        listOfMonths.add("Wrzesien");

        listOfStrings.addAll(listOfMonths);
        System.out.println(listOfStrings);

        boolean contains2 = listOfStrings.contains("Lipiec");
        System.out.println(contains2);

        List<String> strings = Arrays.asList("Ala", "ma", "kota");
        List<String> stringList = List.of("Ala", "ma", "kota");

        System.out.println(stringList.get(0));

        for(int i=0; i<strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        List<String> test1 = new ArrayList<>();
        test1.add("test1");
        test1.add("test2");
        test1.add("test3");

        //List.of("test1", "test2", "test3");
        //List<String> test2 = List.of("test2", "test3");

        test1.removeAll(Arrays.asList("test2", "test1"));
        System.out.println(test1);

        System.out.println(test1.isEmpty());
        int test11 = test1.indexOf("test3");
        System.out.println(test11);
        test1.add("test2");
        test1.add("test3");
        System.out.println(test1.lastIndexOf("test3"));

        test1.set(2, "test4");
        System.out.println(test1);
    }

}
/*
1. Roznica: Stos vs Sterta + stackoverflow exception
2. Wypchnij do repozytorium commit z dzisiejszymi zajeciami
3. SPOJ - 3 zadania z sekcji latwe
 */

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

6. Wyswietlenie listy commitow
git log

pwd - sprawdzenie aktualnej sciezki (ang print working directory)
ls - sprawdzenie zawartosci aktualnej sciezki (ang list)
cd nazwa_katalogu - przejscie do wybranego katalogu (ang change directory)
clear - wyczysc terminal
 */
