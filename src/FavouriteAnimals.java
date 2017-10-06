import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FavouriteAnimals {

    public static void main(String[] args) {

                if (args.length == 0) {
                    System.out.println("java FavouriteAnimals [animal] [animal]");
                } else if ( args.length > 0) {
                    System.out.println("No destination provided");
                } else if (args.length == 2) {
                    Path fromPath = Paths.get(args[0]);
                    Path toPath = Paths.get(args[1]);
                    if (Files.exists(fromPath) && !Files.isDirectory(fromPath)) {
                        try {
                            Files.write(toPath, Files.readAllLines(fromPath));
                        } catch (IOException e) {
                            System.out.println("Unable to write file from: " + args[0]);
                        }
                    } else {
                        System.out.println("Unable to copy: filename is not found");
                    }
                }
            }
        }
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them
    }
}
