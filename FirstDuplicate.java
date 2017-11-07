import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

public class FirstDuplicate{

    public int firstDuplicate(int[] a) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
            else{
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] sample1 = {2,3,3,1,5,2};
        int[] sample2 = {2,4,3,5,1};
        FirstDuplicate fd = new FirstDuplicate();
        fd.firstDuplicate(sample1);
        System.out.println(sample1);
    }
}