public class LimitingRectangle {
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int min(int ind) {
        int min = 10000;
        for (int[] point : points) {
            if (point[ind] <= min) min = point[ind];
        }
        return min;
    }

    public int max(int ind) {
        int max = 0;
        for (int[] point : points) {
            if (point[ind] >= max) max = point[ind];
        }
        return max;
    }

    int getWidth() {
        return this.max(1) - this.min(1);
    }

    int getHeight() {
        return this.max(1) - this.min(1);
    }

    String getBorders() {
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }

}
