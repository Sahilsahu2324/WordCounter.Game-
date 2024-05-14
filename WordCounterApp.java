package WordCounter;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    public static void main(String[] args) {
        //oR super("Word-Counter");for Creating Invisible implimentation of Frame
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
//---------TextArea for Wordtyping
        JTextArea textArea = new JTextArea();
        textArea.setSize(100, 200);
        textArea.setBackground(new Color(255,215,210));
        //-----------Count Label
        JLabel wordCountLabel = new JLabel("Word Count: 0");
        JButton countButton = new JButton("Count Words");
//------For Working CountButton
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String[] words = text.split("\\s+");
                int wordCount = words.length;
                wordCountLabel.setText("Word Count: " + wordCount);
            }
        });
//------- To Attech the Buttons and TextArea With the Panal
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.add(textArea);
        panel.add(countButton);
        panel.add(wordCountLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}