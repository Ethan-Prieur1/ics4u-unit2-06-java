/**
 * The Jet Class.
 *
 * @author Ethan Prieur
 * @version 1.0
 * @since 10-21-2022
 */

public class Jet1 extends Airplane {

    /**
     * MULTIPLIER constant.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Constructor.
     */
    public Jet1() {
        // super();
        // commented out until constructor has values.
    }

    /**
     * SetSpeed() Function.
     *
     * @param speed - Speed
     */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Accelerate Function.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }

}
