package com.alpha.beta;
//login page using awt 
import java.awt.*;
import java.awt.event.*;

public class Demo extends Frame implements ActionListener {
    // Declare components
    Label labelUsername, labelPassword, labelMessage;
    TextField textUsername, textPassword;
    Button buttonLogin;

    // Constructor to set up the GUI components
    public Demo() {
        // Set the layout manager for the frame
        setLayout(new GridLayout(4, 2, 10, 10)); // Using GridLayout for better organization

        // Create components
        labelUsername = new Label("Username:");
        labelPassword = new Label("Password:");
        labelMessage = new Label();

        textUsername = new TextField();
        textPassword = new TextField();
        textPassword.setEchoChar('*'); // To hide password input

        buttonLogin = new Button("Login");
        buttonLogin.addActionListener(this); // Register the button with the action listener

        // Add components to the frame
        add(labelUsername);
        add(textUsername);
        add(labelPassword);
        add(textPassword);
        add(new Label());  // Empty space in the grid
        add(buttonLogin);
        add(labelMessage);

        // Set frame properties
        setTitle("Login Page");
        setSize(400, 200);
        setVisible(true);

        // Window close event to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Action listener for the Login button
    public void actionPerformed(ActionEvent ae) {
        String username = textUsername.getText();
        String password = textPassword.getText();

        // Check for hardcoded username and password
        if (username.equals("admin") && password.equals("123")) {
            labelMessage.setText("Login successful!");
            labelMessage.setForeground(Color.GREEN);
        } else {
            labelMessage.setText("Invalid login. Try again.");
            labelMessage.setForeground(Color.RED);
        }
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
			    new Demo(); // Ensures GUI updates happen on the Event Dispatch Thread
			}
		});
    }
}
