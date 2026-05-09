package animals;

public class Dog extends Animal 
{
    public Dog()
    {
        noise = "woof";
    }
    
    @Override
    public String toString()
    {
        return "dog";
    }
}