import java.util.Scanner;
class student_management {
	student[] students;
    int studentCount;
    Scanner sc=new Scanner(System.in);
    public void initializeSystem(int size){
        students = new student[size];
        studentCount=0;
    }
    public void addStudent(){
        if(studentCount>=students.length){
            System.out.println("can not add more students array is full");
            return ;
        }
        student s=new student();
        s.inputStudent(sc);
        students[studentCount]=s;
        studentCount++;
        System.out.println("student added succesfully\n");
    }
    public void displayallstudents(){
        if(studentCount==0){
            System.out.println("======student records=======");
            for(int i=0;i<studentCount;i++){
                students[i].displayStudent();
            }
        }
    } 
}