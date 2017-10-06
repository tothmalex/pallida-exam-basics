public class UniqueChars2 {

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("anagram"));

    }
    public static String uniqueCharacters(String test) {

        String temp = "";
        char[] array = test.toCharArray();
        int count;

        outerloop: for (int i = 0; i < test.length(); i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (test.charAt(i) == array[j])
                    count++;
                if (count == 2) {
                    count = 0;
                    continue outerloop;
                }
            }
            temp += test.charAt(i);
        }
        return (temp);
    }
}
