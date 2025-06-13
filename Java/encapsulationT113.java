public class encapsulationT113 {
//    void test(){
//        employee.company="Amamzon";
//        employee.empId = "testingEmp";
//        System.out.println(employee.company + " " + employee.empId);
//    }
    public static void main(String[] args){
        HR h1 = new HR();
        employee emp = new employee();
        System.out.println(emp.empId);
        //System.out.println(empId);

        encapsulationT113 a1 = new encapsulationT113();
//        a1.test();

        System.out.println(h1.empId + h1.company);
//        System.out.println(employee.company + " " + employee.empId);
    }
}

class employee{
    private int salary = 100000;
    protected String empId = "blabla123";
    public String company = "Extrablabla";
    employee(){}
}

class HR extends employee{

    HR(){
        //super();
//        super.salary = 20000;
        //super.empId = "blabla20";
        //super.company = "blablablaBig";
        System.out.println(empId);
        System.out.println(company);

    }



}
