package ru.mirea.task28;

public class AutoAnonClass {
    public void moving() {
        System.out.println("Ну поехали...");
    }

    public static void main(String[] args) {
        AutoAnonClass anonAutoStop = new AutoAnonClass() {
            @Override
            public void moving() {
                System.out.println("Ну приехали...");
            }
        };

        AutoAnonClass notAnonAutoStop = new AutoAnonClass().new AutoStop();

        anonAutoStop.moving();
        notAnonAutoStop.moving();
    }

    private class AutoStop extends AutoAnonClass {
        @Override
        public void moving() {
            System.out.println("Ну приехали...");
        }
    }
}

/*
public class Animal {
    public void meow() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Animal anonTiger = new Animal() {
            @Override
            public void meow() {
                System.out.println("Raaar!");
            }
        };

        Animal notAnonTiger = new Animal().new Tiger();

        anonTiger.meow(); // будет выведено Raaar!
        notAnonTiger.meow(); // будет выведено Raaar!
    }

    private class Tiger extends Animal {
        @Override
        public void meow() {
            System.out.println("Raaar!");
        }
    }
}
*/
