public class SeniorManager extends Manager {
    int projectCount;

    SeniorManager(String name, double baseSalary, int teamSize,int projectCount) {
        super(name, baseSalary, teamSize);
        this.projectCount = projectCount;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (this.projectCount * 5000);
    }
}
