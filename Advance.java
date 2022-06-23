    //java gui
import javax.swing.*;//swing
import java.awt.event.ActionEvent;//awt framework
import java.awt.event.ActionListener;//awt framework
import java.lang.Math;//math
import java.text.DecimalFormat;

    public class Advance {//public class
    private JTextField txt5;// show result
    public JPanel main5; // Gui panel
    private JButton clear;//...../...
    private JTextField a1;// single input +
    private JButton sinButton;// sin
    private JButton cosButton;// cos
    private JButton absButton;// abs
    private JButton logButton;// log//ln
    private JButton log10Button;// log10
    private JButton sqrtButton;// 2root
    private JButton ceilButton;// pi(auto)
    private JButton eButton;//e(auto)
    private JButton cbrtButton;// 3root
    private JButton moreFunctionButton;
    private JButton xhalf;
    private JLabel txt6;
    public static JFrame frame;//globle
        private static DecimalFormat df = new DecimalFormat("0.0000");
        private static DecimalFormat df1 = new DecimalFormat("0.000");

//ad sincos
/*
        public static void main(String[] args) {
        frame = new JFrame("Shuvo-04");
        frame.setContentPane(new Advance().main5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setSize(600,600);
       // frame.setResizable(false);
    }*/

    public Advance() {

        // sin
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double c,d,f,m3;
                m3 = Double.parseDouble(a1.getText());
               // c = 3.1416/180.0;
               // d= Double.parseDouble(df.format(m3*c));

               // f= Double.parseDouble(df.format(Math.sin(d)));
               // txt5.setText(String.valueOf(df.format(Math.sin(f))));

                if(m3 == 30)
                {
                   c = Math.sin(Math.toRadians(m3)) + 0.0000000000000001;
                    txt5.setText(String.valueOf(c));

                }
                else
                {
                    c = Math.sin(Math.toRadians(m3));
                    txt5.setText(String.valueOf(df.format(c)));
                }
            }
        });
        //cos radian
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double c,d,f,m3;
                m3 = Double.parseDouble(a1.getText());
               // c = 3.1416/180.0;
                //d= Double.parseDouble(df.format(m3*c));
                //f= Double.parseDouble(df.format(Math.cos(d)));
               // txt5.setText(String.valueOf(df.format(Math.cos(f))));

                if(m3 == 60)
                {
                    c = Math.cos(Math.toRadians(m3)) - 0.0000000000000001;
                    txt5.setText(String.valueOf(c));
                }
                else if (m3 == 90)
                {
                   c = 0;
                    txt5.setText(String.valueOf(c));
                }
                else
                {
                    c = Math.cos(Math.toRadians(m3));
                    txt5.setText(String.valueOf(df.format(c)));
                }
            }
        });

        //abs |-1|=1
        absButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m3;
                m3 = Double.parseDouble(a1.getText());
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

        //more
        moreFunctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new calclulator4().main6);
                Shuvo.frame.show();
            }
        });

        //clear
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == clear) {
                    a1.setText("");
                    txt5.setText("");
                }

            }
        });

        xhalf.addActionListener(new ActionListener() {
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
    }
}
