
public class Teacher {
 
                private String name;
                private String lastName;
                private int age;
                private boolean gender=false;
                private int qualification;
               
                public Teacher(String name,String lastName,int age,boolean gender,int qualification) {
                               this.name=name;
                               this.lastName=lastName;
                               this.age=age;
                               this.gender=gender;
                               this.qualification=qualification;
                }
               
                public String getName() {
                               return name;
                }
               
                public String getLastName() {
                               return lastName;
                }
               
                public int getAge() {
                               return age;
                }
               
                public boolean getGender() {
                               return gender;
                }
               
                public int getQualification() {
                               return qualification;
                }
               
                public void setQualification(int qualification) {
                               this.qualification=qualification;
                }
               
                public void setAge(int age) throws Exception {
                               if(this.age<age) {
                                               this.age=age;
                               } else {
                                               throw new Exception("Invalid age");
                               }
                }
               
}