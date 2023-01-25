import java.io.*;
import java.util.*;

public class Students{

	public static void main(String[] args){
		ArrayList<String> studentsList = new ArrayList<String>();
		try{
			File inputFile = new File("inputFile.txt");
			Scanner inputReader = new Scanner(inputFile);

			while(inputReader.hasNextLine()){
			String[] studentData = inputReader.nextLine().split(",");
			System.out.println(studentData);
				/*String[] studentName = inputReader.nextLine().split(",");
				String course = inputReader.nextLine();
				String[] grade = inputReader.nextLine().split(" ");*/
			studentsList.add(studentData);
			}
			inputReader.close();
			System.out.println(studentsList);

			Collections.sort(studentsList);
			for(int i = studentsList.size(); i >= 0; i++){
				System.out.println(studentsList.get(i) + " ");
				System.out.println(studentsList.toString());
			}

		}catch(FileNotFoundException e){
			System.out.println("There is an error of input file");
		}
		
		
	}

	public static void readStudents(){
				

	}
}



class AllStudent{

	private String firstName;
	private String lastName;
	private String course;

	public String getFirstName() {
			    return firstName;
			}

	public String getLastName() {
			    return lastName;
			}

	public String getCourse() {
			    return course;
			}

	//constructor of AllStudent
	/*public AllStudent(String firstName, String lastName, String course){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}*/
 

}


class EnglishStudent extends Students{

	private double termPaper;
	private double midTerm;
	private double finalExam;

	public double getTermPaper() {
	    return termPaper;
	}

	public double getMidTerm() {
	    return midTerm;
	}

	public double getFinalExam() {
	    return finalExam;
	}

	//constructor of EnglishStudent
	/*public EnglishStudent(String firstName, String lastName, double termPaper, double midTerm, double finalExam){
		super(String firstName String lastName);
		this.termPaper = termPaper;
		this.midTerm = midTerm;
		this.finalExam = finalExam;
	}*/
}


class ScienceStudent extends Students{
	private double attendance;
	private double project;
	private double midTerm;
	private double finalExam;

	public double getAttendance() {
	    return attendance;
	}

	public double getProject() {
	    return project;
	}

	public double getMidTerm() {
	    return midTerm;
	}

	public double getFinalExam() {
	    return finalExam;
	}
}


class MathStudent extends Students{
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double quiz4;
	private double quiz5;
	private double test1;
	private double test2;
	private double finalExam;

	public double getQuiz1() {
	    return quiz1;
	}

	public double getQuiz2() {
	    return quiz2;
	}

	public double getQuiz3() {
	    return quiz3;
	}

	public double getQuiz4() {
	    return quiz4;
	}

	public double getQuiz5() {
	    return quiz5;
	}

	public double getTest1() {
	    return test1;
	}

	public double getTest2() {
	    return test2;
	}

	public double getFinalExam() {
	    return finalExam;
	}
}
