package Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TestingTreeset{
    //TreeSet uses RBtree , which gives the sorted output, it has comparator interface by default for sorting which has compareTo method which works underneath
    //for introducing the customize class in treeSet we have to implement comparable interface

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new MyComparator());   //providing the customize sorting in the constructor
        
        //intorducing our own class(student) in treeSet for which we have to implement comparable interface
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(students);
    }
}





class MyComparator implements Comparator<Student> {             // another way of sorting by using comparator interface

    @Override
    public int compare(Student s1, Student s2) {
        Integer id1 = s1.getId();
        Integer id2 = s2.getId();
        if(id1>id2) return 1;
        else if(id1<id2) return -1;
        else return 0;
    }
}



 class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        // return Integer.compare(this.id, other.id); // Sorting by id
       // return Integer.compare(other.id, this.id); // Sorting in reverse order by id

       if(this.id>other.id) return 1;
       else if(this.id<other.id) return -1;
       else return 0;

    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

  
}
