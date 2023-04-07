import java.time.LocalDate;

public class Employee {
     String name;
     double salary;
     int workHours;
     int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = LocalDate.now().getYear() - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        double raiseAmount = salary * raisePercentage;
        salary += raiseAmount;

        return raiseAmount;
    }

    public double totalSalary() {
        return salary + bonus() - tax();
    }

    public String toString() {
        return "Adı : " + name
                + "\nMaaşı : " + salary
                + "\nÇalışma Saati : " + workHours
                + "\nBaşlangıç Yılı : " + hireYear
                + "\nVergi : " + tax()
                + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maaş : " + totalSalary()
                + "\nToplam Maaş : " + (salary + raiseSalary());
    }
}
