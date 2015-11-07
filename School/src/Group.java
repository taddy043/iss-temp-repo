public class Group {
 
                private Student[] students;
                private Teacher teacher;
               
                public Group(Student[] students,Teacher teacher) {
                               this.students=students;
                               this.teacher=teacher;
                }
               
                public Student getStudentByName(String name) throws Exception {
                               for(int i=0;i<students.length;i++) {
                                               if(students[i].getName()==name) {
                                                               return students[i];
                                               }
                               }
                               throw new Exception("Student not found");
                }
               
                public int getIndexOfStudent(String name) throws Exception {
                               for(int i=0;i<students.length;i++) {
                                               if(students[i].getName()==name) {
                                                               return i;
                                               }
                               }
                               throw new Exception("Student not found");
                }
               
                public Student getStudentByIndex(int index) {
                               return students[index];
                }
               
                public void setStudents(Student[] students) {
                               this.students=students;
                }
               
                public void addStudent(Student student) {
                               Student[] newStudents=new Student[students.length+1];
                               newStudents=students;
                               newStudents[students.length]=student;
                               students=newStudents;
                }
               
                public void deleteStudent(Student student) throws Exception {
                               int index=getIndexOfStudent(student.getName());
                               Student[] newStudents=new Student[students.length-1];
                               for(int i=0;i<index;i++) {
                                               newStudents[i]=students[i];
                               }
                               for(int i=index+1;i<students.length;i++) {
                                               newStudents[i]=students[i];
                               }
                               students=newStudents;
                }
               
}