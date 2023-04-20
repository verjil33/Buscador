import java.io.File;
import java.util.Arrays;

public class Main4 {
	//similar al main 3
	public static void main(String[] args) {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		File[] directories = new File(path).listFiles(File::isDirectory);
		System.out.println(Arrays.toString(directories));
	}
}