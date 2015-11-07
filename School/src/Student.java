public class Student {
 
                private String name;
                private String lastName;
                private int age;
                private boolean gender=false;
                private int iq;
               
                public Student(String name,String lastname,int age,boolean gender,int iq) {
                               this.name=name;
                               this.lastName=lastName;
                               this.age=age;
                               this.gender=gender;
                               this.iq=iq;
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
               
                public int getIQ() {
                               return iq;
                }
               
                public void setIQ(int iq) {
                               this.iq=iq;
                }
               
                public void setAge(int age) throws Exception {
                               if(this.age<age) {
                                               this.age=age;
                               } else {
                                               throw new Exception("Invalid age");
                               }
                }
               
}