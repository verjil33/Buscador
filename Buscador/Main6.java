import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
	//similar al main 3 pero primero indica donde se buscan los arichivos
	public static void main(String[] args) throws IOException {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		List<Path> dirs = Files.walk(Paths.get(path), 1)
				.filter(Files::isDirectory)
				.collect(Collectors.toList());

		System.out.println(dirs);
	}
}