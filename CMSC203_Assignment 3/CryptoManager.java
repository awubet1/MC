/**
 *  Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg
 * Assignment: 3
 * Description: The provided code is a utility class named CryptoManager designed for encrypting and decrypting phrases
 *  using two methods: the Caesar Cipher and the Bellaso Cipher. 
 *  The class includes methods for checking if a string is within the allowable bounds of ASCII codes, 
 *  encrypting and decrypting using the Caesar Cipher, and encrypting and decrypting using the Bellaso Cipher. 
 *  The Caesar Cipher involves shifting characters by a specified offset, while the Bellaso Cipher uses a key word
 *   to determine offsets for each character in the message.
 * Due: 03/18/2024
 * Platform/compiler: eclipse
 * I pledge that i have completed the programming assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alazar Wubet
*/
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */

public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds(String plainText) {
	    for (char character : plainText.toCharArray()) {
	        if (character < LOWER_RANGE || character > UPPER_RANGE) {
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
	    StringBuilder encryptedText = new StringBuilder();

	    for (char character : plainText.toCharArray()) {
	        if (Character.isUpperCase(character)) {
	            int originalAlphabetPosition = character - 'A';
	            int newAlphabetPosition = (originalAlphabetPosition + key) % RANGE;
	            char encryptedCharacter = (char) ('A' + newAlphabetPosition);
	            encryptedText.append(encryptedCharacter);
	        } else {
	            // If the character is not an uppercase letter, leave it unchanged
	            encryptedText.append(character);
	        }
	    }

	    return encryptedText.toString();
	}

	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption(String plainText, String bellasoStr) {
	    StringBuilder encryptedText = new StringBuilder();
	    int bellasoLength = bellasoStr.length();

	    for (int i = 0; i < plainText.length(); i++) {
	        char plainChar = plainText.charAt(i);
	        char bellasoChar = bellasoStr.charAt(i % bellasoLength);

	        int encryptedChar = (plainChar + bellasoChar) % RANGE;

	        encryptedText.append((char) (encryptedChar + LOWER_RANGE));
	    }

	    return encryptedText.toString();
	}

	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption(String encryptedText, int key) {
	    StringBuilder decryptedText = new StringBuilder();

	    for (char character : encryptedText.toCharArray()) {
	        if (Character.isUpperCase(character)) {
	            int originalAlphabetPosition = character - 'A';
	            int newAlphabetPosition = (originalAlphabetPosition - key + RANGE) % RANGE;
	            char decryptedCharacter = (char) ('A' + newAlphabetPosition);
	            decryptedText.append(decryptedCharacter);
	        } else {
	            // If the character is not an uppercase letter, leave it unchanged
	            decryptedText.append(character);
	        }
	    }

	    return decryptedText.toString();
	}

	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
	    StringBuilder decryptedText = new StringBuilder();
	    int bellasoLength = bellasoStr.length();

	    for (int i = 0; i < encryptedText.length(); i++) {
	        char encryptedChar = encryptedText.charAt(i);
	        char bellasoChar = bellasoStr.charAt(i % bellasoLength);

	        int decryptedChar = (encryptedChar - bellasoChar + RANGE) % RANGE;

	        decryptedText.append((char) (decryptedChar + LOWER_RANGE));
	    }

	    return decryptedText.toString();
	}

}
