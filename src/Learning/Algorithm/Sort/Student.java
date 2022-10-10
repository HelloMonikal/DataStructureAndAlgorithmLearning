package Learning.Algorithm.Sort;

import Learning.DataStructure.Array.Array;

public class Student implements Comparable<Student> {
    private String name;
    private  int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another){
//        return  this.score - another.score;
//        从大到小
        return  another.score - this.score;
    }


    @Override
    public boolean equals(Object student){
        if(this == student)
            return  true;
        if(student == null)
            return  false;
        if(this.getClass() != student.getClass())
            return  false;
        Student another = (Student)student;
        return this.name.equalsIgnoreCase(another.name);
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)",name,score);
    }


    public static void main(String[] args){
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice",99));
        arr.addLast(new Student("George",100));
        arr.addLast(new Student("Dense",62));
        arr.addLast(new Student("Charlie",88));

        System.out.println(arr);

    }
}
