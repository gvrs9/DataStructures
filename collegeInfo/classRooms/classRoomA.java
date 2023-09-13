package collegeInfo.classRooms;

public class classRoomA {
    private int numberOfStudents;

    public classRoomA(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumOfStudentsPer_3_Rows() {
        return this.numberOfStudents / 3;
    }
}
