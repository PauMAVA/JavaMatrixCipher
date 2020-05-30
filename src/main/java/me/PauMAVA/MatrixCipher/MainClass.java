package me.PauMAVA.MatrixCipher;

public class MainClass {

    public static void main(String[] args) {
        String text = "Hello world, my name is PauMAVA!";
        CipherMatrix matrix = new CipherMatrix(text.length());
        matrix.setDiagonalText(text);
        System.out.println(matrix.readNaturally());
        matrix.setNaturalText(matrix.readNaturally());
        System.out.println(matrix.toString());
    }

}
