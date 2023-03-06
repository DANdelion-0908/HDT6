import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * It takes a map as a parameter, gets the keys of the map, sorts them, and then prints the key and the
 * value of the map
 */
public class Compare {
    
    public Compare(Map<String, ArrayList<String>> map) {
        
        List<String> keys = new ArrayList<String>(map.keySet());

        Collections.sort(keys);

        for(String key : keys) {

            System.out.println("La categoría " + key + " tiene los productos " + map.get(key) + "\n");

        }
    }
}
