package module_10.task5;

import java.util.Comparator;
import java.util.Arrays;

class PersonComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        int result = a.getName().compareTo(b.getName());

        if (result == 0)
            result = a.getAge() - b.getAge();

        return result;
    }
}

class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        PersonComparator pc = new PersonComparator();

        int result = pc.compare(a, b);

        if (result == 0)
            result = (int) (a.getSalary() - b.getSalary());

        return result;
    }
}

class DeveloperComparator implements Comparator<Developer> {
    public int compare(Developer a, Developer b) {
        EmployeeComparator ec = new EmployeeComparator();

        int result = ec.compare(a, b);

        if (result == 0)
            result = a.getLevel().compareTo(b.getLevel());

        return result;
    }
}

class Utility {
    public static <T extends Person> void sortPeople(T[] people, Comparator<? super T> comparator) {
        Arrays.sort(people, comparator);
    }

    public static void main(String[] args) {
        // Person[] arr = { new Person("Nick", 27), new Person("Sara", 24), new
        // Person("Bart", 38), new Person("Nick", 21),
        // new Person("Sara", 24), new Person("Bart", 38) };

        // sortPeople(arr, new PersonComparator());

        // for (Person person : arr) {
        // System.out.println(person.toString());
        // }

        Employee[] arr = { new Employee("Nick", 27, 2850.55), new Employee("Sara", 24, 2950.35),
                new Employee("Bart", 38, 3165.75), new Employee("Nick", 21, 1940.25), new Employee("Sara", 24, 2260.65),
                new Employee("Bart", 38, 3165.75) };

        sortPeople(arr, new EmployeeComparator());

        for (Person person : arr) {
            System.out.println(person.toString());
        }
    }
}

/* Not sorted array */
// Name: Nick, Age: 27, Salary: 2850.55
// Name: Sara, Age: 24, Salary: 2950.35
// Name: Bart, Age: 38, Salary: 3165.75
// Name: Nick, Age: 21, Salary: 1940.25
// Name: Sara, Age: 24, Salary: 2260.65
// Name: Bart, Age: 38, Salary: 3165.75
/* Sorted by ascending */
// Name: Bart, Age: 38, Salary: 3165.75
// Name: Bart, Age: 38, Salary: 3165.75
// Name: Nick, Age: 21, Salary: 1940.25
// Name: Nick, Age: 27, Salary: 2850.55
// Name: Sara, Age: 24, Salary: 2260.65
// Name: Sara, Age: 24, Salary: 2950.35

// class EmployeeComparator implements Comparator<Employee> {
// public int compare(Employee a, Employee b) {
// int result = a.getName().compareTo(b.getName());

// if (result == 0)
// result = a.getAge() - b.getAge();

// if (result == 0)
// result = (int) (a.getSalary() - b.getSalary());

// return result;
// }
// }