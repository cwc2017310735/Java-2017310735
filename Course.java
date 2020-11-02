package selection;

public class Course {
    public int courseId;
    public String courseName;
    public String coursePlace;
    public String courseTime;
    public Teacher teacher;

    public Course() {

    }

    public Course(int courseId,String courseName,String coursePlace,String courseTime,Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePlace = coursePlace;
        this.courseTime = courseTime;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "课程信息{" +
                "编号=" + courseId +
                ", 课程名称='" + courseName + '\'' +
                ", 上课地点='" + coursePlace + '\'' +
                ", 时间='" + courseTime + '\'' +
                ", 授课教师=" + teacher.name +
                '}';
    }
}
