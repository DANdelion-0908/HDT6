import java.util.Scanner;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("*****************************");
        System.out.println("* Bienvenidos a Compras.com *");
        System.out.println("*****************************\n");

        Scanner inputScanner = new Scanner(new InputStreamReader(System.in, "UTF-8"));
        Scanner inputScanner2 = new Scanner(new InputStreamReader(System.in,"UTF-8"));
        Scanner inputScanner3 = new Scanner(new InputStreamReader(System.in,"UTF-8"));
        Scanner inputScanner4 = new Scanner(new InputStreamReader(System.in,"UTF-8"));

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
            System.out.println("6. Mostrar todos los productos y categorías ordenados.");
            System.out.println("7. Salir. \n");

            try {

                System.out.print("Tu elección es: ");
                int optInt = inputScanner.nextInt();
                System.out.println("");
            
                switch (optInt) {
                    case 1: 
                        // Asking the user to input a category and an item to add to that category.
                        System.out.print("Ingresa la categoría en la que quieres añadir objetos: ");
                        String cla = inputScanner2.nextLine();
                        System.out.println("");

                        System.out.print("Ingresa el objeto que vas a añadir a esa categoría: ");
                        String item = inputScanner3.nextLine();
                        System.out.println("");

                        // Adding a new item to the UserMap.
                        Admin.add(UserMap, MyMap, cla, item);
                    
                        break;

                        case 2: 
                        // Asking the user to input a product and then it is searching for that product in
                        // the UserMap. If the product is found, it will print the category in which it is
                        // found. If the product is not found, it will print a message saying that the
                        // product does not exist.
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

                // Calling the method showMap from the class MapAdmin and passing the UserMap as a
                // parameter.
                case 3: Admin.showMap(UserMap);

                break;

                // Checking if the UserMap is empty. If it is empty, it will print a message saying
                // that the UserMap is empty. If it is not empty, it will print a message saying that
                // it is ordering the UserMap and then it will call the class Compare and pass the
                // UserMap as a parameter.
                case 4: if(UserMap.isEmpty()) {
                    System.out.println("Su carrito está vacio.");
                
                } else {
                    System.out.println("Ordenando... "); 
                    new ProgressBar();
                    System.out.println("");
                    new Compare(UserMap);
                }

                break;

                // Calling the method showMap from the class MapAdmin and passing the MyMap as a
                // parameter.
                // Calling the method showMap from the class MapAdmin and passing the MyMap as a
                // parameter.
                case 5: Admin.showMap(MyMap);

                break;

                // Calling the method showMap from the class MapAdmin and passing the MyMap as a
                // parameter.
                case 6: System.out.println("Ordenando... "); 
                        new ProgressBar();
                        System.out.println("");
                        
                        new Compare(MyMap);

                break; 

                case 7:  System.out.println("Saliendo...");
                
                    return;
                }

            // Catching an exception and printing a message.
            } catch(Exception e) {
                System.out.println("Ingresa un dato válido. \n");
                break;
            }

        }

        inputScanner.close();
        inputScanner2.close();
        inputScanner3.close();
        inputScanner4.close();
    }
}
