import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BMI_p1 {
    private JTextField f1;
    private JTextField f3;
    private JTextField f4;
    private JTextField f5;
    private JTextField f6;
    private JButton b1;
    private JTextField f2;
    private JTextArea bmiTextArea;
    private JLabel t1;
   private JLabel t2;
    private JLabel t3;
    private JLabel t4;
   private JLabel t5;
    public JPanel main4;
    private JButton button1;
    private JButton cButton;
    private static DecimalFormat df = new DecimalFormat("0.00");

//bmi


    public BMI_p1() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,c,d,q,w,x1,x2,x3,x4;
                a = Double.parseDouble(f1.getText());
                b = Double.parseDouble(f2.getText());
                c = Double.parseDouble(f3.getText());
                x1 = (a*12) + b;
                x2 = x1*2.54;
                x3 = x2/100;
             //bmi
                d= (c / (x3 * x3));
                f4.setText(String.valueOf(df.format(d)));
               //bmi last
                //con s

                if(d<18.5)
                {
                    f5.setText("Under weight");
                }
                else if(d >= 18.5 &&d <= 24.99)
                {
                    f5.setText("Normal");
                }
                else if(d >= 25.00 &&d <= 29.99)
                {
                    f5.setText("Over weight");
                }
                else if(d >= 30.00 &&d <= 34.99)
                {
                    f5.setText("Obesity Grade I");
                }
                else if(d >= 39.00 &&d <= 39.99)
                {
                    f5.setText("Obesity Grade II");
                }
                else if(d >= 40.00)
                {
                    f5.setText("Obesity Grade III (Danger)");
                }
                //end
                // health rix
                if(d<18.5)
                {
                    f6.setText("Possible nutritional deficiency and osteoporosis.");
                }
                else if(d >= 18.5 &&d <= 24.99)
                {
                    f6.setText("Low risk (healthy range).");
                }
                else if(d >= 25.00 &&d <= 29.99)
                {
                    f6.setText("Moderate risk of developing heart disease, high blood pressure, stroke, diabetes mellitus.");
                }
                else if(d >= 30.00 &&d <= 34.99)
                {
                    f6.setText("High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic Syndrome.");
                }
                else if(d >= 39.00 &&d <= 39.99)
                {
                    f6.setText("High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic Syndrome.");
                }
                else if(d >= 40.00)
                {
                    f6.setText("High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic Syndrome.");
                }



            }
        });
        //previous
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new allButton().c1);
                Shuvo.frame.show();
            }
        });


        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == cButton) {
                    f1.setText("");
                    f2.setText("");
                    f3.setText("");
                    f4.setText("");
                    f5.setText("");
                    f6.setText("");

                }

            }
        });
    }
}
