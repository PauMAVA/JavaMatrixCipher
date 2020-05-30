package me.PauMAVA.MatrixCipher;

public class MainClass {

    public static void main(String[] args) {
        String text = "Hello world, my name is PauMAVA!";
        String encrypted = MatrixCipherTools.encrypt(text);
        String decrypted = MatrixCipherTools.decrypt(encrypted);
        System.out.println("Original: " + text + "\n" + "Encrypted: " + encrypted + "\n" + "Decrypted: " + decrypted);
    }

}
