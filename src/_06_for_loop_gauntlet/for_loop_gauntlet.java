package _06_for_loop_gauntlet;

public class for_loop_gauntlet {
public static void main(String[] args) {
	

	for(int i = 1; i < 10; i += 3) {
	for(int g = i; g < i+3; g++) {
		System.out.print(g + " ");
	}
	System.out.println();
}
for(int s = 1; s < 101; s += 10) {
	for(int a = s; a < s+10; a++) {
		System.out.print(a + " ");
	}
System.out.println();
}

System.out.println();
for(int y = 1; y < 8; y++) {
	for(int z = 1; z < y; z++) {
		System.out.print( "* ");
	}
System.out.println();
}
for(int v = 100; v > -1; v--) {
	System.out.println(v);
}
}
}

