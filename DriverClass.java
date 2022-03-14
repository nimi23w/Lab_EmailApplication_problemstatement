package com.lab.serevice;

import java.util.Scanner;

public class DriveClass {

public static void main(Strin[] args){
Employee employee = new Employee("Nitesh","Nainwal");

CredentialService cs = new CredentialService();
String genereatedEmail;
char[] generatedPassword;

system.out.println("Please enter the department from the following");
system.out.println("1. Technical");
system.out.println("2. Admin");
system.out.println("3. Human Resource");
system.out.println("4. Legal");

Scanner sc = new Scanner(System.in);
int option = sc.nextInt();

if (option == 1){
generatedEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(),
	employee.getLastName().toLowerCase(), "tech");
generatedPassword = cs.generatePassword();
cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else if (option ==2){
generatedEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(),
	employee.getLastName().toLowerCase(), "adm");
generatedPassword = cs.generatePassword();
cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else if (option ==3){
generatedEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(),
	employee.getLastName().toLowerCase(), "hr");
generatedPassword = cs.generatePassword();
cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else if (option == 4){
generatedEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(),
	employee.getLastName().toLowerCase(), "lg");
generatedPassword = cs.generatePassword();
cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else
	System.out.println("Enter a valid option");
sc.close();
	}
}






