package es.upm.dit.adsw.ej1;

import java.awt.*;

/**
 * Crosshair. Composicion de 2 lineas.
 *
 * @author jam
 * @version 30.1.2015
 */
public class Crosshair
        implements Thing {
    private final Thing[] things;

    public Crosshair(int x, int y, int r, Color color) {
        things = new Thing[2];
        things[0] = new Line(x - r, y, x + r, y, color);
        things[1] = new Line(x, y - r, x, y + r, color);
    }

    @Override
    public void paint(Graphics2D g) {
        for (Thing thing : things)
            thing.paint(g);
    }
}
