class Prog1 {
    public static void main(String[] args) {
        Box b1 = new Box(7);
        Box b2 = new Box("Nikhil");
        Box b3 = new Box(true);

        // Downcasting
        Integer x = (Integer) b1.getValue();
        String s = (String) b2.getValue();
        Boolean b = (Boolean) b3.getValue();

        System.out.println(x + 5);
        System.out.println(s + 5);
        System.out.println(b);

        // gives error because return obj not match string datatype
        String s1 = (String) b1.getValue();
        System.out.println(s1);
    }
}

class Box {
    private Object value;

    Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}