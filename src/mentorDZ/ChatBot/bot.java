package mentorDZ.ChatBot;

import javax.swing.*;
import java.awt.*;

public class bot extends JFrame {
    public static void main(String[] args) {
        new bot();

    }

    bot() {
        super("ChatBot"); // super передает ссылку на родительский класс
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(null);
        setBackground(Color.GRAY);

        JButton button = new JButton("Click");
        button.setBounds(420, 220, 60, 30);
        add(button);

        // JTextArea - область с текстом т.е. текстовое окно
        // JTextField - поля ввода текста т.е. текстовое окно

        JTextArea dialogFrame = new JTextArea();
        dialogFrame.setBounds(20, 20, 460, 200);
        dialogFrame.setBackground(new Color(200, 200, 200));
        dialogFrame.setEditable(false);
        add(dialogFrame);

        JTextField inputLine = new JTextField();
        inputLine.setBounds(20, 220, 400, 30);
        add(inputLine);


        Controller controller = new Controller(inputLine, dialogFrame);
        button.addActionListener(controller);
        inputLine.addActionListener(controller);

        setVisible(true);


    }
}

