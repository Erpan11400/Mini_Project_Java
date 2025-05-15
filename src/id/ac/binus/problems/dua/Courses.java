package id.ac.binus.problems.dua;

/*
 * 
 * Smell code			: Dead Code
 * potential cause(s)	: terdapat variable yang tidak terpakai dalam logika program
 * solution(s)			: Remove Variable
 * 
 * Smell code			: Middle Man
 * potential cause(s)	: Class Courses hanya menjadi class yang perantara menuju CourseData
 * solution(s)			: Remove Middle Man
 * 
 * Smell code			: Temporary Field
 * potential cause(s)	: menggunakan string sebagai jenis variable untuk menyimpan data sementara
 * solution(s)			: Create Object
 * 
 * Smell code			: Inappropriate Intimacy
 * potential cause(s)	: class menggunakan data dari class lain
 * solution(s)			: Move Method
 * 
 */

public class Courses {
	private String courseId;
	private String courseName;
	private String courseCredit;
	
	private CourseData couserData;
	public String getCourseId() {
		return couserData.courseId;
	}
	public void setCourseId(String courseId) {
		this.couserData.courseId = courseId;
	}
	public String getCourseName() {
		return couserData.courseName;
	}
	public void setCourseName(String courseName) {
		this.couserData.courseName = courseName;
	}
	public String getCourseCredit() {
		return couserData.courseCredit;
	}
	public void setCourseCredit(String courseCredit) {
		this.couserData.courseCredit = courseCredit;
	}
}
