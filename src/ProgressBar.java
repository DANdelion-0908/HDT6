public class ProgressBar {
    
    // Configura la barra de carga
    int total = 100;
    int progress = 0;
    int width = 50;

    public ProgressBar() {
        
    // Actualiza la barra de carga
    while (progress < total) {
        // Calcula el porcentaje completo
        int percent = progress * 100 / total;

        // Calcula la cantidad de caracteres a imprimir
        int chars = percent * width / 100;

        // Imprime la barra de carga
        System.out.print("\r[");
        for (int i = 0; i < chars; i++) {
            System.out.print("=");
        }

        for (int i = chars; i < width; i++) {
            System.out.print(" ");
        }

        System.out.print("] " + percent + "%");

        // Actualiza el progreso
        progress++;

        // Espera un poco antes de actualizar de nuevo
        try {
            Thread.sleep(50); // espera 50 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Imprime la barra de carga completa
    System.out.print("\r[");
    for (int i = 0; i < width; i++) {
        System.out.print("=");
    }
    System.out.println("] 100%");
    }
}

