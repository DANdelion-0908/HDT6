import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class HashFactory {

        public HashFactory(int i) {

        }
    
        public Map<String , ArrayList<String>> createMap(int i){
        
        switch (i) {
            case 1: HashMap<String, ArrayList<String>> first = new HashMap<>();
                    return first;

            case 2: TreeMap<String, ArrayList<String>> second = new TreeMap<>();
                    return second;
                
            case 3: LinkedHashMap<String, ArrayList<String>> third = new LinkedHashMap<>();
                    return third;
        }
        return null;
    }
}
