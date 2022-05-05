public class Balance {
    private int leftSide;
    private int rightSide;

    public Balance(int leftSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }
    public Balance() {};


    public void addRight(int n) {
        rightSide += n;
    }

    public void addLeft(int n) {
        leftSide += n;
    }

    public char getSituation() {
        char situation;
        if (leftSide > rightSide) {
            situation = 'L';
        } else if (leftSide < rightSide) {
            situation = 'R';
        } else situation = '=';
        return situation;
    }
}
