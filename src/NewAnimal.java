import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewAnimal {

    public void adding (String [] args) {

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < args.length; i++) {
            result.append(args[i] + " ");
        }
        String init = result.toString();

        if (!init.isEmpty() && init instanceof String) {
            try {
                Path filePath = Paths.get("favourites.txt");
                List<String> lines = Files.readAllLines(filePath);
                lines.add(init);
                Files.write(filePath, lines);
            } catch (IOException e) {
                System.out.println("Unable to write file: favourites.txt!");
            }
        } else {
            System.out.println("Unable to add: no animal was inserted");
        }
    }
}
