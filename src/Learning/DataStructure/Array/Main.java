package Learning.DataStructure.Array;

public class Main {
    public static void  main(String[] args){
        Array<Integer> arr = new Array<>(21);
        for(int i = 0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1,100);
        arr.addFist(-1);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);


        arr.remove(1);
        arr.remove(2);
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);

    }
}
