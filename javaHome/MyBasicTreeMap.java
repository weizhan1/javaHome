package javaHome;

import java.util.TreeMap;

public class MyBasicTreeMap {
     
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
    }
}

import java.util.Set;
import java.util.TreeMap;
 
class MyTreeMapRead {
 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
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

class MyTreeMapCopy {
	 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        TreeMap<String, String> subMap = new TreeMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
    }
}

class MyTreeMapKeySearch {
    
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
         
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The TreeMap contains key first");
        } else {
            System.out.println("The TreeMap does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The TreeMap contains key fifth");
        } else {
            System.out.println("The TreeMap does not contains key fifth");
        }
    }
}

class MyTreeMapValueSearch {
	 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The TreeMap contains value SECOND INSERTED");
        } else {
            System.out.println("The TreeMap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The TreeMap contains value first");
        } else {
            System.out.println("The TreeMap does not contains value first");
        }
    }
}

import java.util.Set;
import java.util.TreeMap;
 
class MyTreeMapKeys {
 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}

import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
 
class MyTreeMapEntrySet {
     
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }
}

class MyTreeMapClear {
	 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My TreeMap content:");
        System.out.println(hm);
        System.out.println("Clearing TreeMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
    }
}

import java.util.Comparator;
import java.util.TreeMap;
 
class MyTreeMapComparator {
     
    public static void main(String a[]){
        //the treemap sorts by key
        TreeMap<String, String> hm = new TreeMap<String, String>(new MyComp());
        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india","country");
        hm.put("mango","fruit");
        System.out.println(hm);
    }
}
 
class MyComp implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}
