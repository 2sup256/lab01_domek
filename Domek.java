import javax.swing.*;
import java.awt.*;

public class Domek extends JComponent {

    public static final Color CRED = new Color(255, 0, 0);
    public static final Color CYELLOW = new Color(213, 154, 0);
    public static final Color CSKY = new Color(166, 241, 255);
    public static final Color CGROUND = new Color(17, 171, 0);
    public static final Color CTREE = new Color(8, 87, 0);
    public static final Color CTREEHANDLE = new Color(114, 40, 0);
    public static final Color CSUN = new Color(255, 221, 0);
    public static final Color CWINDOWFRAME = new Color(101, 33, 0);
    public static final Color CWINDOWINSIDE = new Color(76, 255, 226);
    public static final Color CDOOR = new Color(108, 25, 0);
    public static final Color CCHMINEY = new Color(136, 0, 0);
    public static final Color CHANDLE = new Color(0, 0, 0);
    public static final Color CSTONE = new Color(91, 91, 91);
    public static final Color CSMOKE = new Color(148, 148, 148);

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // #Tło
        g2.setColor(CSKY);
        g2.fillRect(0, 0, 800, 350);
        g2.setColor(CGROUND);
        g2.fillRect(0, 350, 800, 250);

        g2.setColor(CSTONE);
        int[] groundX = {220, 300, 360, 440};
        int[] groundY = {600, 450, 450, 600};
        g2.fillPolygon(groundX, groundY, 4);



        // #Domek
        g2.setColor(CYELLOW);
        g2.fillRect(100, 250, 300, 220);

        // Komin
        // Dym
        g2.setColor(CSMOKE);
        int offX = 312;
        int offY = -10;
        int[] smokeX = {10, 25, 15, 50, 80, 100, 70, 60, 20};
        int[] smokeY = {100, 80, 40, 20, 10, 40, 50, 80, 120};
        for (int i = 0; i < smokeX.length; i++) smokeX[i] += offX;
        for (int i = 0; i < smokeY.length; i++) smokeY[i] += offY;

        g2.fillPolygon(smokeX, smokeY, 9);

        // Komin
        g2.setColor(CCHMINEY);
        g2.fillRect(320, 100, 35, 100);
        g2.fillRect(310, 90, 55, 14);

        // Dach
        g2.setColor(CRED);
        int[] dachX = {70, 250, 430};
        int[] dachY = {250, 80, 250};
        g2.fillPolygon(dachX, dachY, 3);

        // Okno
        g2.setColor(CWINDOWFRAME);
        g2.fillRect(150, 320, 80, 80);

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                g2.setColor(CWINDOWINSIDE);
                g2.fillRect(150 + (x * 35) + 7, 320 + (y * 35) + 7, 30, 30);
            }
        }

        // Drzwi
        g2.setColor(CDOOR);
        g2.fillRect(290, 320, 80, 140);
        g2.setColor(CHANDLE);
        g2.fillRect(350, 390, 14, 5);

        // Okienko
        g2.setColor(CWINDOWINSIDE);
        g2.fillArc(318, 340, 24, 24, 0, 180);

        g2.setColor(CWINDOWINSIDE);
        g2.fillRect(319, 352, 23, 24);





        // #Choinka
        // pien
        g2.setColor(CTREEHANDLE);
        g2.fillRect(585, 400, 30, 50);

        // igly
        g2.setColor(CTREE);
        int[] treeX = {540, 600, 660};
        int[] treeY = {260, 200, 260};
        g2.fillPolygon(treeX, treeY, 3);
        int[] tree2X = {520, 600, 680};
        int[] tree2Y = {330, 230, 330};
        g2.fillPolygon(tree2X, tree2Y, 3);
        int[] tree3X = {500, 600, 700};
        int[] tree3Y = {400, 300, 400};
        g2.fillPolygon(tree3X, tree3Y, 3);






        // Slonce
        g2.setColor(CSUN);
        g2.fillOval(650, 40, 50, 50);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(675, 65, 600, 120);
        g2.drawLine(675, 65, 580, 40);
        g2.drawLine(675, 65, 760, 30);
        g2.drawLine(675, 65, 760, 110);
        g2.drawLine(675, 65, 680, 140);
        g2.drawLine(675, 65, 670, 8);
    }

}
