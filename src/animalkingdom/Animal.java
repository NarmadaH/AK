

package animalkingdom;

public abstract class Animal {
    String name;
    
    public Animal(String name){
        this.name=name;
    }
    
    public abstract String walk();
    
    public void printme(){
        System.out.println(name+ ": I say : "+ walk());
    }
    
}
