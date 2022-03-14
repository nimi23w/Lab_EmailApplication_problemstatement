package com.Lab1.service;

imp java.util.Random;

public class CredentialService{
	public char[] generatePassword() {
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-?<>)";

	String values = capitlLetters + smallLetter + number +specialCharacters;

	Ramdom random = new Random();

	char[] password = new char[8];

	for(int i - 0; i<8; i++){
		password[i] = calues.charAt(randome.nextInt(values.length()));
	}
	return password;
}
public String generateEmail.Adress(String firstName, String lastName, String department)
{
	retun firstName+lastName+"@"+department+".abc.com";
}
public void showCredentials(Employee employee,String email, char[] generatedPassword){
	system.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
	system.out.println("Email --> "+email);
	system.out.println("Password --> 1"
		+ "");
	system.out.print(generatedPassword);
}
}