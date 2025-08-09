import java.util.ArrayList;


public class StudentList {
        private  String name ;
        private  String  address ;
        private ArrayList<String> courses;
        private ArrayList<Integer> grades;

        /*
         * Counstructor for the Student Class.
         * Vallidation of input data.
         */

         public StudentList(String name , String address){
            //Vallidation of input name.
            if(name == null || name.isBlank()){
                throw new IllegalArgumentException("Name must not be null or blank");
            }
            //Vallidation of input address.
            if(address == null || address.isBlank()){
                throw new IllegalArgumentException("Address must not be null or blank");
            }

            this.name = name ;
            this.address = address ;
            this.courses = new ArrayList<>();
            this.grades = new ArrayList<>() ;
         }

         public String getName() {
             return name;
         }

         public String getAddress() {
             return address;
         }

         public void setAddress(String address) {
            //Vallidation of input address.
            if(address == null || address.isBlank()){
                throw new IllegalArgumentException("Address must not be null or blank");
            }
             this.address = address;
         }

         @Override
         public String toString() {
         // TODO Auto-generated method stub
         return String.format("%s(%s)",name,address);
         }

         /*
          * Add a new course and grade
          *
          */

          public void addCourseGrade(String course, int grade){
            if(course == null || course.isBlank()){
                System.out.println("error : Course name cannto be blank");
                return;
            }

            if (grade < 0 || grade > 100) {
                System.out.println("error : Course grade must be between 0 and 100");
                return;
            }
            if(courses.size() >= 30){
                System.out.println("error : Cannot add more than 30 courses");
                return;
            }

            this.courses.add(course);
            this.grades.add(null);
          }

          public void printGrades(){
            System.out.println(this.name+" ");
            for(int i =0 ;i<courses.size() ;i++){
                System.out.print(courses.get(i)+" "+grades.get(i));
                if(i < courses.size() - 1){
                    System.out.print(", ");
                }
            }

            System.out.println();
          }

          public double getAverageGrade(){
            if(courses.isEmpty()) return 0.0 ;
            int sum = 0 ;
            //using foreach
            for (int _grade : grades) {
                sum += _grade; 
            }

            return (double)sum/courses.size();
          }

}