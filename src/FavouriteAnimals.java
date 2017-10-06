
public class FavouriteAnimals {

    public static void main(String[] args) {

        NewAnimal addNew = new NewAnimal();

                if (args.length == 0) {
                    System.out.println("java FavouriteAnimals [animal] [animal]");
                } else if ( args.length > 0) {
                    addNew.adding(args);
                }
            }
        }
