
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java
	// package,
	// or if you prefer, get celebrity photos from the Internet, place them in the
	// default
	// package, and change the names below.

	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method below
		initializeGui();

			String guess = JOptionPane.showInputDialog("who is this?");

			if (guess.equals("Arnold Schwarzenegger")) {
				score += 1;
				JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);

			} else {
				JOptionPane.showMessageDialog(null, "Wrong, this is Arnold Schwarzenegger. Your score is " + score);
			}
			showNextImage();

			String guess2 = JOptionPane.showInputDialog("who is this?");

			if (guess2.equals("Leonardo Dicaprio")) {
				score += 1;
				JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);

			} else {
				JOptionPane.showMessageDialog(null, "Wrong, this is Leonardo Dicaprio. Your score is " + score);
			}
			showNextImage();

			String guess3 = JOptionPane.showInputDialog("who is this?");

			if (guess3.equals("Morgan Freeman")) {
				score += 1;
				JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);

			} else {
				JOptionPane.showMessageDialog(null, "Wrong, this is Morgan Freeman. Your score is" + score);
			}
			showNextImage();

			String guess4 = JOptionPane.showInputDialog("who is this?");
			
			if (guess4.equals("Jack Black")) {
				score += 1;
				JOptionPane.showMessageDialog(null, "Correct! Your score is " + score);

			} else {
				JOptionPane.showMessageDialog(null, "Wrong, this is Jack Black. Your score is" + score);
			}
			showNextImage();

		}


	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the image.
		window.setSize(400, 120);


	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
