public class Main {
    /*
    Use the following methods:
    .length()
    .substring(start, finish) doesn't include finish
    .substring(start) goes to the end
    .indexOf(someString)
     someString.equals(otherString)
     */
    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        System.out.println(VowelCount(""));
        System.out.println("Correct output: 0");
        System.out.println(VowelCount("AEIOU"));
        System.out.println("Correct output: 5");
        System.out.println(VowelCount("AEI$&*^#!@OU"));
        System.out.println("Correct output: 5");
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls");
        System.out.println(VowelRemover("Something"));
        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println(ContainsSubstring("lanyard","yard"));
        System.out.println("Correct output: true");
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        int length = input.length();
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for(int i = 0; i < length; i++){
            String letter = lowerCaseInput.substring(i,i+1);
            if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    public static String VowelRemover(String input){
        /*
        int variable for the length of the oString
        String variable = original string
        make string lowercase
        use stringVariable.indexOf() to get vowels

         */
        int length2 = input.length();
        String lowerCase = input.toLowerCase();
        String noVowels = "";
        for(int i2 = 0; i2 < length2; i2++){
            String letter2 = lowerCase.substring(i2,i2+1);
            if(!(letter2.toLowerCase().equals("a") || letter2.toLowerCase().equals("e") || letter2.toLowerCase().equals("i")
            || letter2.toLowerCase().equals("o") || letter2.toLowerCase().equals("u"))){
                noVowels = noVowels + letter2;
            }
        }

        return noVowels;
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
        /*
        use .substring()



        if(input.indexOf(target) >= 0){
            return true;
        }
        return false;

         */

        int targetL = target.length();
        int strL = input.length();
        int maxLength = strL - targetL;
        for(int i3 = 0; i3 <= maxLength; i3++) {
            String portion = input.substring(i3, i3 + targetL);
            if(portion.equals(target)){
                return true;
            }
        }
        return false;



    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){
        /*
        inputL = input.length();

         */
        String output = "";
        int inputL = input.length();
        for(int i4 = inputL - 1; i4 >= 0; i4--){
            String some = input.substring(i4, i4 + 1);
            output = output + some;
        }
        return output;
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){

        return input.equals(ReverseString(input));
    }
}
