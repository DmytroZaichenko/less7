package generics.domain;

public class Demo {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setItem(34);
        System.out.println(box.getItem());
    }

}
