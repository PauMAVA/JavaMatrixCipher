package me.PauMAVA.MatrixCipher.matrix;

class DiagonalIterableMatrix<T> implements Iterable<T> {

    private T[][] matrix;
    private int size;

    DiagonalIterableMatrix(T[][] matrix, int size) {
        this.matrix = matrix;
        this.size = size;
    }

    @Override
    public RWIterator<T> iterator() {
        return new RWIterator<T>() {

            @Override
            public void setValue(T value) {
                matrix[i][j] = value;
            }

            private int i = 0;
            private int j = 0;
            private int k = 0;

            @Override
            public boolean hasNext() {
                return !(i == j && i == size - 1);
            }

            @Override
            public T next() {
                T var = matrix[i][j];
                if (i == 0 || i == k - 1) {
                    i = Math.min(j + 1, size - 1);
                    j = i == size - 1 ? k++ : 0;
                } else {
                    i--;
                    j++;
                }
                return var;
            }

            @Override
            public int[] current() {
                return new int[]{i, j};
            }
        };
    }

    public RWIterator<T> naturalIterator() {
        return new RWIterator<T>() {

            private int i = 0;
            private int j = 0;

            @Override
            public boolean hasNext() {
                return !(i == j && i == size - 1);
            }

            @Override
            public T next() {
                T var = matrix[i][j];
                i = j == size -1 ? ++i: i;
                j = j == size -1 ? 0 : ++j;
                return var;
            }

            @Override
            public int[] current() {
                return new int[]{i, j};
            }

            @Override
            public void setValue(T value) {
                matrix[i][j] = value;
            }
        };
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != null) {
                    stringBuilder.append(matrix[i][j] instanceof Character && (Character) matrix[i][j] == ' ' ? "-" : matrix[i][j]).append(" ");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
