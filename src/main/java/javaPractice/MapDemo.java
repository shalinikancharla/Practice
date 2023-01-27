package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    //Map is not child interface of collections
    //if we want to represent a group of objects as key value pairs then we should go for map
    //Both the keys and values are objects only.
    //Duplicate keys are not allowed.
    //but values can be duplicated
    //Each key value pair is called entry.so map is considered as entry objects
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();  //Insertion order not maintained  -->{101=rajeev, 102=sachin, 103=james, 104=kohli}
        //LinkedHashMap hashMap=new LinkedHashMap(); //insertion order maintained  -->{101=rajeev, 103=james, 102=sachin, 104=kohli}
        //TreeMap hashMap=new TreeMap();  //sorted and order maintained --> {101=rajeev, 102=sachin, 103=james, 104=kohli}


        hashMap.put(101,"rajeev");
        hashMap.put(103,"james");
        hashMap.put(102,"sachin");
        hashMap.put(104,"kohli");
        System.out.println(hashMap);    //{101=rajeev, 102=sachin, 103=james, 104=kohli}

        //check  the size of the map
        System.out.println(hashMap.size());  //4
        //get the key id
        System.out.println(hashMap.get(101));  //rajeev

        System.out.println(hashMap.containsKey(102)); //true

        System.out.println(hashMap.containsValue("sachin"));  //true

        System.out.println(hashMap.remove(104)); //kohli
        System.out.println(hashMap);  // {101=rajeev, 102=sachin, 103=james}

        hashMap.clear();
        System.out.println(hashMap);  //{}




    }
}
