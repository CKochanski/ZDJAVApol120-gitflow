package pl.sda;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 10");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }

}
