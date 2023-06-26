public class UniversityStudent extends Student {
    private String schoolName;
    public UniversityStudent(String name, String studentID, String schoolName){
        super(name, studentID);
        this.schoolName = schoolName;
    }
    public void typeOfStudent() {
        System.out.println("University Student");
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
}
