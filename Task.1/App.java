public class App {
    
    public static String filout(){

      int x = 0;
      Courses courses = new Courses();
      Instructor instructor = new Instructor();
      Student student = new Student();
      User user = new User();
      String[] userInfo = user.fristout();

      String username = userInfo[0];
      String password = userInfo[1];



    String[][] instructors = instructor.getins();
    for (String[] instructorInfo : instructors) {
        if (username.equals(instructorInfo[0]) && password.equals(instructorInfo[1])) {
            x+=1;
          System.out.println("Login successful ,List of Students:");

          String[][] students = student.getstu();
          for (String[] stud : students) {
              System.out.println(" - " + stud[0]);
          }
        }
    }



    String[][] students = student.getstu();
    for (String[] studentInfo : students) {
        if (username.equals(studentInfo[0]) && password.equals(studentInfo[1])) {
            x+=1;
           System.out.println("Login successful! ,List of Courses:");

           String[] courseList = courses.getCourses();
             for (String course : courseList) {
              System.out.println(" - "+course);
             }
        }
     }
      if(x==0){  System.out.println("Invalid username or password. Please try again.");}
        return null;
    }
}
