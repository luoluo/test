/**
 * Created with IntelliJ IDEA. User: lo Date: 8/27/13 Time: 1:33 PM To change this template use File
 * | Settings | File Templates.
 */
class Employee {
    String lastName = null;
    String firstName = null;
    double ID;

    public Employee(String lastName, String firstName, double ID){
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = ID;
    }

    public String empStat(){
        return "Last Name: " + lastName + "First Name: " + firstName + "ID" + ID;
    }

    public String toString() {
        return lastName + " " + firstName + " " + Double.toString(ID);
    }

}
public class MainEmployee {
    public static void main(String args[]){

        Employee nub1 = new Employee ("Griffin", "Peter", 000001);
        System.out.println(nub1);
        Employee nub2 = new Employee ("Griffin", "Lois", 000002);
        System.out.println(nub2);
        Employee nub3 = new Employee ("Griffin", "Stewie", 000003);
        System.out.println(nub3);
        Employee nub4 = new Employee ("Griffin", "Brian", 000004);
        System.out.println(nub4);
    }
}
