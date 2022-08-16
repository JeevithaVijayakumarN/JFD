public class APP {
    public static void main(String[] args) {

        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee();

        employeeOne.setEmail("agsjhgty@gmail.com");
        employeeOne.setId("ONE");
        employeeOne.setName("Jeevitha");
        employeeOne.setPh(957657867);
        employeeOne.setRole("Developer");

        employeeTwo.setEmail("tyryuyru@gmail.com");
        employeeTwo.setId("TWO");
        employeeTwo.setName("Akshaya");
        employeeTwo.setPh(687687978);
        employeeTwo.setRole("Developer");

        employeeOne.showEmployeeDetails();
        employeeTwo.showEmployeeDetails();

        Employee employeeThree = new Employee ("Gayathri","Three","Developer"
        ,268799378,"hgjkutio@gmail.com");
        employeeThree.showEmployeeDetails();

        Employee employeeFour = new Employee("Karthi","Four","Developer");
        employeeFour.setPh(98787979);
        employeeFour.setEmail("ytiuyityui@gmail.com");
        employeeFour.showEmployeeDetails();
    }
}
