class AnimalKingdomTest {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");

        a1.speak();
        a2.speak();

        System.out.println(a1.equals(new Dog("Buddy")));

        Animal yo = new Animal("joe");
        Mammal yo1 = (Mammal)yo;
        yo1.performTrick();
    }
}

class Animal {
    protected String name;
    
    Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal sound ..... 🥶🥶🥶🥶🥶🥶🥶🥶🥶");
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            return name.equals(((Animal)o).name);
        } else {
            return false;
        }
    }
    
}

class Mammal extends Animal {
    protected boolean warmBlooded = true;
    protected String dietType;
    protected int numLegs;
    protected String sound;

    Mammal(String name, boolean warmBlooded, String dietType, int numLegs, String sound) {
        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = numLegs;
        this.sound = sound;
    }

    public void performTrick() {
        System.out.println("EPIC TRICK SUPER EPIC TRICK AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}

class Dog extends Mammal {
    Dog(String name) {
        super(name, true, "omnivore", 4, "Woof!");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

}

class Cat extends Mammal {
    Cat(String name) {
        super(name, true, "carnivore", 4, "Meow!");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            return name.equals(((Cat)o).name);
        } else {
            return false;
        }
    }

}

final class Human extends Mammal {
    Human(String name) {
        super(name, true, "carnivore", 2, "Meow!");
    }
}

class Reptile extends Animal {
    boolean warmBlooded = false;
    int numLegs;
    String dietType;
    String sound;

    Reptile(String name, boolean warmBlooded, int numLegs, String dietType, String sound) {
        super(name);
        this.warmBlooded = warmBlooded;
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: " + sound);
    }
    
}

class Bird extends Animal {

    boolean warmBlooded = true;
    int numLegs;
    String dietType;
    String sound;
    
    Bird(String name, boolean warmBlooded, int numLegs, String dietType, String sound) {
        super(name);
        this.warmBlooded = warmBlooded;
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: " + sound);
    }

}

// EXPLANATION FOR THAT DOWN THERE!!!!!!!!!!!! 🚨🚨🚨🚨 Basically it doesn't work because like human is final it's it thats the end
// so therefore it simply just dont work because it cant go on it's not possible it cant be inhereted because of the final keyword so NO!!!!!!!!!!!!!!

// -----------------------------------------
// class joejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoe extends Human { 

//     public joejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoejoe() {
//         super(name);
//     }
// }
// -----------------------------------------

