package victor.refactoring.fifteen;

public class Interval {
    private final int start;
    private final int end;

    public Interval(int start, int end) {
        if (start > end) throw new IllegalArgumentException("start larger than end");
        this.start = start;
        this.end = end;
    }

    public boolean intersects(Interval other) {
        return start <= other.start && other.end <= end;
    }
}
