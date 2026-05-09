import animals.Animal;
import animals.Dog;
import animals.Pig;
import animals.Cow;
import animals.Cat;

public class App
{
        public static void main(String[] args) throws Exception 
        {
            Animal[] farm = new Animal[4];
            farm[0] = new Dog();
            farm[1] = new Cat();
            farm[2] = new Cow();
            farm[3] = new Pig();

            for(int index = 0; index < farm.length; ++index)
            {
                singAVerse(farm[index]);
            }
        }
        public static void singAVerse(Animal anAnimal)
        {
            System.out.println("Old MacDonald had a farm, EIEIO.");
            System.out.print("And on this farm he had a ");
            System.out.print(anAnimal.toString());
            System.out.println(", EIEIO.");
            System.out.print("With a ");
            System.out.print(anAnimal.getNoise());
            System.out.print(" ");
            System.out.print(anAnimal.getNoise());
            System.out.print(" here, and a ");
            System.out.print(anAnimal.getNoise());
            System.out.print(" ");
            System.out.print(anAnimal.getNoise());
            System.out.println(" there, ");
            System.out.print("here a ");
            System.out.print(anAnimal.getNoise());
            System.out.print(", there a ");
            System.out.print(anAnimal.getNoise());
            System.out.println(", ");
            System.out.print("everywhere a ");
            System.out.print(anAnimal.getNoise());
            System.out.print(" ");
            System.out.println(anAnimal.getNoise());
            System.out.println("Old MacDonald had a farm, EIEIO.");
            System.out.println();
        }
}