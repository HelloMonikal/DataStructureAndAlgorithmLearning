package Learning.Algorithm.Search;

import Learning.DataStructure.Array.Array;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for(int i = 0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1,100);
        arr.addFist(-1);
        System.out.println(arr);
    }
}
