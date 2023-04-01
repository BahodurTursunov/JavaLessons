package mentorDZ.ChatBot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    JTextField inputLine;
    JTextArea outputArea;

    Controller(JTextField inputLine, JTextArea outputArea) {
        this.inputLine = inputLine;
        this.outputArea = outputArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = inputLine.getText();
        inputLine.setText("");
        outputArea.setText(outputArea.getText() + "\n" + command);
        String responce;

        if (command.contains("Hello"))
            responce = "Hi";
        else responce = "I don`t understand";
        /*
        switch (command) {
            case "Hello":
                responce = "Hi!";
                break;
            case "How are you?":
                responce = "I`m good, thanks!";
                break;
            default: responce = "I don`t understand";
        }*/
        outputArea.setText(outputArea.getText() + "\n >>>" + responce);
    }
}
