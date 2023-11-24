package other;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordHasher {

    // Function to hash a password using SHA-256 algorithm
    public static String hashPassword(String password) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Perform the hash operation on the password bytes
            byte[] hashBytes = digest.digest(password.getBytes());

            // Convert the byte array to a base64 encoded string
            String hashedPassword = Base64.getEncoder().encodeToString(hashBytes);

            return hashedPassword;
        } catch (NoSuchAlgorithmException e) {
            // Handle algorithm not found exception
            e.printStackTrace();
            return null;
        }
    }

    // Example usage
    public static void main(String[] args) {
        String userPassword = "user123"; // Replace with the actual user password

        // Hash the password
        String hashedPassword = hashPassword(userPassword);

        // Display the hashed password
        System.out.println("Hashed Password: " + hashedPassword);
    }
}

