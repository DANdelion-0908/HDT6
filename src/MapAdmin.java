import java.util.ArrayList;
import java.util.Map;

public class MapAdmin {
    
    public MapAdmin(Map<String, ArrayList<String>> m) {

    }

    public void add(Map<String, ArrayList<String>> m, String K, ArrayList<String> V, String S) throws Exception{

        try {
            if(m.get(K) == null) {
                V.add(S);
                m.put(K, V);
            
            } else {
                m.get(K).add(S);

            }
    
            System.out.println(V + " ha sido ingresado dentro de la categoría " + K + "\n");
            
        } catch (Exception e) {
            System.out.println("Ingresa un dato válido. \n");

        }
    }


    public void remove(Map<String, ArrayList<String>> m, String K, ArrayList<String> V, String S) throws Exception{

        try {
            if(m.get(K) == null) {
                System.out.println("No hay nada dentro de la categoría " + K + "\n");

            } else {
                int index = V.indexOf(S);
                m.get(K).remove(index);
                
            }
            
        } catch (Exception e) {
            System.out.println("Ingresa un dato válido. \n");

        }
    }

    public String showMap(Map<String, ArrayList<String>> m, String K, ArrayList<String> V, String S) {
        for (String string : V) {
            System.out.println(string + ":" + m.get(K));
        }

        return null;
    }
}
