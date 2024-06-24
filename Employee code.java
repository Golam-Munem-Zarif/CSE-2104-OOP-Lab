package com.mycompany.employees;

public class Employee {

 
    static String companyName = "IT Farm";
    static String companyAddress = "Dhanmondi 27";
    static int totalEmployees = 0;

   
    String name;
    int age;
    String post;
    double salary;

   
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        totalEmployees++; 
    }

    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("post: " + post);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
       
        Employee e1 = new Employee("Abdul Kalam", 35, "Web Developer", 75000);
        Employee e2 = new Employee("G.M.Zarif", 26, "Security Analyst", 85000);
        Employee e3 = new Employee("MD.Saidur Rahman", 37, "Graphic Designer", 67000);

       
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
        System.out.println();

        // Displaying the total number of employees
        Employee.displayTotalEmployees();
    }
}
