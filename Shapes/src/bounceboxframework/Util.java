/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceboxframework;

/**
 *
 * @author p0073862
 */
public class Util {

    public static double dotprod(double x1, double y1, double x2, double y2) {
        return x1 * x2 + y1 * y2;
    }

    public static double mag(double x, double y) {
        return Math.sqrt(x * x + y * y);

    }

}
