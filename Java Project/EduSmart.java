package JavaProjectEduSmartLms;

public class EduSmart {
	public static void main(String[] args) {
        Student s1 = new Student("Swamy", "Swamy@yahoo.com", "S001");
        Student s2 = new Student("Naga", "Naga@gmail.com", "S002");

        Instructor i1 = new Instructor("Radha", "Radha@mail.com", "I001");
        Instructor i2 = new Instructor("Krishna", "Krishna@mail.com", "I002");

        Admin admin = new Admin("AdminOne", "admin@mail.com", "A001");

        i1.createCourse("Java Basics");
        i1.createCourse("Advanced Java");
        i2.createCourse("Python Basics");
        i2.createCourse("Data Science");

        s1.enrollCourse("Java Basics");
        s1.enrollCourse("Python Basics");
        s2.enrollCourse("Advanced Java");
        s2.enrollCourse("Data Science");

        s1.viewProfile();
        s2.viewProfile();
        i1.viewProfile();
        i2.viewProfile();
        admin.viewProfile();

        s1.trackProgress();
        s2.trackProgress();

        admin.removeUser(s1);

        Course c1 = new Course("Java Basics", 30, 50);
        Course c2 = new Course("Python Basics", 25, 40);
        c1.showCourseDetails();
        c2.showCourseDetails();
    }


}
