package module_6.task1;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Person [name=%s]", name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person others = (Person) obj;
        return name.equals(others.getName());
    }
}

class Student extends Person {
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return this.studyPlace;
    }

    public int getStudyYears() {
        return this.studyYears;
    }

    public String toString() {
        return String.format("Student [name=%s, studyPlace=%s, studyYears=%d]", this.getName(), studyPlace, studyYears);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            return false;
        Student others = (Student) obj;
        return this.getName().equals(others.getName()) && studyPlace.equals(others.getStudyPlace())
                && studyYears == others.getStudyYears();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + studyPlace.hashCode() + studyYears;
    }
}

class Worker extends Person {
    private String workPosition;
    private int experienceYears;

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition() {
        return this.workPosition;
    }

    public int getExperienceYears() {
        return this.experienceYears;
    }

    public String toString() {
        return String.format("Worker [name=%s, workPlace=%s, experienceYears=%d]", this.getName(), workPosition,
                experienceYears);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Worker))
            return false;
        Worker others = (Worker) obj;
        return this.getName().equals(others.getName()) && workPosition.equals(others.getWorkPosition())
                && experienceYears == others.getExperienceYears();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + workPosition.hashCode() + experienceYears;
    }
}

public class MyUtils {
    public static void main(String[] args) {
        List<Person> l1 = new ArrayList<Person>();
        l1.add(new Person("Ivan"));
        l1.add(new Student("Petro", "University", 3));
        l1.add(new Worker("Andriy", "Developer", 12));
        l1.add(new Worker("Andriy", "Developer", 12));
        l1.add(new Student("Stepan", "Collage", 4));
        l1.add(new Worker("Ira", "Manager", 8));
        l1.add(new Student("Ihor", "University", 4));

        MyUtils m1 = new MyUtils();
        System.out.println(m1.maxDuration(l1));
    }

    public List<Person> maxDuration(List<Person> persons) {
        List<Person> resultList = new ArrayList<>();

        int maxStudyYears = 0;
        int maxExperienceYears = 0;

        for (Person p : persons) {
            if (p instanceof Student) {
                int curStudentStudyYears = ((Student) p).getStudyYears();
                if (maxStudyYears < curStudentStudyYears)
                    maxStudyYears = curStudentStudyYears;
            }

            if (p instanceof Worker) {
                int curWorkerExperienceYears = ((Worker) p).getExperienceYears();
                if (maxExperienceYears < curWorkerExperienceYears)
                    maxExperienceYears = curWorkerExperienceYears;
            }
        }

        for (Person p : persons) {
            if (p instanceof Student && !resultList.contains(p) 
                    && ((Student) p).getStudyYears() == maxStudyYears) {
                resultList.add(p);
            }

            if (p instanceof Worker && !resultList.contains(p)
                    && ((Worker) p).getExperienceYears() == maxExperienceYears) {
                resultList.add(p);
            }
        }

        return resultList;
    }
}