
class course {
    int cId;
    String cName;
    public course(String nm, int cId) {
        this.cId = cId;
        cName = nm;
    }
}
class student {
    String snm;
    int sid;
    //course[] co;
    course cos;

    //public student(String snm, int sid,course cos, course[] courses) {
    public student(String snm, int sid,course cos) {

        this.cos=cos;
       // this.co = courses;
        this.sid = sid;
        this.snm = snm;
    }
    public void getStudentDEt() {
        System.out.println("sid= " + sid);
        System.out.println("sname= " + snm);
        System.out.println();
        System.out.println("cos\t");
      //  for (course course : co) {
            System.out.println("course id 1"+cos.cId + "\t");
            System.out.println("course name1   "+cos.cName + "\t");
      //  }
    }
}
public class test {
    public static void main(String[] args) {
        course co = new course("aaa", 212);
        course co1 = new course("sss", 222);
        course[] manycoursearrays = {co, co1};
       // student student = new student("keerthi", 1,co, manycoursearrays);
        student student = new student("keerthi", 1,co);

        student.getStudentDEt();
    }

}
