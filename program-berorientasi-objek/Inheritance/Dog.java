package Inheritance;

class Dog extends Animal{
    protected Dog(){
        super();
        System.out.println("I am a dog");
    }
    
    @Override
    protected void eat(){
        super.eat();
    }
    protected void bark(){
        System.out.println("I can bark");
    }
}
