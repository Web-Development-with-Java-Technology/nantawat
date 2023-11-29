public class Programer extends Employee {
    private double bonus;

    public Programer(){
        super.setEmpid("4008");
        super.setEmpName("Meetung Maika");
        super.setSize(50000);
        this.bonus = 6000;
    }

    public void setBonus (double bonus){
        this.bonus = bonus;
    }

    public double getBonus (){
        return this.bonus;
    }

    public double computerSalary(){
        return this.bonus + super.getSalary();
    }

    public void displayDetail(){
        System.out.println("===== Programer =====");
        System.out.println(">>Employee ID : " + super.getEmpid());
        System.out.println(">>Employee Name : " + super.getEmpName());
        System.out.println(">>Base Salary : " + super.getSalary());
        System.out.println(". . . . . . . . . . . .");
        System.out.println("Bonus 2023 : " + this.bonus);
        System.out.println("Total Salary : " + this.computerSalary());
    }
}
