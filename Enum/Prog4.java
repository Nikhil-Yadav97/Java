public class Prog4 {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;

        d.move();

        // array of Direction object
        Direction[] directions =  Direction.values();

        for(Direction dir : directions) {
            System.out.println(dir.name());
        }

        // convert string to enum Direction.EAST
        Direction dir = Direction.valueOf("EAST");
        System.out.println(dir);


        // gives value to each obj NORTH 0  SOUTH 1 EAST 2 WEST 3 
        System.out.println(dir.ordinal());
    }
}

enum Direction {
    // overriding fn directly at the time of declaration
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (Y + 1)");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Move down (Y - 1)");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Move right (X + 1)");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Move left (X - 1)");
        }
    };

    public abstract void move();
}