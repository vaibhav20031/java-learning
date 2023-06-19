// 11111111111111111111111111111111111111111111111111111111111111111111111111111111111
// import java.applet.Applet;
// import java.awt.Graphics;
// public class applet extends Applet{
//     public void paint(Graphics g){
//         g.drawOval(60, 60, 200, 200);
//         g.drawOval(90,120,50,50);
//         g.drawOval(190,120,50,50);             ////note :DRAWING SMILY FACE 
//         g.drawLine(160,120,160,170);
//         g.drawArc(110,120,90,90,0,-180);
//         // g.drawString("radha vallabh shri hari vansh",100,200);
//     }
// }

import java.applet.Applet;      //note -applet has no main method instead has paint method
import java.awt.Graphics;
public class applet extends Applet{
    String s1 ,s2;
    public void init(){
        s1=getParameter("p1");
        s2=getParameter("p2");

    }
    public void paint(Graphics g){
        g.drawString(s1+s2,50,50);
    }
}

