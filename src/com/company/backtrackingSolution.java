package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
import java.util.*;

public class backtrackingSolution {
        public static void permutation(List<List<Integer>> result,String str,List<Integer> temp)
        {
            if(str.length() == 0)
            {
                result.add(temp);
                return;
            }
            for(int i = 0;i < str.length();i++ )
            {
                char curr = str.charAt(i);
                String newStr = str.substring(0,i) + str.substring(i+1);
                temp.add((int)curr);
                permutation(result,newStr,temp);
            }

        }

        public static void main(String args[]) {
            int[] nums = {1,2,3};
            String str = Arrays.toString(nums);
            List<List<Integer>> result = new ArrayList<>();
            permutation(result,str,new ArrayList<>());
            System.out.println(result);
        }
    }

