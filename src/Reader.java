import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Reader {
    
    /**
     * It reads a file and stores the data in a map
     * 
     * @param map is the map that I'm using to store the data.
     * @return A map with the key being the first word of the line and the value being the second word
     * of the line.
     */
    public Map FileReader(Map map) {
        String MyFile = "src/ListadoProducto.txt";
        String line = ""; 
        new Random();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(MyFile), "UTF-8"));
            while((line = reader.readLine())!=null) {

                String[] StrLine = line.split("\\|");

                StrLine[0] = StrLine[0].stripTrailing();
                StrLine[1] = StrLine[1].stripLeading();

                if(map.get(StrLine[0]) == null) {
                    ArrayList<String> ProductsList = new ArrayList<>();
                    ProductsList.add(StrLine[1]);
                    map.put(StrLine[0], ProductsList);

                }
                else {
                    ((ArrayList<String>) map.get(StrLine[0])).add(StrLine[1]);

                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e);
            System.out.println("");
        }

        return map;
    }
}
