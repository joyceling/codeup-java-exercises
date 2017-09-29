package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(Double grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;

        for (int i = 0; i < grades.size(); i++) {
            total = grades.get(i) + total;
        }

        double average = total/grades.size();
        return average;
    }


}
