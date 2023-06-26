public class CollegeStudent extends Student {
    private String schoolName;
    public CollegeStudent(String name, String studentID, String schoolName){
        super(name, studentID);
        this.schoolName = schoolName;
    }
    public void typeOfStudent() {
        System.out.println("College Student");
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
}
