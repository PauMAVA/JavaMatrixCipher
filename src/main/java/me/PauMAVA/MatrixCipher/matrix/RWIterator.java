package me.PauMAVA.MatrixCipher.matrix;

import java.util.Iterator;

interface RWIterator<T> extends Iterator<T> {

    default void setValueAndNext(T value) {
        setValue(value);
        next();
    };

    int[] current();

    void setValue(T value);

}
