public class Manager extends Employee {
    int teamSize;

    Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (this.teamSize * 1000);
    }

}
