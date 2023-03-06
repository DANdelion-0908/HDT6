import java.util.ArrayList;
import java.util.Map;

public class MapAdmin {
    
    /**
     * It adds a string to a map, but only if the string is in another map
     * 
     * @param m The map that contains the categories and the items.
     * @param Inv The inventory map
     * @param K Key
     * @param S String
     */
    public void add(Map<String, ArrayList<String>> m, Map<String, ArrayList<String>> Inv, String K, String S) throws Exception{
           
        try {
            if(Inv.get(K) == null) {
                System.out.println("La categoría " + K + " no existe. \n");
                return;
            }

            for (String Llave : Inv.keySet()) {
                    if(m.get(K) == null) {
                        for (String value : Inv.get(Llave)) {
                            if(S.equals(value));

                            ArrayList<String> V = new ArrayList<>();
            
                            V.add(S);
                            m.put(K, V);
                            System.out.println(V.get(V.size() - 1) + " ha sido ingresado dentro de la categoría " + K + "\n");
                            return;
                        }
                        
                    } else {
                        for (String value : Inv.get(Llave)) {
                            if(S.equals(value)) {
                                m.get(K).add(S);
                                System.out.println(m.get(K).get(m.get(K).size() - 1) + " ha sido ingresado dentro de la categoría " + K + "\n");
                                return;
                            }    
                        }
        
                    }
            }
        
        } catch (Exception e) {
            System.out.println("Ingresa un dato válido. \n");

        }
    }

    /**
     * It removes an element from a list inside a map
     * 
     * @param m The map
     * @param K Key
     * @param V ArrayList of Strings
     * @param S String to be removed
     */
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

    /**
     * It prints the key and the value of the map
     * 
     * @param m the map
     */
    public void showMap(Map<String, ArrayList<String>> m) {
        for (String s : m.keySet()) {

            System.out.print("La categoría es " + s + ". " + "Sus productos son " + m.get(s) + "\n");
            System.out.println("");
        }
    }
}
