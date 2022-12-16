package JavaLearning;

import org.junit.Test;

import java.util.Arrays;

public class javaStringParsar {
    @Test
    public void par(){
//        double i = 10.280;


//        String tot = String.valueOf(i).;
//        int lastChar = tot.length();
//             //   substring(tot.length());
//        System.out.println(lastChar);
//        String s1 = tot.substring(tot.indexOf(".") + 1);
//        System.out.println(s1.trim());


        double val=1.9;
        String[] arr=String.valueOf(val).split("\\.");
        System.out.println(arr.toString() );
        int[] intArr=new int[2];
        intArr[0]=Integer.parseInt(arr[0]); // 1
        intArr[1]=Integer.parseInt(arr[1]); // 9

    }
}
