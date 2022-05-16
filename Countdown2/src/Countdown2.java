import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

    public class Countdown2 {
        public static void main(String[] args) {

            JFrame jframe = new JFrame();
            JLabel jLabel = new JLabel();
            jframe.setLayout(new FlowLayout());
            jframe.setBounds(550, 350, 200, 80);

            jframe.add(jLabel);
            jframe.setVisible(true);

            Timer timer = new Timer();

            timer.scheduleAtFixedRate(new TimerTask() {
                int i = 20;

                public void run() {

                    jLabel.setText("Tempo Restante: " + i);
                    i--;

                    if (i < 0) {
                        timer.cancel();
                        jLabel.setText("Pi pi pi! Pi pi pi! Pi pi pi!");
                    }
                }
            }, 0, 1000);
        }
    }


