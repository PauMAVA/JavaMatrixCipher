package me.PauMAVA.MatrixCipher;

import java.util.Iterator;

public class CipherMatrix {

    private DiagonalIterableMatrix<Character> dmat;
    private int size;


    public CipherMatrix(int textLength) {
        this.size = getMatrixLength(textLength);
        this.dmat = new DiagonalIterableMatrix<>(new Character[size][size], size);
    }

    private int getMatrixLength(int textLength) {
        for (int i = 0; i < textLength; i++) {
            if (i * i >= textLength) {
                return i;
            }
        }
        return -1;
    }

    public void setDiagonalText(String text) {
        setTextToIterator(dmat.iterator(), text);
    }

    public void setNaturalText(String text) {
        setTextToIterator(dmat.naturalIterator(), text);
    }

    private void setTextToIterator(RWIterator<Character> iterator, String text) {
        int k = 0;
        while(iterator.hasNext() && k < size) {
            iterator.setValueAndNext(text.charAt(k));
            k++;
        }
    }

    public String readDiagonally() {
       return iteratorToString(dmat.iterator());
    }

    public String readNaturally() {
        return iteratorToString(dmat.naturalIterator());
    }

    private String iteratorToString(Iterator<Character> iterator) {
        StringBuilder sb = new StringBuilder();
        while(iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return dmat.toString();
    }


}
