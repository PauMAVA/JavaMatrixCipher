package me.PauMAVA.MatrixCipher;

import me.PauMAVA.MatrixCipher.matrix.CipherMatrix;

public class MatrixCipherTools {

    // Sealed
    private MatrixCipherTools() {}

    public static String encrypt(String plain) {
        return encrypt(plain, false);
    }

    public static String decrypt(String encrypted) {
        return decrypt(encrypted, false);
    }

    public static String encrypt(String plain, boolean advanced) {
        CipherMatrix cipherMatrix = new CipherMatrix(plain.length(), advanced);
        cipherMatrix.setDiagonalText(plain);
        return cipherMatrix.readNaturally();
    }

    public static String decrypt(String encrypted, boolean advanced) {
        CipherMatrix cipherMatrix = new CipherMatrix(encrypted.length(), advanced);
        cipherMatrix.setNaturalText(encrypted);
        return cipherMatrix.readDiagonally().replace("\0","");
    }


}
