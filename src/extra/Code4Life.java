package extra;

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

public class Code4Life {
	{

	// 1. Ask the user how many hours they spent coding this week.
	String hour = JOptionPane.showInputDialog("How many hours do you spend coding every week?");
	int hours = Integer.parseInt(hour);
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.

	
	if (hours<=2) {
		JOptionPane.showMessageDialog(null, "You should stop watching youtube, write code instead!");
	}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
	else if (hours>=3 && hours<=5) {
		JOptionPane.showMessageDialog(null, "You are a code ninja!");
	}
	// 4. If it is more than 5, call the method below to play the Batman theme song.
	else if (hours>5) {
		playBatmanTheme(); 
	}
	
	}
	
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