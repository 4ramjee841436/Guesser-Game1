package practice_program.java;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Domestic extends Animal {
    void grass() {
        System.out.println("Domestic animal eats grass");
    }
}

class Wild extends Animal {
    void meat() {
        System.out.println("Wild animal eats meat");
    }

    public static void main(String[] args) {
        Domestic D = new Domestic();
        D.eat();
        D.grass();

        Wild W = new Wild();
        W.eat();
        W.meat();
    }
}
