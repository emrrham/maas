public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        double tax = employee.tax();
        double bonus = employee.bonus();
        double raiseSalary = employee.raiseSalary();
        double totalSalary = employee.salary + raiseSalary - tax + bonus;
        System.out.println("Adı : " + employee.name);
        System.out.println("Maaşı : " + employee.salary);
        System.out.println("Çalışma Saati : " + employee.workHours);
        System.out.println("Başlangıç Yılı : " + employee.hireYear);
        System.out.println("Vergi : " + tax);
        System.out.println("Bonus : " + bonus);
        System.out.println("Maaş Artışı : " + raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + totalSalary);
        System.out.println("Toplam Maaş : " + (totalSalary + employee.salary));
    }
}
