/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package april123

Import java.util.ArrayList;
public class IfElse Logic{
 public static void printStudentDate(Student[] studentDate){   
 System.out.println("Student Data:");
 for(int i=0;i< studentData.Length; i++){
  System.out.println("name:"+ studentData[i]. getName() +" Semester: " + studentData[i] . getsemester());
 }
 }
public static student[] get8thSemesterstudents(student[] studentData){
    
ArrayList newStudentData= new ArrayList();
for (int i=0;i < studentData.lenght; i++){
 Student Student=StudentData[i];  
 if (Student.getSemester().equalsIgnoreCase ("8th")){
  newStudentData.add(student); 
 }
 }
return (student[]) newStudentData.toArray(newstudentdata.size()]);

}
public static void main(String[] arg){
    
Student student1=new Student("Nitu","8th");
Student student2=new student("java","6th");
Student student3=new student("Amir","5th");
Student student4=new student("Rohan","8th");
Student student5=new student("Banti","7th");
Student[] studentData={student1,student2,student3,student4,student5};
printStudentData(studentData);
Student [] semester8thStudentData=get8thSemesterStudent(studentData);
printStudentData(semester8thStudentData);
System.out.println("Count" of 8th semester student:"semester8thStudentData.length);
}
}
     
    

  
    
    
