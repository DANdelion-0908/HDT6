import java.io.BufferedReader;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileReader;

public class Reader {
    
    public Map FileReader(Map map) {
        String MyFile = "src/ListadoProducto.txt";
        String line = ""; 
        Random rand = new Random();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(MyFile));
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
