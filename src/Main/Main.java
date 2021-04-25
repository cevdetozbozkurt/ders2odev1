package Main;

public class Main {

    public static void main(String[] args) {
        Course cSharp = new Course(
                "C#",
                5,
                "Engin Demirog",
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        Course java = new Course(
                "Java",
                36,
                "Engin Demirog",
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");


        Course[] courses = {cSharp, java};

        for (Course course:courses) {
            System.out.println(course.courseName);
            System.out.println(course.courseComment);
            System.out.println("Tamamlanma oranı :"+ "%" + course.complatePercent);
            System.out.println(course.teacherName);
            System.out.println("-------------------------------------");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.takeTheCourse(cSharp);
        courseManager.takeTheCourse(java);


    }

}
