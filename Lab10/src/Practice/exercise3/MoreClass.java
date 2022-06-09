package Practice.exercise3;

public class MoreClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println("1: "+ obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "This is obj2";
            }

        };
        System.out.println("2: " + obj2);
    }
}
