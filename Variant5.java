import java.util.InputMismatchException;
import java.util.Scanner;
public class Variant5 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Размер массива");
try{
int size = sc.nextInt();
float[] arr = new float[size];
System.out.println("Заполните массив:");
for(int i = 0;i<arr.length; i++){
arr[i] = sc.nextInt();
}
int count = 0;
int inMin = 0;
float min = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; i++){
if(arr[i]<0){
count++;
}
}
if (count != 0){
for (int i = 0; i < arr.length; i++){
if(arr[i]< min){
inMin = i;
min = arr[i];
}
}
System.out.println("Min = " + min + " index = " + inMin);
}
else{throw new RuntimeException("Нет отриц. чисел.");}
}
catch (InputMismatchException im){
System.out.println("Ввод строки");
}
}
}