import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.System;
//import java.io.IOException;
class Swapping{
    static void m1(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }
    static void m2(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }
    static void m3(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }
    static void m4(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }
    static void m5(int a,int b){
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a+" b: "+b);
        a=(a+b)-(b=a);
        System.out.println("After Swapping: ");
        System.out.println("a: "+a+" b: "+b);
    }
}
class Swap{
    static void option(){
        System.out.print("Enter A Value: ");
        int a=Input.choice();
        System.out.print("Enter B Value: ");
        int b=Input.choice();
        do{
            System.out.println("Different Methods of Swapping");
            System.out.println("\n1) Using Temp Variable");
            System.out.println("\n2) Using Addition and Subtraction Operator");
            System.out.println("\n3) Using Bitwise Operators");
            System.out.println("\n4) Using Multiplication and Division Operator");
            System.out.println("\n5) Using Formula");
            System.out.print("Enter your Choice: ");
            int choice=Input.choice();
            switch(choice){
                case 1: Swapping.m1(a,b);
                        break;
                case 2: Swapping.m2(a,b);
                        break;
                case 3: Swapping.m3(a,b);
                        break;
                case 4: Swapping.m4(a,b);
                        break;
                case 5: Swapping.m5(a,b);
                        break;
                case -1:System.out.println("Exiting NUMBERS MODULE...");
                        return;
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
}
class Array{
    static void DivisibleByTwoAndThree(int arr[]){
        System.out.println("Divisible By 2 and 3: ");
        for(int i:arr){
            if(i%2==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
    static int SumofElementsGreaterThanEightyEqualsFourty(int arr[]){
        int sum=0;
        for(int i:arr){
            if(i>80 || i==40){
                sum+=i;
            }
        }
        return sum;
    }
    static void SumOfEvenAndOddElements(int arr[]){
        int esum=0;
        int osum=0;
        for(int i:arr){
            if(i%2==0){
                esum+=i;
            }
            else{
                osum+=i;
            }
        }
        System.out.println("Even Sum: "+esum);
        System.out.println("Odd Sum: "+osum);
    }
    static void MaxAndMinElement(int arr[]){
        int max=arr[0];
        int min=arr[arr.length-1];
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.print("Maximum Element: "+max);
        System.out.print("\nMinimum Element: "+min);
    }
    static int SumOfArray(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    static void Replace(int arr[],int a){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                arr[i]=a;
                c++;
            }
        }
        if(c>0){
            Input.printArray(arr);
        }
        else{
            System.out.println("No Element Found Greater than A");
            return;
        }
    }
    static int[] Reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    static void ReplaceFirst(int arr[],int old,int new1){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==old){
                arr[i]=new1;
                c++;
                break;
            }
        }
        if(c>0){
            Input.printArray(arr);
        }
        else{
            System.out.println("Old Element Not Found");
            return;
        }
    }
    static void ReplaceExFirst(int arr[],int old,int new1){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==old && c==0){
                c++;
                continue;  
            }
            if(arr[i]==old){
                arr[i]=new1;
                c++;
            }
        }
        if(c>0){
            Input.printArray(arr);
        }
        else{
            System.out.println("No Element Found!!");
        }
    }
    static void OldCount(int arr[],int old){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==old){
                c++;
            }
        }
        if(c>0){
            System.out.println("Old Element Count: "+c);
        }
        else{
            System.out.println("No Old Element Found");
        }
    }
    static int[] ReplaceLast(int arr[],int old,int new1){
        for(int i=arr.length-1;i>=0;i++){
            if(arr[i]==old){
                arr[i]=new1;
                break;
            }
        }
        return arr;
    }
    static void arrPrint1(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void arrPrint2(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void arrPrint3(int arr[]){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    static void arrPrint4(int arr[]){
        int i=0;
        do{
            System.out.print(arr[i]+" ");
            i++;
        }while(i<arr.length);
    }
    static void arrPrint5(int arr[]){
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        System.out.print(arr[2]+" ");
        System.out.print(arr[3]+" ");
        System.out.print(arr[4]+" ");
        System.out.print(arr[5]+" ");
        System.out.print(arr[6]+" ");
    }
    static void arrPrint6(int arr[],int n){
        if(n>=arr.length)
            return;
        System.out.print(arr[n]+" ");
        arrPrint6(arr,n+1);
    }
    static void arrPrint7(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    static void arrayPrint(){
        do{
        System.out.println("\nPrinting an Array");
        System.out.println("1) Using for Loop");
        System.out.println("2) Using for-each Loop");
        System.out.println("3) Using while Loop");
        System.out.println("4) Using do-while Loop");
        System.out.println("5) Using Manual Printing");
        System.out.println("6) Using String");
        System.out.println("7) Using Recursion");
        System.out.print("\nEnter your Choice: ");
        switch(Input.choice()){
            case 1: arrPrint1(Input.ReadArray());
                    break;
            case 2: arrPrint2(Input.ReadArray());
                    break;
            case 3: arrPrint3(Input.ReadArray());
                    break;
            case 4: arrPrint4(Input.ReadArray());
                    break;
            case 5: arrPrint5(Input.ReadArray());
                    break;
            case 6: arrPrint6(Input.ReadArray(),0);
                    break;
            case 7: arrPrint7(Input.ReadArray());
                    break;
            case -1: return;
            default: System.out.println("Invalid Choice!!!");
        }
        }while(true);
    }
    static void middle(int arr[]){
        int mid=arr[arr.length/2];
        System.out.println("Mid Element: "+mid+"\nMiddle Element Index: "+arr.length/2);
    }
    static void leftAndRightElements(int arr[]){
        System.out.print("Left SubArray Elements: ");
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nRight SubArray Elements: ");
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortAscending(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        Input.printArray(arr);
    }
    static void arrCopy1(int arr[]){
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dup[i]=arr[i];
        }
        System.out.println("Original Array: ");
        Input.printArray(arr);
        System.out.println("\nCopied Array: ");
        Input.printArray(dup);
    }
    static void arrCopy2(int arr[]){
        int arr2[]=new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.out.println("Original Array: ");
        Input.printArray(arr);
        System.out.println("\nCopied Array: ");
        Input.printArray(arr2);
    }
    static void arrCopy3(int arr[]){
        int arr2[]=Arrays.copyOf(arr, arr.length);
        System.out.println("Original Array: ");
        Input.printArray(arr);
        System.out.println("\nCopied Array: ");
        Input.printArray(arr2);
    }
    static void arrCopying(){
        do{
            System.out.println("\n\nCopying Array Elements");
            System.out.println("1) Manual Method");
            System.out.println("2) Using arraycopy Method");
            System.out.println("3) Using copyOf Method");
            System.out.print("\nEnter your Choice: ");
            switch(Input.choice()){
                case 1: arrCopy1(Input.ReadArray());
                        break;
                case 2: arrCopy2(Input.ReadArray());
                        break;
                case 3: arrCopy3(Input.ReadArray());
                        break;
                case -1: return;
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
    static void evenAndOdd(int arr[])
    {
        System.out.print("Even Elements: ");
        for(int i:arr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.print("\nOdd Elements: ");
        for(int i:arr){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    static void seperateMid(int arr[]){
        int a1[]=new int[arr.length/2];
        System.arraycopy(arr, 0, a1, 0, arr.length/2);
        int a2[]=new int[arr.length-(arr.length/2)];
        System.arraycopy(arr, arr.length/2, a2, 0, arr.length/2);
        System.out.print("Before Mid: ");
        Input.printArray(a1);
        System.out.print("\nAfter Mid: ");
        Input.printArray(a2);
    }
    static void ascAndDescMid(int arr[]){
        int a1[]=new int[arr.length/2];
        System.arraycopy(arr, 0, a1, 0, arr.length/2);
        int a2[]=new int[arr.length-(arr.length/2)];
        System.arraycopy(arr, arr.length/2, a2, 0, arr.length/2);
        sortAscending(a1);
        Reverse(a2);
        System.out.print("\nBefore Mid(Ascending): ");
        Input.printArray(a1);
        System.out.print("\nAfter Mid(Reverse): ");
        Input.printArray(a2);
    }
    static void replaceGreaterThanOld(int arr[],int a,int new1){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                arr[i]=new1;
            }
        }
        System.out.print("After Replacing: ");
        Input.printArray(arr);
    }
    static void firstAscSecondPartRev(int arr[]){
        int a1[]=new int[arr.length/2];
        System.arraycopy(arr, 0, a1, 0, arr.length/2);
        int a2[]=new int[arr.length-(arr.length/2)];
        System.arraycopy(arr, arr.length/2, a2, 0, arr.length/2);
        int a3[]=new int[a2.length/2];
        int j=a2.length/2;
        for(int i=0;i<a2.length/2;i++){
            a3[i]=a2[j++];
        }
        System.out.print("\nBefore Mid(Ascending): ");
        Input.printArray(a1);
        System.out.print("\nAfter Mid: ");
        Input.printArray(a2);
        System.out.print("\nSecond Part(Reverse): ");
        Input.printArray(a3);
    }
    static void option(){
        do{
            System.out.println("\n\nARRAY OPERATIONS: ");
            System.out.println("1) Divisible By Two and Three");
            System.out.println("2) Sum of Elements Greater than 80 equals 40");
            System.out.println("3) Sum of Even and Odd Elements");
            System.out.println("4) Maximum and Minimum Element in Array");
            System.out.println("5) Sum of Array Elements");
            System.out.println("6) Replace Old with New");
            System.out.println("7) Reversing an Array");
            System.out.println("8) Replace only First Found");
            System.out.println("9) Replace All Except First Element");
            System.out.println("10) Count of Old Element");
            System.out.println("11) Update Last Old Element");
            System.out.println("12) Print Array in Different Ways");
            System.out.println("13) Middle Element and Index");
            System.out.println("14) Left and Right SubArray Elements");
            System.out.println("15) Sort in Ascending Order");
            System.out.println("16) Copying Array Elements");
            System.out.println("17) Even and Odd Elements in Array"); 
            System.out.println("18) Copying Mid Elements in two Seperate Arrays");
            System.out.println("19) First Half in Ascending Order, Second Half in Descending Order");
            System.out.println("20) If Element Greater than Old Replace with New");
            System.out.println("21) First Half in Ascending, Second Half, Second Part in Reverse Order");
            System.out.print("\nEnter your choice: ");
            switch(Input.choice()){
                case 1: DivisibleByTwoAndThree(Input.ReadArray());
                        break;
                case 2: System.out.println("Sum: "+SumofElementsGreaterThanEightyEqualsFourty(Input.ReadArray()));
                        break;
                case 3: SumOfEvenAndOddElements(Input.ReadArray());
                        break;
                case 4: MaxAndMinElement(Input.ReadArray());
                        break;
                case 5: System.out.print("Sum: "+SumOfArray(Input.ReadArray()));
                        break;
                case 6: Replace(Input.ReadArray(),Input.choice());
                        break;
                case 7: Input.printArray(Reverse(Input.ReadArray()));
                        break;
                case 8: ReplaceFirst(Input.ReadArray(), Input.choice(), Input.choice());
                        break;
                case 9: ReplaceExFirst(Input.ReadArray(), Input.choice(), Input.choice());
                        break;
                case 10: OldCount(Input.ReadArray(), Input.choice());
                         break;
                case 11: Input.printArray(ReplaceLast(Input.ReadArray(), Input.choice(), Input.choice()));
                         break;
                case 12: arrayPrint();
                         break;
                case 13: middle(Input.ReadArray());
                         break;
                case 14: leftAndRightElements(Input.ReadArray());
                         break;
                case 15: sortAscending(Input.ReadArray());
                         break;
                case 16: arrCopying();
                         break;
                case 17: evenAndOdd(Input.ReadArray());
                         break;
                case 18: seperateMid(Input.ReadArray());
                         break;
                case 19: ascAndDescMid(Input.ReadArray());
                         break;
                case 20: replaceGreaterThanOld(Input.ReadArray(), Input.choice(), Input.choice());
                         break;
                case 21: firstAscSecondPartRev(Input.ReadArray());
                         break;
                case -1: return;
                default: System.out.println("Invalid Choice!!!");
            }
        }while(true);
    }
}
class Numbers{
    static void ReadIntAndPrint(){
        System.out.print("Enter 1st Number: ");
        int a=Input.choice();
        System.out.println("Enter 2nd Number: ");
        int b=Input.choice();
        System.out.println("First Number: "+a+"\n"+"Second Number: "+b);
    }
    static int SumOfTwo(int a,int b){
        return a+b;
    }
    static int Multiply(int a,int b){
        return a*b;
    }
    static int MaxOfTwo(int a,int b){
        return (a>b)?a:b;
    }
    static void option(){
        System.out.print("\nEnter 1st Value: ");
        int a=Input.choice();
        System.out.print("\nEnter 2nd Value: ");
        int b=Input.choice();
        do{
            System.out.println("NUMBER OPERATIONS: ");
            System.out.println("\n1) Read Integers and Print");
            System.out.println("2) Sum of 2 Numbers");
            System.out.println("3) Multiplication of 2 Numbers");
            System.out.println("4) Maximum of 2 Numbers");
            System.out.println("5) Swapping");
            System.out.print("\nEnter your choice: ");
            int choice=Input.choice();
            switch(choice){
                case 1: ReadIntAndPrint();
                        break;
                case 2: System.out.println("Sum: "+SumOfTwo(a,b));
                        break;
                case 3: System.out.println("Multiplication of Two Numbers: "+Multiply(a,b));
                        break;
                case 4: System.out.println("Maximum: "+MaxOfTwo(a,b));
                        break;
                case 5: Swap.option();
                        break;
                case -1: return;
                default: System.out.println("Invalid Choice!!!");
            }
        }while(true);
    }
}
class Strings{
    static void Name(char ch){
        int n=(int)ch;
        if(n>65 && n<=90){
            if(n==73){
                return;
            }
            System.out.print(ch+" ");
            Name((char)(n-1));
        }else if(n>91 && n<=122){
            if(n==105){
                return;
            }
            System.out.print(ch+" ");
            Name((char)(n-1));
        }
    }
    static void option(){
        do{
            System.out.println("\nString Operations");
            System.out.println("1) Print until your name Letter");
            System.out.print("Enter your choice: ");
            switch(Input.choice()){
                case 1: Name(Input.readChar());
                        break;
                case -1: return;
            }
        }while(true);
        
    }
}
class Recursion{
    static int Fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*Fact(n-1);
        }
        
    }
    static int SumOfN(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+SumOfN(n-1);
        }
    }
    static void option(){
        do{
            System.out.println("\nRecursion Operations");
            System.out.println("1) Factorial of given Number");
            System.out.println("2) Sum of N Natural Numbers");
            System.out.print("Enter your choice: ");
            switch(Input.choice()){
                case 1: System.out.println("Enter an Integer: ");
                        System.out.println("Factorial: "+Fact(Input.choice()));
                        break;
                case 2: System.out.println("Enter the N Value: ");
                        System.out.println("Sum: "+SumOfN(Input.choice()));
                        break;
                case -1: return;
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
}
class Sorting{
    static int[] BubbleSort1(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] BubbleSort2(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int[] SelectionSort1(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    static int[] SelectionSort2(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    static int[] quickSort1(int a[],int LIndex,int HIndex){
        if(LIndex>=HIndex){
            return a;
        }
        int lp,rp,pivot,temp;
        pivot=a[HIndex];
        lp=LIndex;
        rp=HIndex;
        while(lp<rp){
            while(a[lp]<=pivot && lp<rp)
                lp++;
            while(a[rp]>=pivot && lp<rp)
                rp--;
            temp=a[lp];
            a[lp]=a[rp];
            a[rp]=temp;
        }
        temp=a[lp];
        a[lp]=a[HIndex];
        a[HIndex]=temp;
        quickSort1(a, LIndex, lp-1);
        quickSort1(a, lp+1, HIndex);
        return a;
    }
    static int[] quickSort2(int a[],int LIndex,int HIndex){
        if(LIndex>=HIndex){
            return a;
        }
        int lp,rp,pivot,temp;
        pivot=a[HIndex];
        lp=LIndex;
        rp=HIndex;
        while(lp<rp){
            while(a[lp]<=pivot && lp<rp)
                lp++;
            while(a[rp]>=pivot && lp<rp)
                rp--;
            temp=a[lp];
            a[lp]=a[rp];
            a[rp]=temp;
        }
        temp=a[lp];
        a[lp]=a[HIndex];
        a[HIndex]=temp;
        quickSort2(a, LIndex, lp-1);
        quickSort2(a, lp+1, HIndex);
        return a;
    }
    static void TypeoFSort(){
        do{
            System.out.println("\n\nSORTING TYPE");
            System.out.println("1)Bubble Sort(Increasing Order)");
            System.out.println("2)Bubble Sort(Decreasing Order)");
            System.out.println("3) Selection Sort(Increasing Order)");
            System.out.println("4) Selection Sort(Decreasing Order)");
            System.out.println("5) Quick Sort(Increasing Order)");
            System.out.println("6) Quick Sort(Decreasing Order)");
            System.out.print("Enter your Choice: ");
            switch(Input.choice()){
                case 1: Input.printArray(BubbleSort1(Input.ReadArray()));
                            break;
                case 2: Input.printArray((BubbleSort2(Input.ReadArray())));
                            break;
                case 3: Input.printArray(SelectionSort1(Input.ReadArray()));
                            break;
                case 4: Input.printArray(SelectionSort2(Input.ReadArray()));
                            break;
                case 5: int arr[]=Input.ReadArray(); 
                        Input.printArray(quickSort1(arr,0,arr.length-1));
                        break;
                case 6: int arr1[]=Input.ReadArray();
                        Input.printArray(quickSort2(arr1, 0, arr1.length));
                case -1: return;
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
    static void option(){
        do{
            System.out.println("TYPES OF SORTINGS");
            System.out.println("1) Bubble Sort");
            System.out.println("2) Selection Sort");
            System.out.println("3) Quick Sort");
            System.out.print("Enter your choice: ");
            switch(Input.choice()){
                case 1: TypeoFSort();
                        break;
                case 2: TypeoFSort();
                        break;
                case 3: TypeoFSort();
                        break;
                case -1: return;
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
}
class Input{
    static Scanner sc=new Scanner(System.in);
    static int choice(){
        System.out.print("Enter Element: ");
        return sc.nextInt();
    }
    static String choice1(){
        return sc.nextLine();
    }
    static char readChar(){
        System.out.print("Enter the Char: ");
        String s=sc.next();
        return s.charAt(0);
    }
    static int[] ReadArray(){
        System.out.print("Enter No. of Elements in Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+i+": ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static String print1(){
        return "Sorted Elements: ";
    }
}
public class Crt {
    public static void main(String[] args) {
        do{
            System.out.println("\nJava Operations Categories");
            System.out.println("1) ARRAYS");
            System.out.println("2) NUMBERS");
            System.out.println("3) RECURSION");
            System.out.println("4) STRINGS");
            System.out.println("5) Sorting");
            System.out.print("\nEnter your Choice: ");
            int choice=Input.choice();
            switch(choice){
                case 1: Array.option();
                        break;
                case 2: Numbers.option();
                        break;
                case 3: Recursion.option();
                        break;
                case 4: Strings.option();
                        break;
                case 5: Sorting.option();
                        break;
                case -1: System.exit(-1);
                default: System.out.println("Invalid Choice!!");
            }
        }while(true);
    }
}
