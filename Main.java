import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setBounds(30, 30, 800, 600);

        window.getContentPane().add(new Domek());

        window.setVisible(true);
    }
}
