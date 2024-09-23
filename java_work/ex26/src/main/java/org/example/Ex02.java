package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//interface AA{
//    public void doA();
//}
public class Ex02 {
    public static void main(String[] args) {
//        AA aa = new AA() {
//            @Override
//            public void doA() {
//            }
//        };

        List<Car> list = Arrays.asList(
                new Car("그랜저",3000),
                new Car("K8",3500),
                new Car("쏘렌",2200)
        );

        for(Car car : list){
            System.out.println(car);
        }

        System.out.println(list.get(0));

//        Collections.sort(list, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.getDisp() - o1.getDisp();
//            }
//        });
        
        // 좋아요 굳굳!!!ㅎㅎㅎㅎ 30일 .. 이면.. 좋겠따...

//        Collections.sort(list, ((o1, o2) -> o2.getDisp()-o1.getDisp()) );
//        Collections.sort(list, ((o1, o2) -> o1.getName().compareTo(o2.getName())  ) );
        Collections.sort(list, ((o1, o2) -> o1.getName().length()-o2.getName().length()  ) );

        System.out.println();
        for(Car car : list){
            System.out.println(car);
        }

    }
}
