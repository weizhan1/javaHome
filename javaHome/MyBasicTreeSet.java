package javaHome;

import java.util.TreeSet;

public class MyBasicTreeset {
 
    public static void main(String a[]){
         
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Elements: "+ts);
        //check is set empty?
        System.out.println("Is set empty: "+ts.isEmpty());
        //delete all elements from set
        ts.clear();
        System.out.println("Is set empty: "+ts.isEmpty());
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Size of the set: "+ts.size());
        //remove one string
        ts.remove("two");
        System.out.println("Elements: "+ts);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
 
class MySetWithCollection {
    public static void main(String a[]){
        List<String> li = new ArrayList<String>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        System.out.println("List: "+li);
        //create a treeset with the list
        TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: "+myset);
    }
}

import java.util.Iterator;
import java.util.TreeSet;
 
class MySetIteration {
     
    public static void main(String a[]){
         
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
 
class MyArrayDuplicates {
 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
    }
}

class MyDuplicateEntry {
	 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }
    }
}

import java.util.Comparator;
import java.util.TreeSet;
 
class MySetWithCompr {
 
    public static void main(String a[]){
         
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        System.out.println(ts);
    }
}
 
class MyComp implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}
