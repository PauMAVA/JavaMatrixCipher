package me.PauMAVA.MatrixCipher;

import java.util.Iterator;

public interface RWIterator<T> extends Iterator<T> {

    default void setValueAndNext(T value) {
        setValue(value);
        next();
    };

    void setValue(T value);

}
