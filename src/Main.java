class Animal {
    public void makeSound() {
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("야옹!");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound () {
        System.out.println("꽤액!");
    }
}

class Quokka extends Animal {
    @Override
    public  void makeSound() {
        System.out.println("퀔퀔!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        Animal a4 = new Quokka();

        Animal[] animals = {a1, a2, a3 ,a4};

        for (Animal a : animals) { //for each문
            a.makeSound();
        }
    }
}