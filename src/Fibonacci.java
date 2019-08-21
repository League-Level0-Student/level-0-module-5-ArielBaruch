
public class Fibonacci {
public static void main(String[] args) {
	
int g = 0;
int h = 1;
int f = 0;
System.out.println(0);
System.out.println(1);
for(int i=0; i<12; i++) {
f=g+h; 	
System.out.println(f);
g=h; h=f;
}

}
}
