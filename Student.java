package selection;

import java.util.ArrayList;

public class Student extends Person{

    public Course course;

    public Student(){

    }
    public Student(int id,String name,boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void chooseCourse(Course course){
        this.course = course;
        System.out.println(this.course);
    }

    public void cancelCourse(Course course){
        this.course = course;
        System.out.println(this.course);
    }

}
