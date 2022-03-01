package employeeapp;

import javax.swing.JOptionPane;

public class EmployeeAppTest {

    public static void main(String[] args) {

        EmployeeApp employee1 = new EmployeeApp(JOptionPane.showInputDialog("Enter first name for employee1:"),
                JOptionPane.showInputDialog("Enter last name for employee1:"),
                Double.parseDouble(JOptionPane.showInputDialog("Enter monthly salary for employee1:")));

        EmployeeApp employee2 = new EmployeeApp(JOptionPane.showInputDialog("Enter first name for employee2:"),
                JOptionPane.showInputDialog("Enter last name for employee2:"),
                Double.parseDouble(JOptionPane.showInputDialog("Enter monthly salary for employee2:")));

        JOptionPane.showMessageDialog(null, String.format("The yearly salary of %s, %s is: $%.2f", employee1.getLastName(), employee1.getFirstName(), employee1.getYearlySalary()));
        JOptionPane.showMessageDialog(null, String.format("The yearly salary of %s, %s is: $%.2f", employee2.getLastName(), employee2.getFirstName(), employee2.getYearlySalary()));

        JOptionPane.showMessageDialog(null, String.format("The yearly salary of %s, %s with 10 percent raise is: $%.2f", employee1.getLastName(), employee1.getFirstName(), employee1.getYearlySalary() + employee1.getYearlySalary() * 0.1));
        JOptionPane.showMessageDialog(null, String.format("The yearly salary of %s, %s with 10 percent raise is: $%.2f", employee2.getLastName(), employee2.getFirstName(), employee2.getYearlySalary() + employee2.getYearlySalary() * 0.1));
    }
}
