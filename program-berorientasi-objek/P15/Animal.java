package P15;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("Hewan ini berjalan dengan " + legs + " kaki");
    }

}
