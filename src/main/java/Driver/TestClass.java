package Driver;

import mickeyMouseUniversity.Course;
import mickeyMouseUniversity.Student;
import mickeyMouseUniversity.Module;
import org.joda.time.*;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        Course ece = new Course("electronic and computer engineering");
        Course eee = new Course("electronic and electrical engineering");
        Course cs = new Course("computer science");

        Module ee451 = new Module("System on Chip I", ece);
        ee451.addCourse(eee);
        Module ee452 = new Module("System on Chip II", ece);
        ee452.addCourse(eee);
        Module ct417 = new Module("Software Engineering III", cs);
        ct417.addCourse(ece);
        Module ct230 = new Module("Database Systems I", cs);
        ct230.addCourse(ece);


        Student s1 = new Student("Mary Duffy", new org.joda.time.LocalDate(2001, 3, 9),ece);
        Student s2 = new Student("John Cunniffe", new org.joda.time.LocalDate(1967, 10, 14),ece);
        Student s3 = new Student("Sean Towey", new org.joda.time.LocalDate(1968, 6, 15),ece);
        Student s4 = new Student("Theresa Regan", new org.joda.time.LocalDate(1994, 4,30),eee);
        Student s5 = new Student("Daniel McHugh", new org.joda.time.LocalDate(2000, 8,22),eee);
        Student s6 = new Student("James Dolan", new org.joda.time.LocalDate(2000, 6,4),eee);
        Student s7 = new Student("Martin Ryan", new org.joda.time.LocalDate(1999, 3,3),cs);
        Student s8 = new Student("Theresa Regan", new org.joda.time.LocalDate(2000, 4,30),cs);


        //s1.addModule(ee451);
        //s1.addModule(ct417);
        //s1.addModule(ee451);
        //s1.addModule(ee452);
//
        //s2.addModule(ct230);
        //s2.addModule(ct417);
        //s2.addModule(ee451);
        //s2.addModule(ee452);
//
        //s3.addModule(ct230);
        //s3.addModule(ct417);
        //s3.addModule(ee451);
        //s3.addModule(ee452);
//
        //s4.addModule(ee451);
        //s4.addModule(ee452);
//
        //s5.addModule(ee451);
        //s5.addModule(ee452);
//
        //s6.addModule(ee451);
        //s6.addModule(ee452);
//
        //s7.addModule(ct230);
        //s7.addModule(ct417);
        //
        //s8.addModule(ct230);
        //s8.addModule(ct417);
//



        ee451.addStudent(s1);
        ee451.addStudent(s2);
        ee451.addStudent(s3);
        ee451.addStudent(s4);
        ee451.addStudent(s5);
        ee451.addStudent(s6);

        ee452.addStudent(s1);
        ee452.addStudent(s2);
        ee452.addStudent(s3);
        ee452.addStudent(s4);
        ee452.addStudent(s5);
        ee452.addStudent(s6);

        ct230.addStudent(s1);
        ct230.addStudent(s2);
        ct230.addStudent(s3);
        ct230.addStudent(s7);
        ct230.addStudent(s8);

        ct417.addStudent(s1);//poop
        ct417.addStudent(s2);//poop
        ct417.addStudent(s3);
        ct417.addStudent(s7);
        ct417.addStudent(s8);


        ece.addModule(ee451);
        ece.addModule(ee452);
        ece.addModule(ct417);
        ece.addModule(ct230);
        ece.addStudent(s1);
        ece.addStudent(s2);
        ece.addStudent(s3);


        eee.addModule(ee451);
        eee.addModule(ee452);
        eee.addStudent(s4);
        eee.addStudent(s5);
        eee.addStudent(s6);

        cs.addModule(ct417);
        cs.addModule(ct230);
        cs.addStudent(s7);
        cs.addStudent(s8);

        s1.setModules(ece.getModules());
        s2.setModules(ece.getModules());
        s3.setModules(ece.getModules());
        s4.setModules(eee.getModules());
        s5.setModules(eee.getModules());
        s6.setModules(eee.getModules());
        s7.setModules(cs.getModules());
        s8.setModules(cs.getModules());




        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(eee);
        courses.add(ece);
        courses.add(cs);



        for (int i = 0; i < courses.size();i++) {
            Course currentCourse = courses.get(i);
            System.out.println(currentCourse.ListModulesandStudents());
        }
        /*
        for (int i = 0; i < courses.size();i++){
            Course currentCourse = courses.get(i);
            ArrayList<Module> modules = currentCourse.getModules();
            System.out.println(modules);
            for (int j = 0; j < modules.size();i++){
                Course currentModule = courses.get(i);
                ArrayList<Student> students = currentCourse.getModules();
                System.out.println(students);


            }

        }
         */
    }


}
