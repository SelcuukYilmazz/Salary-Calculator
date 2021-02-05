//package Assignment22;

public class WorkingHours extends Calculator{
    private String reginumber;
    private int first;
    private int second;
    private int third;
    private int fourth;

    public String getReginumber() {
        return reginumber;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public int getFourth() {
        return fourth;
    }

    public WorkingHours(String reginumber, int first, int second, int third, int fourth) {
        this.reginumber = reginumber;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
}
