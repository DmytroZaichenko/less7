package generics.domain;

import java.util.List;

public class Demo {

    public static void main(String[] args) {


        Box<Bird> products = new Box<>();

        Box<Bird> birds = new Box<>();
        birds.add(new Duck());
        birds.add(new Eagle());

        for (Bird b: birds.getLists()) {
            System.out.println(b.toString());
        }



    }

}
