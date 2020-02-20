package com.construction.house;
import java.awt.*;
import java.applet.*;
/*<applet code="HouseConstruction" width=400 height=200>
</applet>*/
import java.awt.event.ActionListener;
public class App extends Applet implements ActionListener
{
double sm,asm,hsm,fhsm,c;
Label l1;
Button b1,b2,b3,b4;
TextField t1;
public void init()
{
setBackground(Color.white);
setForeground(Color.black);
Label l1=new Label("Total Area of house");
TextField t1=new TextField(10);
add(l1);
add(t1);
b1=new Button("STANDARD MATERIAL");
add(b1);
b1.addActionListener(this);
b2=new Button("ABOVE STANDARD MATERIAL");
add(b2);
b2.addActionListener(this);
b3=new Button("HIGH STANDARD MATERIAL");
add(b3);
b3.addActionListener(this);
b4=new Button("FULLY STANDARD & AUTOMATED");
add(b4);
b4.addActionListener(this);
}
public  void actionPerformed(ActionEvent e)
{
double area=Double.parseDouble(t1.getText().trim());
                  double squarefeet=area/10.764;
String action = e.getActionCommand();
if(action.equals("STANDARD MATERIAL"))
sm=(1200*squarefeet);
else if(action.equals("ABOVE STANDARD MATERIAL"))
asm=(1500*squarefeet);
else if(action.equals("HIGH STANDARD MATERIAL"))
hsm=(1800*squarefeet);
else if(action.equals("HIGH STANDARD & FULLY AUTOMATED"))
fhsm=(2500*squarefeet);

repaint();

}
public void paint(Graphics g)
                 {
                      Font font=new Font("Constantia",Font.ITALIC,30);
                      g.setFont(font);
                      g.drawString("The Construction cost for Standard Material is:  "+sm,40,100);
                      g.drawString("The Construction cost for Above Standard Material is:  "+asm,100,160);
                      g.drawString("The Construction cost for High Standard Material is:  "+hsm,40,100);
                      g.drawString("The Construction cost for High Standard & Fully Automated Material is:  "+fhsm,40,100);
}
}





