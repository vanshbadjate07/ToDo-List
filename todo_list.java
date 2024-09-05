import java.applet.*;
import java.awt.*;

/*<applet code="todo_list.class" width="1000"height="1000"> </applet>*/
public class todo_list extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 950, 500);
        g.setColor(Color.green);
        g.fillRect(0, 500, 950, 650);
        g.setColor(Color.gray);
        int a[] = { 142, 142, 166, 166 };
        int b[] = { 560, 512, 512, 560 };
        g.fillPolygon(a, b, 4);
        g.setColor(Color.yellow);
        int c[] = { 142, 142, 500, 500, 166, 166 };
        int d[] = { 512, 366, 366, 403, 403, 512 };
        g.fillPolygon(c, d, 6);
        g.setColor(Color.darkGray);
        int e[] = { 142, 137, 500, 500 };
        int f[] = { 366, 335, 335, 366 };
        g.fillPolygon(e, f, 4);
        // garage
        g.setColor(Color.white);
        int eg[] = { 166, 166, 500, 500 };
        int fg[] = { 560, 403, 403, 560 };
        g.fillPolygon(eg, fg, 4);
        g.setColor(Color.lightGray);
        g.drawRect(180, 415, 305, 20);
        g.drawRect(180, 455, 305, 20);
        g.drawRect(180, 495, 305, 20);
        g.drawRect(180, 535, 305, 20);
        // left roof
        int efg[] = { 354, 354, 522, 522 };
        int ffg[] = { 335, 245, 245, 335 };
        g.fillPolygon(efg, ffg, 4);
        g.setColor(Color.DARK_GRAY);
        int afg[] = { 336, 502, 522 };
        int agg[] = { 245, 193, 245 };
        g.fillPolygon(afg, agg, 3);
        g.setColor(Color.gray);
        int eqd[] = { 900, 900, 944, 935 };
        int fqd[] = { 357, 324, 324, 357 };
        g.fillPolygon(eqd, fqd, 4);
        g.setColor(Color.yellow);
        int eq1d[] = { 900, 900, 935, 935 };
        int fqd1[] = { 560, 357, 357, 560 };
        g.fillPolygon(eq1d, fqd1, 4);
        // right
        g.setColor(Color.gray);
        int aa[] = { 500, 500, 900, 900 };
        int ba[] = { 560, 512, 512, 560 };
        g.fillPolygon(aa, ba, 4);
        g.setColor(Color.YELLOW);
        int aaa[] = { 500, 500, 900, 900 };
        int baa[] = { 512, 337, 337, 512 };
        g.fillPolygon(aaa, baa, 4);
        g.setColor(Color.darkGray);
        int ed[] = { 500, 490, 910, 900 };
        int fd[] = { 337, 294, 294, 337 };
        g.fillPolygon(ed, fd, 4);
        g.setColor(Color.DARK_GRAY);
        int edd[] = { 520, 480, 693, 930, 880 };
        int fdd[] = { 245, 138, 100, 138, 183 };
        g.fillPolygon(edd, fdd, 5);
        g.setColor(Color.lightGray);
        int e5d[] = { 520, 520, 880, 880 };
        int f5d[] = { 294, 158, 158, 294 };
        g.fillPolygon(e5d, f5d, 4);
        g.setColor(Color.black);
        int e7d[] = { 540, 540, 660, 660 };
        int f7d[] = { 560, 374, 374, 560 };
        g.fillPolygon(e7d, f7d, 4);
        int e1d[] = { 720, 720, 870, 870 };
        int f1d[] = { 540, 384, 384, 540 };
        g.fillPolygon(e1d, f1d, 4);
        g.setColor(Color.white);
        int e3d[] = { 550, 550, 650, 650 };
        int f3d[] = { 550, 394, 394, 550 };
        g.fillPolygon(e3d, f3d, 4);
        int esd[] = { 730, 730, 860, 860 };
        int fsd[] = { 520, 404, 404, 520 };
        g.fillPolygon(esd, fsd, 4);
        g.setColor(Color.black);
        g.drawRect(560, 398, 20, 145);
        g.drawRect(590, 398, 20, 145);
        g.drawRect(620, 398, 20, 145);
        g.drawRect(745, 410, 20, 103);
        g.drawRect(785, 410, 20, 103);
        g.drawRect(825, 410, 20, 103);
        g.fillRect(700, 337, 2, 223);
        g.fillRect(900, 337, 2, 223);
        g.fillRect(500, 337, 2, 223);
        g.fillRect(520, 155, 2, 140);
        g.fillRect(880, 155, 2, 140);
        // Door & Window of 1st floor 
        g.fillRect(570, 180, 60, 100); 
        g.fillRect(670, 180, 60, 100); 
        g.fillRect(770, 180, 60, 100); 
        g.fillRect(390, 265, 60, 70);
        // tree
        g.setColor(new Color(96, 25, 25));
        int tre[] = { 30, 40, 50, 60 };
        int tree[] = { 550, 400, 400, 550 };
        g.fillPolygon(tre, tree, 4);
        g.setColor(new Color(20, 112, 50));

        g.fillArc(-10, 350, 120, 80, 0, 360);
        g.fillArc(-10, 320, 130, 80, 0, 360);
        g.fillArc(-10, 290, 110, 100, 0, 360);
        g.fillArc(0, 260, 60, 90, 0, 360);
    }
}