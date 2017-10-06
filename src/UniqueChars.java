import java.util.ArrayList;

public class UniqueChars {

    public static void main(String[] args) {

        System.out.println("\nUnique letters:");
        System.out.println(uniqueCharacters("anagram"));
    }

    public static ArrayList uniqueCharacters(String input) {

        ArrayList<Character> letterList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            letterList.add(input.charAt(i));
        }
                for (int i = 0; i < letterList.size(); i++) {
                    for (int j = 0; j < letterList.size(); j++) {
                        if (i != j && letterList.get(i) == letterList.get(j)) {
                            letterList.remove(i);
                        }
                    }
                }
                return letterList;
            }
    }

