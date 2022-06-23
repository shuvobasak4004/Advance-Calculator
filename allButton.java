import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class allButton {
    private JButton previousButton;
    private JButton morseButton;
    private JButton Advance;
    private JButton BMIButton;
    public JPanel c1;//public
    private JButton advance;


    public allButton() {
        previousButton.addActionListener(new ActionListener() {//previous for main calculator//
            @Override
            public void actionPerformed(ActionEvent e) {
            Shuvo.frame.setContentPane(new Shuvo().main1);
            Shuvo.frame.show();
            }
        });

            //morse
        morseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new MorseC().main2);
                Shuvo.frame.show();

            }
        });
        //bmi
        BMIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new BMI_p1().main4);
                Shuvo.frame.show();
            }
        });


        advance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new calclulator4().main6);
                Shuvo.frame.show();


            }
        });
    }
}
