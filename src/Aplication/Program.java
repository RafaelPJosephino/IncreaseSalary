/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import Entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Name: ");
        e.name=s.next();
        System.out.print("Gross Salary: ");
        e.grossSalary=s.nextDouble();
        System.out.print("Tax: ");
        e.tax=s.nextDouble();
        
        System.out.print("Employee: ");
        System.out.println(e.toString());
        
        System.out.print("Which percentage to increase salary: ");
        e.increaseSalary(s.nextDouble());
        System.out.println("");
        System.out.print("Update data: ");
        System.out.println(e.toString());
        s.close();
        
        
        
        
        
    }
    
}
