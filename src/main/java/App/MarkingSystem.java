 
package App;

import Models.Student;
import java.util.ArrayList;
import java.util.Scanner;

 
public class MarkingSystem {
    
    // a db or data source 
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("==Marksheet System==");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheet");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    // add a student
                    addStudent(scanner);
                    break;
                case 2:
                     displayMarksheet();
                     break;
                case 0:
                    // exit app
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);// exit the program 
                default:
                    System.out.println("Invalid choice. Please try again!");
            }
            
        }
        
    }

    private static void addStudent(Scanner scanner){
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        ArrayList<Integer> marks = new ArrayList<>();
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        for(int x=0; x<numSubjects; x++){
            System.out.print("Enter marks for subject "+(x+1)+":");
            marks.add(scanner.nextInt()); // adding marks for each subject
        }
        
        students.add(new Student(name, marks));
        System.out.println("Student added successfully.");
    }
    
    
    private static void displayMarksheet(){
        
        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        
        for(Student student:students){
            System.out.println(student);
        }
    }
}
