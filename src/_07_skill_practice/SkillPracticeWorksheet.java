package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPracticeWorksheet {
	public static void main(String[] args) {

		SkillPracticeWorksheet skills = new SkillPracticeWorksheet();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}
	void skill1(){ 
		String a = JOptionPane.showInputDialog(null,"How many dimes do you have?");
			
		int s = Integer.parseInt(a);
		
		JOptionPane.showMessageDialog( null, "you have " + " " + s * 10 + " " + "cents");
		
		String b = JOptionPane.showInputDialog(null, "How tall are you by inches?");
		
		int c = Integer.parseInt(b);
		
		if(c < 36) {JOptionPane.showMessageDialog(null,"eat yoUR WHEATIES!!!"); }
	
		else {JOptionPane.showMessageDialog(null, "uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh stupid?");}
	}
	 private void skill2() {
		// TODO Auto-generated method stub
		for(int d = 3; d < 31; d+=3) {
		
	System.out.println(d);
	 }
		}
	 
	private void skill3() {
		// TODO Auto-generated method stub
		int number = new Random().nextInt(20);
		
	 System.out.println(number);
		
	 
		int e = new Random().nextInt(10);
		
	 System.out.println(e);
		
	JOptionPane.showMessageDialog(null, (number - e) + " " + "is the difference to these numbers");
	}

	private void skill4() {
		// TODO Auto-generated method stub
		String kk = JOptionPane.showInputDialog(null, "what city do you live in?");
	
		if(kk == "San Diego") {
			JOptionPane.showMessageDialog(null, "You live in America's finest city");
		
			else {
				JOptionPane.showMessageDialog(null, "Move to San Diego you lamo");
			}
			 
			int cars = 2;
			
			if(cars == 0) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation");
				
				else if(cars == 1 ) {
					JOptionPane.showMessageDialog(null, "Tesla model X");
				}
			}
			
		}
		
	}

	private void skill5() {
		// TODO Auto-generated method stub
		
	}	
}
	
	
