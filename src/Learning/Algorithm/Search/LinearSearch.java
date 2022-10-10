package Learning.Algorithm.Search;

//线性查找
//泛型中只能是类对象
public class LinearSearch{
    private LinearSearch(){}

    public static <E> int search(E[] data, E target){
        for(int i = 0;i < data.length;i++)
            if(data[i].equals(target))
                return i;
        return -1;
    }

    public static void main(String[] args){

//        Integer [] data = {24,18,12,9,16,66,32,4};
//
//        int res = search(data,16);
//        System.out.println(res);
//
//        int res2 = search(data,666);
//        System.out.println(res2);
//
//
//        Learning.DataStructure.Search.Student[] students = {new Learning.DataStructure.Search.Student("George"),
//                                new Learning.DataStructure.Search.Student("Alice"),
//                                new Learning.DataStructure.Search.Student("Harry")};
//
//        Learning.DataStructure.Search.Student george = new Learning.DataStructure.Search.Student("harry");
//        int res3 = search(students,george);
//        System.out.println(res3);

//        =============================
        int[] dataSize = {100,1000,10000,100000,1000000};

        for (int n: dataSize){
            Integer[] data = ArrayGenerator.generateRandomArray(n,5);


            long start = System.nanoTime();
            for (int k = 0; k < 1000; k++) {
                search(data, n);
            }

            long end = System.nanoTime();
            double time = (end - start) / 1000000000.0;
            System.out.println("n = " + n + ",   100 runs: " + time + "s");
        }

    }
}
