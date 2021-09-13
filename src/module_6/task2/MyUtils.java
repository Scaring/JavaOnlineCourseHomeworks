package module_6.task2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int experience;
    private BigDecimal basePayment;

    public Employee() {
    }

    public Employee(String name, int experience, BigDecimal basePayment) {
        this.name = name;
        this.experience = experience;
        this.basePayment = basePayment;
    }

    public String getName() {
        return this.name;
    }

    public int getExperience() {
        return this.experience;
    }

    public BigDecimal getPayment() {
        return this.basePayment;
    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, experience=%d, basePayment=%d]", name, experience, basePayment);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee))
            return false;
        Employee others = (Employee) obj;
        return name.equals(others.getName()) && experience == others.getExperience()
                && basePayment.equals(others.getPayment());
    }

    @Override
    public int hashCode() {
        return name.hashCode() + experience + basePayment.hashCode();
    }
}

class Manager extends Employee {
    private double coefficient;
    
    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    @Override
    public BigDecimal getPayment() {
        return super.getPayment().multiply(BigDecimal.valueOf(coefficient));
    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, experience=%d, basePayment=%d, coefficient=%d]", getName(),
                getExperience(), getPayment(), coefficient);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Manager))
            return false;
        Manager others = (Manager) obj;
        return this.getName().equals(others.getName()) && this.getExperience() == others.getExperience()
                && this.getPayment().equals(others.getPayment()) && coefficient == others.getCoefficient();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.getExperience() + this.getPayment().hashCode();
    }
}

public class MyUtils {
    public List<Employee> largestEmployees(List<Employee> workers) {
        List<Employee> resultEmployees = new ArrayList<>();

        int maxExperienceYears = 0;
        double maxPaymant = 0;

        for (Employee e : workers) {
            if (e == null)
                continue;

            if (maxExperienceYears < e.getExperience())
                maxExperienceYears = e.getExperience();

            if (maxPaymant < e.getPayment().doubleValue())
                maxPaymant = e.getPayment().doubleValue();
        }

        for (Employee e : workers) {
            if (resultEmployees.contains(e) || e == null)
                continue;
            if (e.getExperience() == maxExperienceYears || e.getPayment().doubleValue() == maxPaymant)
                resultEmployees.add(e);
        }

        return resultEmployees;
    }
}
