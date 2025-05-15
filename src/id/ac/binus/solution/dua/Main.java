package id.ac.binus.solution.dua;

public class Main {
	public static void main(String[] args) {
		CourseData data = new CourseData();
		data.setCourseId("LE01");
		data.setCourseName("Agile");
		data.setCourseCredit("2");

		System.out.println(data.getCourseId());
		System.out.println(data.getCourseName());
		System.out.println(data.getCourseCredit());
	}
}
