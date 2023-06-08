package app;
import java.util.Map;
public class HashMap {
    //HASHMAP ADALAH DATA TYPE YANG TERDIRI DARI KEY DAN VALUE
    public static void main(String[] args) {
        //CARA MEMBUAT DATA TYPE HASHMAP
        Map<String, String> name = new java.util.HashMap<>();
        //MENAMBAH DATA HASHMAP
        name.put("firstName", "abdul");
        name.put("lastName", "goffar");
        //MENGAMBIL DATA HASHMAP
        System.out.println(name.get("firstName"));
        System.out.println(name.get("lastName"));
    }
}
