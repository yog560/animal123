package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalInput {
    
    ArrayList<Talkable> zoo = new ArrayList<>();
    
    public ArrayList userInput()
    {
       /* String input;
        System.out.println("Enter the type of animal Dog, cat, animal");
        do
        {
        Scanner kb = new Scanner(System.in);
        input = kb.nextLine();
        } while("Dog".equals(input.toLowerCase()) || "cat".equals(input.toLowerCase()) || "animal".equals(input.toLowerCase()));
      */
        Scanner kb = new Scanner(System.in);
        String classname;
        boolean isfriendly;
        String classarg2;
          int  classarg1;
    //zoo.add(new Dog(true, "Pete"));
        System.out.println("Enter the type of clasname of animal Dog, cat, animal");
        classname = kb.nextLine();
     
        System.out.println("Is the dog friendly");
     isfriendly = Boolean.parseBoolean(kb.nextLine());
      
     System.out.println("Name of the dog");
     classarg= kb.nextLine();
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        return zoo;
    }
}
