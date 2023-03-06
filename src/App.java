import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*****************************");
        System.out.println("* Bienvenidos a Compras.com *");
        System.out.println("*****************************\n");

        Scanner inputScanner = new Scanner(System.in);
        Scanner inputScanner2 = new Scanner(System.in);
        Scanner inputScanner3 = new Scanner(System.in);
        Scanner inputScanner4 = new Scanner(System.in);

        System.out.println("Elige el tipo de MAP que se implemetará: ");
        System.out.println("1. HashMap.");
        System.out.println("2. TreeMap.");
        System.out.println("3. LinkedHashMap.\n");
        
        System.out.print("Tu opción: ");
        int mapInt = inputScanner.nextInt();
        
        HashFactory HashTable = new HashFactory(mapInt);

        Map<String, ArrayList<String>> MyMap = HashTable.createMap(mapInt);

        Map<String, ArrayList<String>> UserMap = HashTable.createMap(mapInt);

        Reader reader = new Reader();

        reader.FileReader(MyMap);
        
        boolean key = true;
        
        MapAdmin Admin = new MapAdmin();

        while(key) {
            System.out.println("1. Agregar un producto.");
            System.out.println("2. Mostrar categoría.");
            System.out.println("3. Mostrar datos de un producto.");
            System.out.println("4. Mostrar datos de un producto ordenados.");
            System.out.println("5. Mostrar todos los productos y categorías.");
            System.out.println("6. Mostrar todos los productos y categorías ordenados. \n");

            System.out.print("Tu elección es: ");
            int optInt = inputScanner.nextInt();
            System.out.println("");
            
            switch (optInt) {
                case 1: 
                    System.out.print("Ingresa la categoría en la que quieres añadir objetos: ");
                    String cla = inputScanner2.nextLine();
                    System.out.println("");

                    System.out.print("Ingresa el objeto que vas a añadir a esa categoría: ");
                    String item = inputScanner3.nextLine();
                    System.out.println("");

                    Admin.add(UserMap, MyMap, cla, item);
                    
                    break;

                case 2: 
                    System.out.print("Ingresa el objeto sobre el que quieres saber su categoría: ");
                    String pro = inputScanner4.nextLine();
                    System.out.println("");
                    
                    boolean crazy = true;

                    for (String llave : UserMap.keySet()) {

                        for (String string : UserMap.get(llave)) {
                            
                            if (string.equals(pro)) {
                                System.out.println("El objeto " + pro + " se encuentra en la categoría " + llave + "\n");

                                crazy = false;

                                break;

                            } else {
                                continue;
                                
                            }
                        }
                    }
                    
                    if(crazy == true) {
                        System.out.println("El producto no existe. \n");
                        
                    }
                break;

                case 3: 

                break;

                case 4: 

                break;

                case 5: Admin.showMap(MyMap);

                break;

                case 6:

                break; 
            }
        }
        inputScanner.close();
    }
}
