import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame welcomeScreen;
    Container con;
    JPanel title, startButtonPanel, menuTextPanel, choiceButtonPanel, statsTextPanel, continueButtonPanel,
            nameTextPanel, nameAnswersPanel;
    JLabel titleText; //  to write text on the panel
    Font titleFont = new Font("Times", Font.PLAIN, 90); // creates custom font
    JButton startButton, choice1, choice2, choice3, choice4, continueButton;
    Font normalFont = new Font("Times", Font.PLAIN, 30); // creates custom font
    JTextArea menuTextArea, statsTextArea, nameTextArea;
    Font menuFont = new Font("Times", Font.PLAIN, 20); // creates custom font
    JTextField nameAnswerField;

    WelcomeScreenHandler wsHandler = new WelcomeScreenHandler();
    MenuScreenHandler msHandler = new MenuScreenHandler();
    ContinueToNext ctNext = new ContinueToNext();
    GettersAndSetters gS = new GettersAndSetters();

    public static void main(String[] args) {

        new Game();

    }

    public Game() {

        // creates the window
        welcomeScreen = new JFrame();
        welcomeScreen.setSize(800,600);
        welcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeScreen.getContentPane().setBackground(Color.black);
        welcomeScreen.setLayout(null);

        con = welcomeScreen.getContentPane();

        // panel edits
        title = new JPanel();
        title.setBounds(100,100,600,150);
        title.setBackground(Color.BLACK); // text panel color

        // text edits
        titleText = new JLabel("QUEST");
        titleText.setForeground(Color.white); // font color
        titleText.setFont(titleFont);

        // button panel edits
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

        // button edits
        startButton = new JButton("START");
        startButton.setBackground(Color.black); // button color
        startButton.setForeground(Color.white); // button text color
        startButton.setOpaque(true);
        startButton.setBorderPainted(false); // this and the opaque keep the button from not showing up
        startButton.setFont(normalFont);
        startButton.addActionListener(wsHandler); // gives the button a function

        // putting things together
        title.add(titleText);
        startButtonPanel.add(startButton);

        con.add(title);
        con.add(startButtonPanel);
        welcomeScreen.setVisible(true);

    }

    // second menu screen, after title
    public void createMenuScreen() {

        title.setVisible(false);
        startButtonPanel.setVisible(false);

        // menu text area
        menuTextPanel = new JPanel();
        menuTextPanel.setBounds(100,100,600,250);
        menuTextPanel.setBackground(Color.BLACK);

        // actual text in menu
        menuTextArea = new JTextArea("Your life situation impacts the resources you can start with!\n" +
                "An easier life will give you more resources to begin with, but your final score will have a lower multiplier added on.\n" +
                "1) Olympian - With near infinite resources, your life is off to an \neasy start. \n" +
                "2) High Royalty - As part of the ancient royal courts, you've got \nquite the budget. \n" +
                "3) Weaver - Average income, average life. \n" +
                "4) Public servant - You don't have much to start with, but hopefully this journey can change that. \n");
        menuTextArea.setBounds(100,100,550,250);
        menuTextArea.setBackground(Color.BLACK);
        menuTextArea.setForeground(Color.white);
        menuTextArea.setFont(menuFont);
        menuTextArea.setLineWrap(true);
        menuTextArea.setEditable(false);

        menuTextPanel.add(menuTextArea);
        con.add(menuTextPanel);

        // creates button choices panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1 )); // changes the default layout here
        con.add(choiceButtonPanel);

        // button choices + try to fix the coloring on the buttons later
        choice1 = new JButton("1) Olympian");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(menuFont);
        choice1.setOpaque(true);
        choice1.setBorderPainted(false);
        choiceButtonPanel.add(choice1);
        choice1.addActionListener(msHandler);

        choice2 = new JButton("2) Royal");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(menuFont);
        choice2.setOpaque(true);
        choice2.setBorderPainted(false);
        choiceButtonPanel.add(choice2);
        choice2.addActionListener(msHandler);

        choice3 = new JButton("3) Weaver");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(menuFont);
        choice3.setOpaque(true);
        choice3.setBorderPainted(false);
        choiceButtonPanel.add(choice3);
        choice3.addActionListener(msHandler);

        choice4 = new JButton("4) Servant");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(menuFont);
        choice4.setOpaque(true);
        choice4.setBorderPainted(false);
        choiceButtonPanel.add(choice4);
        choice4.addActionListener(msHandler);

    }

    // what happens when you click the button
    public class WelcomeScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            createMenuScreen();

        }
    }

    public void displayStartingStats() {

        menuTextPanel.setVisible(false);
        choiceButtonPanel.setVisible(false);

        statsTextPanel = new JPanel();
        statsTextPanel.setBounds(100, 200, 600, 250);
        statsTextPanel.setBackground(Color.BLACK);

        statsTextArea = new JTextArea("Your choice was " + gS.getLifeChoice() +".\n" +
                "You will start with " + gS.getMoney() + " drachmas.\n" +
                "You will end the game with a multiplier of " + gS.getMultiplier() + " to your final score.");
        statsTextArea.setBounds(100, 100, 550, 250);
        statsTextArea.setBackground(Color.BLACK);
        statsTextArea.setForeground(Color.white);
        statsTextArea.setFont(menuFont);
        statsTextArea.setLineWrap(true);
        statsTextArea.setEditable(false);

        continueButtonPanel = new JPanel();
        continueButtonPanel.setBounds(300,400,200,100);
        continueButtonPanel.setBackground(Color.black);

        // button edits
        continueButton = new JButton("CONTINUE");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setOpaque(true);
        continueButton.setBorderPainted(false);
        continueButton.setFont(normalFont);
        continueButton.addActionListener(ctNext);

        continueButtonPanel.add(continueButton);
        con.add(continueButtonPanel);

        statsTextPanel.add(statsTextArea);
        con.add(statsTextPanel);

    }

    public class MenuScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == choice1) {

                gS.setLifeChoice("Olympian");
                gS.setMoney(100000);
                gS.setMultiplier(1);

            } else if (e.getSource() == choice2) {

                gS.setLifeChoice("Royal");
                gS.setMoney(1000);
                gS.setMultiplier(10);

            } else if (e.getSource() == choice3) {

                gS.setLifeChoice("Weaver");
                gS.setMoney(500);
                gS.setMultiplier(100);

            } else if (e.getSource() == choice4) {

                gS.setLifeChoice("Servant");
                gS.setMoney(250);
                gS.setMultiplier(1000);

            }
            displayStartingStats();

        }

    }

    public class ContinueToNext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            nameChoiceScreen();

        }

    }

    public void nameChoiceScreen() {

        statsTextPanel.setVisible(false);

        // name directions text area
        nameTextPanel = new JPanel();
        nameTextPanel.setBounds(100,100,600,250);
        nameTextPanel.setBackground(Color.black);

        // actual text directions
        nameTextArea = new JTextArea("Now, name your crew: \n\n1) \n\n2) \n\n3) \n\n4) \n\n5) ");
        nameTextArea.setBounds(100,100,550,250);
        nameTextArea.setBackground(Color.black);
        nameTextArea.setForeground(Color.white);
        nameTextArea.setFont(menuFont);
        nameTextArea.setOpaque(true);
        nameTextArea.setLineWrap(true);
        nameTextArea.setEditable(false);

        // creates name submissions panel
        /* nameAnswersPanel = new JPanel();
        nameAnswersPanel.setBounds(50,135,550,150);
        nameAnswersPanel.setBackground(Color.black); */ // changes the default layout here

        nameAnswerField = new JTextField(20);
        nameAnswerField.setBounds(300,150,550,250);
        nameAnswerField.setBackground(Color.blue);
        nameAnswerField.setForeground(Color.white);
        nameAnswerField.setFont(menuFont);
        nameAnswerField.setEditable(true);

        nameTextPanel.add(nameAnswerField);
        nameTextPanel.add(nameTextArea);
        con.add(nameTextPanel);

        //nameAnswersPanel.add(nameAnswerField);
        //con.add(nameAnswersPanel);




    }

}