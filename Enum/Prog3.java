// saves key with enum 
public class Prog3 {
    public static void main(String[] args) {
        Direction d = Direction.SOUTH;

        System.out.println(d.getDegree());
    }
}

enum Direction {
    NORTH(0),
    // internally this happens
    // public static final Directoin NORTH=new Direction(0);
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public int getDegree() {
        return this.degree;
    }
}