public class CaesarCipher {
    // Метод для зашифровки текста
    public static String encode(String text, int shift) {
        StringBuilder result = new StringBuilder(); // или StringBuffer

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                char shiftDirection = (ch >= 'A' && ch <= 'Z') ? 'A' : 'a';
                ch = (char) (((ch - shiftDirection + shift) % 26 + 26) % 26 + shiftDirection);
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Метод для расшифровки текста
    public static String decode(String text, int shift) {
        return encode(text, -shift);
    }
}