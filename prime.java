import java.util.scanner;
class Prime{
public static void main(string[] args){
Scanner sc = new Scanner(System.in);
System.out.println("please insert any number");
num = sc.nextInt();
boolean isPrime = true;
for(int i = 1;i<num;i++){
if(num%i==0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.println(num+ "is a prime number");
}else{
System.out.println(num+ "is not a prime number");
}



