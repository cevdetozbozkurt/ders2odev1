package Main;

public class Course {

    //Ders-Kamp içeriği(özellikleri)

    String courseName;
    String courseComment;
    String teacherName;
    int complatePercent;

    public Course(){

    }
    public Course(String courseName, int complatePercent, String teacherName,String courseComment){
        this.courseName = courseName;
        this.complatePercent = complatePercent;
        this.teacherName = teacherName;
        this.courseComment = courseComment;
    }
}
