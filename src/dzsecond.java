import java.util.*;
public class dzsecond{
    public static void main(String[]args){
    Scanner number=new Scanner(System.in);
    int[] mas=new int[6];
System.out.println("Enter number 1:");
        mas[1]=number.nextInt();
        System.out.println("Enter number 2:");
        mas[2]=number.nextInt();
        System.out.println("Enter number 3:");
        mas[3] =number.nextInt();
        System.out.println("Enter number 4:");
        mas [4]=number.nextInt();
        System.out.println("Enter number 5:");
        mas[5]=number.nextInt();
        System.out.println("Initial array:"+mas[1]+","+mas[2]+","+mas[3]+","+mas[4]+","+mas[5]);
        System.out.print("Sorted array:");
        Arrays.sort(mas);
        System.out.print(mas[1]+","+mas[2]+","+mas[3]+","+mas[4]+","+mas[5]+".");
        }}