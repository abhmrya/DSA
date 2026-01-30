package oppsConceptsExercise.Constractor;

public class student_managment {

    private String name;
    private String regisNo;
    private short rollNO;
    private float marks;
    private String address;
    private long phoneNo;

    // ✅ Constructor
    public student_managment(String name, String regisNo, short rollNO,
                              float marks, String address, long phoneNo) {
        this.name = name;
        this.regisNo = regisNo;
        this.rollNO = rollNO;
        this.marks = marks;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // Getters
    public String getName() { return name; }
    public String getRegisNo() { return regisNo; }
    public short getRollNO() { return rollNO; }
    public float getMarks() { return marks; }
    public String getAddress() { return address; }
    public long getPhoneNo() { return phoneNo; }
}
