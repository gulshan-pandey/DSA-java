package DSA;

import java.util.Arrays;

import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.CountDownLatch;

public class test{



        public static int numberOfSubstrings(String s) {
            int right = 2, left = 0;
            int count = 0;
            
            while (right < s.length()) {
                String temp = s.substring(left, right+1);
                if(temp.contains("a") & temp.contains("b") & temp.contains("c")) {
                    count++;
                    if(count>1){
                        count++;
                    }
                }
                left++;
                right++;
            }
            
            return count;
        }

    public static void main(String[] args) {

        String s = "abcabc";
        

        System.out.println(numberOfSubstrings(s));
        
    }




}