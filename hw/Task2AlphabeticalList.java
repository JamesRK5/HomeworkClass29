package hw;

import java.util.Iterator;

public class Task2AlphabeticalList {
    public static void main(String[] args) {

        java.util.TreeSet<String> countries=new java.util.TreeSet<>();
        countries.add("USA");
        countries.add("South Africa");
        countries.add("Ukraine");
        countries.add("Russia");
        countries.add("Canada");

        for (String country: countries){
            System.out.println(country);
        }

        Iterator<String> iterator= countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
