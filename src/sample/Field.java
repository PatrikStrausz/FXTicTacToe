package sample;


import java.util.Random;

public class Field {


    private Tile[][] arr;

    public Field() {
        initField();
    }

    public Tile[][] getArr() {
        return arr;
    }

    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    private void initField() {
        arr = new Tile[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = new Tile();

            }

        }

    }

    public boolean isWinner() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].isValue()) {
                    count++;
                }

            }

        }

        if (count == 16 || count == 0) {
            return true;
        }

        return false;


    }

    public void toggleTiles(int tileCode) {
        int x = tileCode % 4; //column
        int y = tileCode / 4;   // row

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (!(x == i && y == j) && Math.abs(x - i) <= 1 && Math.abs(y - j) <= 1) {
                    arr[i][j].toggle();
                }

            }
        }


    }


    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < 47; i++) {
            toggleTiles(rnd.nextInt(15));
        }
        while (isWinner()) ;

    }

    public void print() {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j].isValue() ? " X " : " O ");

            }
            System.out.println();
        }
        System.out.println();

    }

}
