package LecW2;

public class Staff extends Person{

    private int rank;
    private String staffNumber;

    public Staff(String name, int rank, String staffNumber) {
        super(name);
        this.rank = rank;
        this.staffNumber = staffNumber;
    }

    public Staff(String name, String address, int rank, String staffNumber) {
        super(name, address);
        this.rank = rank;
        this.staffNumber = staffNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }
}
