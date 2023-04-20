import java.io.File;

public class buscador{
   public static void main(String[] args) {
    File directorioFile = new File("D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet");
    System.out.println(buscar("nombrearchivo.tipoarchivo", directorioFile));
    //poner bien el nombre del archivo y la ruta
}

private static File buscar(String archivoABuscar, File directorio) {
    File[] archivos = directorio.listFiles();
    for (File archivo : archivos) {
        if (archivo.getName().equals(archivoABuscar)) {
            return archivo;
        }
        if (archivo.isDirectory()) {
            File resultadoRecursion = buscar(archivoABuscar, archivo);
            if (resultadoRecursion != null) {
                return resultadoRecursion;
            }
        }
    }
    return null;
}
        
}

