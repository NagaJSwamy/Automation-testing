package JavaProjectEduSmartLms;

public class Course {
	private String title;
    private int durationInHours;
    private final int maxStudents;

    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

    public Course(String title) {
        this(title, 0, 0);
    }

    public void showCourseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + durationInHours + " hours");
        System.out.println("Max Students: " + maxStudents);
    }


}
