package _07_skill_practice;

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
		for(int d = 0; 0 < 30; d++);
		
	}

	private void skill3() {
		// TODO Auto-generated method stub
		
	}

	private void skill4() {
		// TODO Auto-generated method stub
		
	}

	private void skill5() {
		// TODO Auto-generated method stub
		
	}
	}
	
	
