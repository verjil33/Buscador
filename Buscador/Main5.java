import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main5 {
	//indica el nombre de las carpetas una encima de la otra
	public static void main(String[] args) {
		String path = "D:/Users/user/Documents/Mate/Video games/Facultad/Mobile-Internet/Buscador/Buscador";

		try (DirectoryStream<Path> ds = Files.newDirectoryStream(
				FileSystems.getDefault().getPath(path), Files::isDirectory)) {
			for (Path p : ds) {
				System.out.println(p.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}