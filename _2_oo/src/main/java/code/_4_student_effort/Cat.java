package code._4_student_effort;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        //super(4);
        this("");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void play(){
        System.out.println("Play like a cat");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("like a cat");
    }
}
