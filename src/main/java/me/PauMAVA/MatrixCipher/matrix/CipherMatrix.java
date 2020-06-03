package me.PauMAVA.MatrixCipher.matrix;

import me.PauMAVA.MatrixCipher.util.NumericTools;

import java.util.Iterator;

public class CipherMatrix {

    private DiagonalIterableMatrix<Character> dmat;
    private int size;

    private boolean advanced;

    public CipherMatrix(int textLength) {
        this(textLength, false);
    }

    public CipherMatrix(int textLength, boolean advanced) {
        this.size = getMatrixLength(textLength);
        this.advanced = advanced;
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
        setTextToIterator(dmat.iterator(), text, 1);
    }

    public void setNaturalText(String text) {
        setTextToIterator(dmat.naturalIterator(), text, -1);
    }

    private void setTextToIterator(RWIterator<Character> iterator, String text, int mode) {
        int k = 0;
        while(iterator.hasNext() && k < text.length()) {
            Character character = text.charAt(k);
            character = advanced ? modifyChar(character, mode, iterator.current()[0] * iterator.current()[1]) : character;
            iterator.setValueAndNext(character);
            k++;
        }
    }

    public String readDiagonally() {
       return iteratorToString(dmat.iterator());
    }

    public String readNaturally() {
        return iteratorToString(dmat.naturalIterator());
    }

    private String iteratorToString(RWIterator<Character> iterator) {
        StringBuilder sb = new StringBuilder();
        while(iterator.hasNext()) {
            Character character = iterator.next();
            sb.append(character != null ? character : (char) 0);
        }
        return sb.toString();
    }

    private Character modifyChar(Character original, int mode, int pos) {
        // Modify in circular range [48, 125]
        int ascii = original;
        return (char) new NumericTools.CircularRange(48, 125).add(ascii, pos * mode);
    }

    @Override
    public String toString() {
        return dmat.toString();
    }


}
