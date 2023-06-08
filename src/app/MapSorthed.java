package app;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
public class MapSorthed {
    public static void main(String[] args) {

        //CONTOH CARA MEMBUAT COMPARATOR DENGAN ANONYMOUS CLASS
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        //UNTUK BISA SORTHING DATA MAKA DIBUTUHKAN OBJECT COMPARATOR TERLEBIH DAHULU
        SortedMap<String, String> national = new TreeMap<>(comparator);
        national.put("asian", "indonesia");
        national.put("south asian", "japan");
        national.put("african", "camerun");
        national.put("europa", "england");
        for (var key : national.keySet()) {
            System.out.println(key);
        }
    }
}
