package easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {

//    public static void main(String[] args) {
//        MovingAverage ma = new MovingAverage(3);
//        System.out.println(ma.next(1));
//        System.out.println(ma.next(10));
//        System.out.println(ma.next(3));
//        System.out.println(ma.next(5));
//        System.out.println("next");
//        MovingAverage ma2 = new MovingAverage(1);
//        System.out.println(ma2.next(4));
//        System.out.println(ma2.next(0));
//
//    }
    int size;
    List<Integer> list = new ArrayList<>();

    public MovingAverage(int size) {
        this.size = size;

    }

    public double next(int val) {
        list.add(val);
        double result = 0;

        if (list.size() < size){
            for (int num : list){
                result += num;
            }
            return result/ list.size();
        } else {
            for (int i = list.size()-size; i < list.size(); i++) {
                result += list.get(i);
            }
            return result/size;
        }
    }
}
