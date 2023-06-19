import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AnalogClock extends JFrame implements Runnable {
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";

    public AnalogClock() {
        setTitle("analog Clock ");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) hours -= 12;
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                repaint();
                Thread.sleep(1000);  // update every second
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        g.drawString(timeString, 50, 50);

        g.setColor(Color.blue);
        g.fillOval(90, 90, 10, 10);  // center point

        g.setColor(Color.black);
        g.drawOval(85, 85, 100, 100);  // outer circle
        g.drawOval(95, 95, 80, 80);    // inner circle

        // draw hour hand
        g.setColor(Color.green);
        int hourAngle = (int) (0.5 * (60 * hours + minutes));
        int hourX = (int) (50 * Math.cos(Math.toRadians(hourAngle - 90))) + 100;
        int hourY = (int) (50 * Math.sin(Math.toRadians(hourAngle - 90))) + 100;
        g.drawLine(100, 100, hourX, hourY);

        // draw minute hand
        g.setColor(Color.red);
        int minuteAngle = (int) (6 * minutes);
        int minuteX = (int) (60 * Math.cos(Math.toRadians(minuteAngle - 90))) + 100;
        int minuteY = (int) (60 * Math.sin(Math.toRadians(minuteAngle - 90))) + 100;
        g.drawLine(100, 100, minuteX, minuteY);

        // draw second hand
        g.setColor(Color.black);
        int secondAngle = (int) (6 * seconds);
        int secondX = (int) (70 * Math.cos(Math.toRadians(secondAngle - 90))) + 100;
        int secondY = (int) (70 * Math.sin(Math.toRadians(secondAngle - 90))) + 100;
        g.drawLine(100, 100, secondX, secondY);
    }

    public static void main(String[] args) {
        System.out.println("vaibhav aggarwal clock ");
        AnalogClock clock = new AnalogClock();
        clock.start();
    }
}
