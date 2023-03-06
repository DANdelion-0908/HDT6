import java.util.ArrayList;
import java.util.Map;

public class MapAdmin {
    
    public void add(Map<String, ArrayList<String>> m, Map<String, ArrayList<String>> Inv, String K, String S) throws Exception{
        
        
        try {
            if(Inv.get(K) == null) {
                System.out.println("La categoría " + K + " no existe.");
                return;
            }

            for (String Llave : Inv.keySet()) {
                    if(m.get(K) == null) {
                        for (String value : Inv.get(Llave)) {
                            if(S.equals(value));

                            ArrayList<String> V = new ArrayList<>();
            
                            V.add(S);
                            m.put(K, V);
                            System.out.println(V + " ha sido ingresado dentro de la categoría " + K + "\n");
                            return;
                        }
                        
                    } else {
                        for (String value : Inv.get(Llave)) {
                            if(S.equals(value)) {
                                m.get(K).add(S);
                                System.out.println(m.get(K) + " ha sido ingresado dentro de la categoría " + K + "\n");
                                return;
                            }    
                        }
        
                    }
            }
        
    
            
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

    public void showMap(Map<String, ArrayList<String>> m) {
        for (String s : m.keySet()) {

            System.out.print("La categoría es " + s + ". " + "Sus productos son " + m.get(s) + "\n");
            System.out.println("");
        }
    }
}
