//java gui
import javax.swing.*;//swing
import java.awt.event.ActionEvent;//awt framework
import java.awt.event.ActionListener;//awt framework
import java.lang.Math;//math
import java.text.DecimalFormat;

public class Shuvo {//public class
    private JButton calButton;//  +
    private JTextField txt2;// input num1
    private JTextField txt3;// input num2

    private JTextField txt5;// show result
    public JPanel main1; // Gui panel
    private JButton c2Button;//  -
    private JButton button1;//...../...
    private JButton button2;// *
    private JTextField a1;// single input +
    private JButton sinButton;// sin
    private JButton cosButton;// cos
    private JButton xButton;// tan
    private JButton absButton;// abs
    private JButton logButton;// log//ln
    private JButton log10Button;// log10
    private JButton maxButton;// max
    private JButton minButton;// mini
    private JButton sqrtButton;// 2root
    private JButton powButton;// power ^
    private JButton ceilButton;// pi(auto)
    private JButton eButton;//e(auto)
    private JButton cbrtButton;// 3root
    private JButton hypotButton;//root x2+y2
    private JButton moreFunctionButton;
    private JButton clear;
    private JLabel txt6;
    private static DecimalFormat df = new DecimalFormat("0.0");
    private static DecimalFormat df1 = new DecimalFormat("0.000");
    public static JFrame frame;//globle

    public static void main(String[] args) {
        frame = new JFrame("Shuvo-04");
        frame.setContentPane(new Shuvo().main1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450,500);
       // frame.setResizable(false);
    }

    public Shuvo() {
        //+

        calButton.addActionListener(new ActionListener() {   //+
            @Override
            public void actionPerformed(ActionEvent e) {

                double m1,m2,t;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());

                t = m1+m2; //+
                txt5.setText(String.valueOf(t));

            }
        });
        //end

        //- start

        c2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2,t;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());

                t = m1-m2;
                txt5.setText(String.valueOf(t));

            }
        });
        //end

        //.. / start

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2,t;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());

                t = m1/m2;
                //condition for 1/0
                if(m2 ==0){
                    txt5.setText("Error");
                }
                else {
                    txt5.setText(String.valueOf(t));
                }

            }
        });
        //end

        // * start

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2,t;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());

                t = m1*m2;
                txt5.setText(String.valueOf(t));

            }
        });
        //end

        // sin radian

        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                txt5.setText(String.valueOf(df1.format(Math.sin(m3))));
            }
        });

        //cos radian

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                txt5.setText(String.valueOf(df1.format(Math.cos(m3))));
            }
        });
        //1/x

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3,a;
                m3 = Double.parseDouble(a1.getText());
                a = 1/m3;
                //condition to avoid - value
                if( m3 == 0){
                    txt5.setText("error");
                }
                else{
                    txt5.setText(String.valueOf(df1.format(a)));
                }

            }
        });

        //abs |-1|=1
        absButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Integer.parseInt(a1.getText());
                txt5.setText(String.valueOf(Math.abs(m3)));
            }
        });

        //log/ln
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                //condition to avoid - value
                if(m3<0 || m3==0){
                    txt5.setText("error");
                }
                else{
                    txt5.setText(String.valueOf(df1.format(Math.log(m3))));
                }


            }
        });

        //log10

        log10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                //condition to avoid - value
                if(m3<0 || m3 == 0){
                    txt5.setText("error");
                }
                else{
                    txt5.setText(String.valueOf(df1.format(Math.log10(m3))));
                }


            }
        });

        //max any 2 num

        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());
                txt5.setText(String.valueOf(Math.max(m1,m2)));
            }
        });

        //mini 2 num

        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());
                txt5.setText(String.valueOf(Math.min(m1,m2)));

            }
        });

        //sqrt 2 root num

        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                //condition to avoid - value
                if(m3<0){
                    txt5.setText("error");
                }
                else{
                    txt5.setText(String.valueOf(df1.format(Math.sqrt(m3))));
                }


            }
        });

        //power a^n type

        powButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());
                txt5.setText(String.valueOf(Math.pow(m1,m2)));//m1 = num,m2 = pow

            }
        });
        //PI auto shoe

        ceilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txt5.setText(String.valueOf(df1.format(Math.PI)));//show PI value

            }
        });
        //E auto

        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txt5.setText(String.valueOf(df1.format(Math.E)));// Show E value

            }
        });
        // 3 sqrt root

        cbrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
                //condition to avoid - value
                //ignore I complex
                if(m3<0){
                    txt5.setText("error");
                }
                else{
                    txt5.setText(String.valueOf(df1.format(Math.cbrt(m3))));
                }


            }
        });

        //hypoy root x2+y2

        hypotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m1,m2;

                m1 = Double.parseDouble(txt2.getText());
                m2 = Double.parseDouble(txt3.getText());
                txt5.setText(String.valueOf(df1.format(Math.hypot(m1,m2))));

            }
        });

        //clear

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == clear) {
                    a1.setText("");
                    txt5.setText("");
                    txt2.setText("");
                    txt3.setText("");
                }

            }
        });

        //more

        moreFunctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             frame.setContentPane(new allButton().c1);
             frame.show();
            }
        });


    }
}
