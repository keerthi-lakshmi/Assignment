public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Character: " + ch);

        // Check if it's a letter
        System.out.println("Is a letter: " + Character.isLetter(ch));

        // Convert to lowercase
        char lowercaseCh = Character.toLowerCase(ch);
        System.out.println("Lowercase Character: " + lowercaseCh);

        // Convert to uppercase
        char uppercaseCh = Character.toUpperCase(ch);
        System.out.println("Uppercase Character: " + uppercaseCh);

        // Check if it's a digit
        char digitCh = '5';
        System.out.println("Is a digit: " + Character.isDigit(digitCh));

        // Check if it's a whitespace character
        char whitespaceCh = ' ';
        System.out.println("Is a whitespace character: " + Character.isWhitespace(whitespaceCh));

        // Check if it's a valid Java identifier start character
        char startCh = '_';
        System.out.println("Is a valid Java identifier start character: " + Character.isJavaIdentifierStart(startCh));

        // Check if it's a valid Java identifier part character
        char partCh = '0';
        System.out.println("Is a valid Java identifier part character: " + Character.isJavaIdentifierPart(partCh));
    }
}
