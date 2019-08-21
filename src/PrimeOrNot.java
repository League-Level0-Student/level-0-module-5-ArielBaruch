import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	String g = JOptionPane.showInputDialog("think of a number and type it");

	int h= Integer.parseInt(g);
	
int counter = 0;	
	for(int i=2; i<h; i++ ){ 


if( h % i == 0 ) {
	counter ++;
}





	}
	if(counter == 0) {
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
	else {JOptionPane.showMessageDialog(null, "Your number is not prime");}
}
}
