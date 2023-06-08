package app;

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    //CATATAN LINKED HASH MAP DIGUNAKAN JIKA INGIN ITERASI DATA SAJA, JIKA DI BUAT GET DATA AKAN LAMBAT
    public static void main(String[] args) {
        //CARA MEMBUAT DATA LINKEDHASHMAP
        Map<String, String> name = new java.util.LinkedHashMap<>();
        name.put("first", "abdul");
        name.put("middle", "goffar");
        //UNTUK BISA ITERATION DATA LINKEDHASHMAP, MAKA PERLU CONVERT KE SET DATA DAHULU
        Set<String> keys = name.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }
}
