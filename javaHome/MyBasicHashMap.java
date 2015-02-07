package javaHome;

import java.util.HashMap;

public class MyBasicHashMap {
 
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: "+hm.size());
    }
}

import java.util.HashMap;
import java.util.Set;
 
class MyHashMapRead {
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
    }
}

class MyHashMapCopy {
	 
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
    }
}

class MyHashMapKeySearch {
    
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
    }
}

public class MyHashMapValueSearch {
    
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
    }
}

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
class MyHashMapEntrySet {
 
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }
}

class MyHashMapClear {
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
    }
}

