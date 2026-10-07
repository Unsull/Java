package basic;
import java.io.UnsupportedEncodingException;

public class DecodeAndEncode {
    public static void main(String[] args) {
        try {
            // Example of encoding a string to Base64
            String originalString = "Hello, World!";
            String encodedString = java.util.Base64.getEncoder().encodeToString(originalString.getBytes("utf-8"));
            System.out.println("Encoded String: " + encodedString);

            // Example of decoding a Base64 string back to the original string
            byte[] decodedBytes = java.util.Base64.getDecoder().decode(encodedString);
            String decodedString = new String(decodedBytes, "utf-8");
            System.out.println("Decoded String: " + decodedString);
        } catch (UnsupportedEncodingException e) {
            System.err.println("An error occurred during encoding/decoding: " + e.getMessage());
        }
    }
}
