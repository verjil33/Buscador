import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main3 {
	//Indica la direccion de las carpetas
	public static void main(String[] args) {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		File[] directories = new File(path).listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});

		System.out.println(Arrays.toString(directories));
	}
}