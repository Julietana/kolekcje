package com.company;

import java.util.*;

public class Main {

    public static List<Integer> returnList(List<Integer> integerList, int qq){

        if(integerList.size() == 0){
            return List.of();
        }

        List<Integer> newIntegerList = new ArrayList<>();
        for (Integer value : integerList){ //foreach loop
            if (value > qq) {
                newIntegerList.add(value);
            }
        }
        return newIntegerList;
    }

    public static List<String> returnMenNames(List<String> namesList){
        List<String> menNames = new ArrayList<>();
        for (String value : namesList) if (!value.endsWith("a")) menNames.add(value);
        return menNames;
    }

    public static List<String> task3(List<String> names, char a){
        List<String> names2 = new ArrayList<>();
        for (String value : names){
            if (value.toLowerCase().contains(String.valueOf(a))){
                names2.add(value);
            }
        }
        return names2;
    }

    /*
    Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste elementow ktore sa na obu listach
     */
    public static Set<String> task4(List<String> names, List<String> names2){
        Set<String> names3 = new HashSet<>();
        for (String value : names){
            if (names2.contains(value) ){
                names3.add(value);
            }
        }
        return names3;
    }
    //int occurrences = Collections.frequency(animals, "bat");
    //Jak to przerobic zeby to dzialalo????
    public static Map<Integer,String> task5(List<String> namesList){
        Map<Integer, String> map = new HashMap<>();
        for (String value : namesList){
            int occurrences = Collections.frequency(namesList, value);
            map.put(occurrences, value);
        }
        return map;
    }

    /*
    Metoda przyjmuje liste imion
    zwraca mape, gdzie pod kluczem jest ilosc powtorzen dane imienia, a pod wartoscia to imie
    in: (Jan, Jan, Julia)
    out: {2=Jan, 1=Julia}
     */

    public static void main(String[] args) {

        System.out.println(task5(List.of("Jan", "Jan", "Julia", "Maria")));

        System.out.println(task4(List.of("Jan", "Jan", "Julia", "Maria"), List.of("Jan", "Julia", "Julia", "Oliwia")));

        System.out.println(task3(List.of("Jan", "Julia", "Maria"), 'j'));

        System.out.println(returnMenNames(List.of("Jan", "Julia", "Maria")));

        List<Integer> list = List.of(1, 2, 20, 48, 100, 2000);
        int ww = 40;
        System.out.println(returnList(List.of(), 40));


        System.out.println("Hello world!");
        int a = 5; // -> typ prwymitywny
        Integer b = 5; // - > typ "opakowany"

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

        List<String> names = new ArrayList<>();
        names.add("Jan1");
        names.add("Jan2");
        names.add("Jan3"); //List.of("Jan", "Jan1", "Jan2");
        //names.remove(0);
        //names.remove("Jan3");
        String s = names.toString();
        System.out.println(s);
        System.out.println(s.charAt(3));
        System.out.println(names.getClass());
        System.out.println(names.getClass().getSimpleName());

        Object[] objects = names.toArray();
        for(Object element : objects){
            System.out.print(element + " ");
        }

        names.clear();
        System.out.println("123" + names);

        List<String> newC = new ArrayList<>();

        System.out.println(names.equals(newC));

        /*
        ArrayList
        1) Przechwouje elementy w dynamicznej tablicy - nie podajemy rozmiaru
        2) Dane zapisywane w pamieci znajduja sie obok siebie (heap/sterta)
        3) Operacje wyjecia sa szybsze niz na LinkedList, ale usuniecie jest wolniejsze
         */

        /*
        LinkedList
        1) Przechwouje wewnetrzenie elementy opakowane w obiekty wskazujace na elemnt poprzedni i nastepny
        2) Dane w pamieci sa zapisywane "rozproszone"
        3) Patrz pkt 3 powyzej
         */
        List<String> secondNames = new LinkedList<>();
        secondNames.add("Jan1");
        secondNames.add("Jan2");

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(1);
        System.out.println(firstSet);
        /*
        Masz liste [1, 2, 3, 3, 3, 4, 4, 1, 6]
         */

        // kontener asocjacyjny -> kev/value
        // słownik
        Map<Integer , String> mapOfNames = new HashMap<>();
        mapOfNames.put(1, "FirstName");
        mapOfNames.put(6, "SecondName");
        mapOfNames.put(3, "ThirdName");
        mapOfNames.put(1, "FourthName");
        System.out.println(mapOfNames);
        int i = mapOfNames.hashCode();
        System.out.println(i);

        //1. Napisz metode ktora jako parametr przyjmie liste intow
        // oraz inta i zwraca liste intow ktore sa wieksze niz podany w drugim argumencie
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
