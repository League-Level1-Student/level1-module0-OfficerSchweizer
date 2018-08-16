
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image1 = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12213218/German-Shepherd-on-White-00.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component cImage1;
		// 3. use the "createImage()" method below to initialize your Component
		cImage1 = createImage(image1);
		// 4. add the image to the quiz window
		quizWindow.add(cImage1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer1 = JOptionPane.showInputDialog("What is this dog's breed?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer1.equals("German Shepherd")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(cImage1);
		// 10. find another image and create it (might take more than one line of code)
		String image2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Johnadamsvp.flipped.jpg/220px-Johnadamsvp.flipped.jpg";
		Component cImage2;
		cImage2 = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(cImage2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What number president was this man?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("2nd")) {
			System.out.println("CORRECT");
		} else if (answer2.equals("Second")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		
		quizWindow.remove(cImage2);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
