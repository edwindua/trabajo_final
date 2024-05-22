package co.udec;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class carrera extends Thread {
  private JLabel moto;
    private JFrame frame;

    public carrera(JLabel moto, JFrame frame) {
        this.moto = moto;
        this.frame = frame;
    }

    @Override
    public void run() {
        try {
            // Movimiento hacia adelante
            while (moto.getLocation().x < frame.getWidth()) {
                moto.setLocation(moto.getLocation().x + 5, moto.getLocation().y);
                Thread.sleep(100); // Ajusta la velocidad del movimiento
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}