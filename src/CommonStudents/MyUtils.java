package CommonStudents;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

// Create the commonStudents() method of the MyUtils class to return a HashSet 
// of common elements of two student lists.
// For example, for a given 
// list1 [Students [id=1, name=Ivan], Students [id=2, name=Petro], Students [id=3, name=Stepan]] 
// list2 [Students [id=1, name=Ivan], Students [id=3, name=Stepan], Students [id=4, name=Andriy]] 
//  should get [Students [id=3, name=Stepan], Students [id=1, name=Ivan]].

public class MyUtils {
    public static class Student {
        private int id;
        private String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Student))
                return false;
            Student others = (Student) o;
            return others.name == name && others.id == id;
        }

        @Override
        public String toString() {
            return String.format("Student[id=%d, name=%s]", id, name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        Set<Student> st = new HashSet<Student>();

        for (Student std1 : list1) {

            for (Student std2 : list2) {
                System.out.println(std1);
                System.out.println(std2);
                System.out.println("Equals: " + std1.equals(std2));
                System.out.println("Consist: " + st.contains(std1));
    
                    if (std1.equals(std2) && !st.contains(std1)) {
                        st.add(std1);
                        System.out.println("Add " + std1.getName() + " to Set!");
                    }
                
            }
        }

        Iterator<Student> it = st.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString() + " ");
        }

        return st;
    }

    public static void main(String[] args) {
        List<Student> l1 = new ArrayList<Student>();
        l1.add(new Student(1, "Ivan"));
        l1.add(new Student(2, "Petro"));
        l1.add(new Student(3, "Stepan"));

        List<Student> l2 = new ArrayList<Student>();
        l2.add(new Student(1, "Ivan"));
        l2.add(new Student(3, "Stepan"));
        l2.add(new Student(4, "Andriy"));

        MyUtils my = new MyUtils();

        my.commonStudents(l1, l2);
    }
}
