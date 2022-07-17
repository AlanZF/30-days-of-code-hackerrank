import java.util.*;

class Person {

	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
			"Name: " + lastName + ", " + firstName 
			+ "\nID: " + idNumber); 
	}
	 
}

class Student extends Person {

    private int[] testScores;

    // Constructor
    public Student(String firstName, String lastName, int id, int[] testScores) {
        
        // Calling subclass's constructor
        super(firstName, lastName, id);

        this.testScores = testScores;
    }
    
    public char calculate() {
        
        int soma = 0;
        char grade;
        for (int i = 0; i < testScores.length; i++) {
            soma = soma + testScores[i];
        }
        int media = soma/testScores.length;
        
        if (media < 40) {
            grade = 'T';
        } else if (media >= 40 && media < 55) {
            grade = 'D';
        } else if (media >= 55 && media < 70) {
            grade = 'P';
        } else if (media >= 70 && media < 80) {
            grade = 'A';
        } else if (media >= 80 && media < 90) {
            grade = 'E'; 
        } else {
            grade = 'O';
        }
        return grade;
    }
}

class Solution {

        public static void main(String[] args) {

	     Scanner scan = new Scanner(System.in);
	     String firstName = scan.next();
	     String lastName = scan.next();
             int id = scan.nextInt();
	     int numScores = scan.nextInt();
	     int[] testScores = new int[numScores];
	     for(int i = 0; i < numScores; i++){
		testScores[i] = scan.nextInt();
	     }
	     scan.close();
		
	     Student s = new Student(firstName, lastName, id, testScores);
	     s.printPerson();
	     System.out.println("Grade: " + s.calculate());
	}
}