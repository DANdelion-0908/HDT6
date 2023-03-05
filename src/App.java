import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*****************************");
        System.out.println("* Bienvenidos a Compras.com *");
        System.out.println("*****************************\n");

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Elige el tipo de MAP que se implemetará: ");
        System.out.println("1. HashMap.");
        System.out.println("2. TreeMap.");
        System.out.println("3. LinkedHashMap.\n");
        
        System.out.print("Tu opción: ");
        int mapString = inputScanner.nextInt();
        
        HashFactory HashTable = new HashFactory(mapString);

        HashTable.createMap(mapString);
        
        boolean key = true;
        
        while(key) {
            System.out.println("Ingresa el ");
        }
        inputScanner.close();
    }
}
