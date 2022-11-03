import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first data:");
        int data=sc.nextInt();
        List <Integer> list=new List<>(data);
        System.out.println("Enter List:");
        while(sc.hasNext()){
            data=sc.nextInt();
            list.add(data);

        }
    }
}
