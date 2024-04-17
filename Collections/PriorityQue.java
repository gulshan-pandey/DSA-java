package Collections;
import java.util.*;

public class PriorityQue {
    

    public static void main(String[] args) {
        
        // making the object with custom comparator
        PriorityQueue <Student> queue = new PriorityQueue<>(new Comparator<Student>() {     // anonymous inner class

            public int compare(Student s1 , Student s2){  //this is the custom comparator
              return s1.getGrade() - s2.getGrade();
            }
        });

        queue.offer(new Student("ram",'B'));
        queue.offer(new Student("john",'D'));
        queue.offer(new Student("kaka",'C'));
        queue.offer(new Student("bob",'A'));
        queue.offer(new Student("himanshu",'A'));

        System.out.println("to string is : " + queue);

        System.out.println(" \n initially the the priority queue is not organised ,but it will,when we do operation on them! \n");
        System.out.println(queue.poll());     // poll method doesnot throw exception
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }







private static class Student{
    private final String name ;
    private final char grade ;

    @Override
    public String toString() {
        return name + " : " + grade;
    }


    public Student(String name,char grade){
    this.name =name;
    this.grade = grade;
    }

   
    public char getGrade() {
        return grade;
    }

    
 }

}
