package selection;

public class Test {
    public static void main(String[] args) {
        Student st = new Student(01,"张三",true);
        Teacher teacher = new Teacher(01,"张老师",true);
        Course course = new Course(01, "Java", "教201", "...", teacher);
        teacher.course = course;

        st.chooseCourse(course);
        st.cancelCourse(course);
    }
}
