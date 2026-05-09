package animals;

public class Animal {

    protected String noise;

    public Animal()
    {
        noise = "huff huff";
    }

    public void makeNoise()
    {
        System.out.print(this);
        System.out.print(" says ");
        System.out.println(noise);
    }

    public String getNoise()
    {
        return noise;
    }
    
    @Override
    public String toString()
    {
        return "Animal";
    }
}