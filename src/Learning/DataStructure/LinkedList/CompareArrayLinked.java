package Learning.DataStructure.LinkedList;

import Learning.DataStructure.Array.Array;

public class CompareArrayLinked {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int[] dataSize = {100000, 1000000, 10000000};

        int j = 0;
        while (j < dataSize.length) {
            long startTime = System.nanoTime();
            for (int i = 0; i < dataSize[j]; i++)
                array.addLast(i);
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1e9;
            System.out.println(dataSize[j]+"\tArray:" + time + "s");

            startTime = System.nanoTime();
            for (int i = 0; i < dataSize[j]; i++)
                linkedList.addFirst(i);
            endTime = System.nanoTime();
            time = (endTime - startTime) / 1e9;
            System.out.println(dataSize[j]+"\tLinked_list:" + time + "s");
            j++;
            System.out.println();
        }


    }
}
