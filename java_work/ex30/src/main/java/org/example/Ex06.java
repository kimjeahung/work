package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex06 {

    public static void main(String[] args) {
        // stream filter map 두개를 떠올리셨으면... 천재...
        List<String> list = Arrays.asList("aaa","bbbb","ccccc","dddddd");

        list.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .map(s -> s.replace("aa","AA바꿈"))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
        System.out.println();

        // Optional map 메서드를 사용하게 되면 Optional<T> 반환된다.
        // 안에 내용물이 없을때는 orElse 사용해서 뭘 반환 할지 작성 할 수 있다.
        Optional<String> os1 = Optional.of("abCD efg");
        Optional<String> os2 = os1.map( s -> s.toUpperCase() );

        String result = os1.map( s -> s.toUpperCase() ).orElse("EMPTY");

        System.out.println(os2);
        System.out.println(os2.get());

        Optional<String> os3 = os1.map(s -> s.replace(" ","_"))
                                    .map(s -> s.toLowerCase());

        System.out.println(os3);
        System.out.println(os3.get());

        os3.ifPresent(System.out::println);

        Optional<Integer> os4 = os1.map( s -> s.length());

        System.out.println(os4);
        System.out.println(os4.get());


    }
}
