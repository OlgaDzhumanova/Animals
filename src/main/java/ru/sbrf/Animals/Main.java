package ru.sbrf.Animals;

public class Main {

    public static void main(String[] args) {
        Animals cat = new Cat();
        System.out.println("Cat Skills");
        cat.ClimbTrees(Cat.cat1());
        cat.Swim(Cat.cat2());
        cat.Sound(Cat.cat3());
        cat.Eat(Cat.cat4());
        cat.Move(Cat.cat5());

        System.out.println("Dog Skills");
        Animals dog = new Dog();
        dog.ClimbTrees(Dog.dog1());
        dog.Swim(Dog.dog2());
        dog.Sound(Dog.dog3());
        dog.Eat(Dog.dog4());
        dog.Move(Dog.dog5());

        System.out.println("Mammals Skills");
        Animals mamm = new Mammals();
        mamm.ClimbTrees(Mammals.mamm1());
        mamm.Swim(Mammals.mamm2());
        mamm.Sound(Mammals.mamm3());
        mamm.Eat(Mammals.mamm4());
        mamm.Move(Mammals.mamm5());

    }


}
