public class Main {

    public static void main(String[] args) {
        String plaintext = "Hello, world!";
        int shift = 3;

        // Зашифровка текста
        String encodedText = CaesarCipher.encode(plaintext, shift);
        System.out.println("Зашифрованный текст: " + encodedText);

        // Расшифровка текста
        String decodedText = CaesarCipher.decode(encodedText, shift);
        System.out.println("Расшифрованный текст: " + decodedText);
    }
}