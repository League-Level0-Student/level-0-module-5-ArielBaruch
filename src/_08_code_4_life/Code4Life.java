package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life { @SuppressWarnings("unused")
public static void main(String[] args) {
	


	// 1. Ask the user how many hours they spent coding this week.
	String q = JOptionPane.showInputDialog(null, "How many hrs did you spend on coding this week");
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
	int w = Integer.parseInt(q); 
	if(w <= 2) {
		JOptionPane.showMessageDialog(null, "Stop wathing peppa pig and her friend dora, write code instead");
	}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
	else if(w  >= 3 && w <= 5) {
		JOptionPane.showMessageDialog(null, "YOu WilL beCoME the NeXt HoKaG beLeIvE it");
	}
	
	// 4. If it is more than 5, call the method below to play the Batman theme song.
	else{
		JOptionPane.showMessageDialog(null, "Search up SpongBob wolves memes on youtube and click on the first video");
		playBatmanTheme();
		
	}}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}