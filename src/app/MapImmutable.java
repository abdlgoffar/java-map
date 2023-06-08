package app;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class MapImmutable {
    public static void main(String[] args) {

        Map<String, String> car = Collections.emptyMap();/*immutable map data kosong*/
        Map<String, String> person = Collections.singletonMap("name", "goffar");/*immutable map paten*/

        Map<String, String> national = new HashMap<>();
        national.put("asian", "indonesia");
        Map<String, String> immutable = Collections.unmodifiableMap(national);/*membuat map jadi immutable*/

        Map<String, String> map = Map.of(
                "first", "Eko",
                "middle", "Kurniawan",
                "last", "Khannedy"
        );

        // map.put("a", "A"); error

    }
}
