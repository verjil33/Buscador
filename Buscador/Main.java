import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Main {
	//indica solo el nombre de las carpetas una al lado de la otra
	public static void main(String[] args) {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		File file = new File(path);
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isDirectory();
			}
		});

		System.out.println(Arrays.toString(directories));
	}
}