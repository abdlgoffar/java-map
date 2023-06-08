package app;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapEntry {
    public static void main(String[] args) {
        Map<String, String> animals = new HashMap<>();
        animals.put("tiger", "tiger Value");
        animals.put("lyon", "lyon Value");
        animals.put("horse", "horse Value");
        //ENTRY DIGUNAKAN UNTUK BISA MENDAPATKAN KEY DAN VALUE SEKALIGUS PADA SAAT ITERATION
        Set<Map.Entry<String, String>> entries = animals.entrySet();
        for (Map.Entry i : entries) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
