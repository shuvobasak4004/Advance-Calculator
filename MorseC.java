import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MorseC {
    private JButton calButton;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    public JPanel main2;
    private JButton previousButton;
    private JButton c;
    //private JLabel txt6;

//morse

    public MorseC() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,t;


                m1 = Integer.parseInt(txt2.getText());//65-90

                t = m1;

                 if(t==65){
                     txt5.setText(" A =  .- ");
                 }
                else if(t==66){
                    txt5.setText(" B =  -... ");
                }
                 else if(t==67){
                     txt5.setText(" C =  -.-. ");
                 }
                 else if(t==68){
                     txt5.setText(" D =  -.. ");
                 }
                 else if(t==69){
                     txt5.setText(" E =  . ");
                 }
                 else if(t==70){
                     txt5.setText(" F =  ..-. ");
                 }
                 else if(t==71){
                     txt5.setText(" G =  --. ");
                 }
                 else if(t==72){
                     txt5.setText(" H =  .... ");
                 }
                 else if(t==73){
                     txt5.setText(" I =  .. ");
                 }
                 else if(t==74){
                     txt5.setText(" J =  .--- ");
                 }
                 else if(t==75){
                     txt5.setText(" K =  -.- ");
                 }
                 else if(t==76){
                     txt5.setText(" L =  .-.. ");
                 }
                 else if(t==77){
                     txt5.setText(" M =  -- ");
                 }
                 else if(t==78){
                     txt5.setText(" N =  -. ");
                 }
                 else if(t==79){
                     txt5.setText(" O =  --- ");
                 }
                 else if(t== 80){
                     txt5.setText(" P =  .--. ");
                 }
                 else if(t== 81){
                     txt5.setText(" Q =  --.- ");
                 }
                 else if(t== 82){
                     txt5.setText(" R =  .-. ");
                 }
                 else if(t== 83){
                     txt5.setText(" S =  ... ");
                 }
                 else if(t== 84){
                     txt5.setText(" T =  - ");
                 }
                 else if(t== 85){
                     txt5.setText(" U =  ..- ");
                 }
                 else if(t== 86){
                     txt5.setText(" V =  ...- ");
                 }
                 else if(t== 87){
                     txt5.setText(" W =  .-- ");
                 }
                 else if(t== 88){
                     txt5.setText(" X =  -..- ");
                 }
                 else if(t== 89){
                     txt5.setText(" Y =  -.-- ");
                 }
                 else if(t== 90){
                     txt5.setText(" Z =  --.. ");
                 }
                 else if(t >= 'a'&& t<='z'||t >= 'A'&& t<='Z'){
                     txt5.setText(" Wrong input ");
                 }

                 else
                 {
                     txt5.setText("Wrong input ");
                 }






            }
        });//connect p2 main button
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shuvo.frame.setContentPane(new allButton().c1);
                Shuvo.frame.show();
            }
        });

        //clear
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == c) {

                    txt5.setText("");
                    txt2.setText("");

                }

            }
        });
    }
}
