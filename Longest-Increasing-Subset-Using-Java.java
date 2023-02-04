import java.io.*;
import java.util.*;
import java.util.HashMap;


class Primitive{

    static int lens(int[] arr){
        TreeSet<Integer> ss = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            Integer x = ss.ceiling(arr[i]);
            if(x!=null){
                ss.remove(x);
            }
            ss.add(arr[i]);
        }
        return ss.size();

    }
    public static void main(String[] args) {
        int[] arr= {10,9,2,5,3,7,101,18};
        System.out.println(lens(arr));
    }
}

