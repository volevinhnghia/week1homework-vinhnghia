public class Main {
    public static void main(String[] args) {
        UniversityStudent newUniStudent = new UniversityStudent("Nguyen van A", "100001", "Univesity Of Science");
        Student newColStudent = new CollegeStudent("Nguyen Van B", "100004", "Some College name");
        newUniStudent.typeOfStudent();
        System.out.println(newUniStudent.getName());
        System.out.println(newUniStudent.getStudentID());
        System.out.println(newUniStudent.getSchoolName());
        newColStudent.typeOfStudent();
        System.out.println(newColStudent.getName());
        System.out.println(newColStudent.getStudentID());

    }
}