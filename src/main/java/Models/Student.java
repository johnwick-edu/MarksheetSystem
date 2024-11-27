package Models;


import java.util.ArrayList;

 
public class Student {
    
    
    private String name;                    // Name of student
    private ArrayList<Integer> marks;       // Marks of student

    public Student(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }
    
    
    // A method to get total marks of the student
    public int getTotalMarks(){
        int total = 0;
        for(int mark :marks){
            total+=mark;
        }
        return total;
    }
    
    // Get the average mark of the student
    public double getAverageMark(){
        return (double) getTotalMarks() / marks.size();  
    }

    @Override
    public String toString() {
        return "Name : "+name+", Marks: "+marks +", Total: "+getTotalMarks()+" Average: "+getAverageMark();
    }
    
    
}
