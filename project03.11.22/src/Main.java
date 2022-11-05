import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first data:");
        int data=sc.nextInt();
        List <Integer> list=new List<>(data);
        System.out.println("Enter List (until data!=0):");
        data=sc.nextInt();
        while(data!=0){
            list.add(data);
            data=sc.nextInt();
        }
        list.print();
        System.out.println("Simm?:"+list.simm());
        System.out.println("Does the list have the equal element?: "+list.equalelem());
        System.out.println("Enter the element to remove from the end:");
        data= sc.nextInt();
        list.removelast(data);
        list.print();
    }
}
