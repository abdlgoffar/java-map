package app;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethod {
    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("Eko", "Eko Value");
        name.put("Budi", "Budi Value");
        name.put("Joko", "Joko Value");

        //CONTOH DEFAULT METHOD ITERATION DATA HASHMAP
        name.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}
