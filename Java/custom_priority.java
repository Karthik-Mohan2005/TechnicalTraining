import java.util.PriorityQueue;

class student
{
    int roll_no;
    String name;
    float cgpa;
    student(int roll_no,String name,float cgpa)
    {
        this.name = name;
        this.cgpa = cgpa;
        this.roll_no = roll_no;
    }
}
public class custom_priority {
    static void main() {
        PriorityQueue<student> que = new PriorityQueue<>(
               // (s1,s2) -> s1.roll_no - s2.roll_no ;
                //((s1,s2)-> s1.name.compareTo(s2.name))
               // (s1,s2) -> Float.compare(s1.cgpa,s2.cgpa)
                (s1,s2) -> {
                    if(!(s1.name.equals(s2.name)))
                        return s1.name.compareTo(s2.name);

                    return s1.roll_no - s2.roll_no ;
                }
        );

        que.offer(new student(103,"CCCC",5.67f));
        que.offer(new student(104,"AAAA",6.78f));
        que.offer(new student(101,"AAAA",7.89f));
        que.offer(new student(102,"BBBB",8.97f));
        que.offer(new student(105,"EEEE",8.67f));

        while(!que.isEmpty())
        {
            student s = que.poll();
            System.out.printf("%d\n%s\n%.2f",s.roll_no,s.name,s.cgpa);
            System.out.println();
        }
    }
}
