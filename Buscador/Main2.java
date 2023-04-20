import java.io.File;
import java.util.Arrays;

public class Main2 {
	//es similiar al main 1
	public static void main(String[] args) {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		File file = new File(path);
		String[] directories = file.list((dir, name) -> new File(dir, name).isDirectory());
		System.out.println(Arrays.toString(directories));
	}
}