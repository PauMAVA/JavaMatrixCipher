package me.PauMAVA.MatrixCipher;

import me.PauMAVA.MatrixCipher.matrix.CipherMatrix;

public class MatrixCipherTools {

    // Sealed
    private MatrixCipherTools() {}

    public static String encrypt(String plain) {
        CipherMatrix cipherMatrix = new CipherMatrix(plain.length());
        cipherMatrix.setDiagonalText(plain);
        return cipherMatrix.readNaturally();
    }

    public static String decrypt(String encrypted) {
        CipherMatrix cipherMatrix = new CipherMatrix(encrypted.length());
        cipherMatrix.setNaturalText(encrypted);
        return cipherMatrix.readDiagonally().replace("\0","");
    }


}
