package h07;

import java.util.Random;

/**
 * A simulated PowerPlant
 */
public class PowerPlant {

    final Log log;
    final Random random;

    final Reactor[] reactors;

    /**
     * Create a PowerPlant
     * @param log Log to use for Logging of PowerPlant
     * @param random Random Object
     * @param numOfReactors Number of Reactors in PowerPlant
     */
    public PowerPlant(Log log, Random random, int numOfReactors){
        this.log = log;
        this.random = random;

        reactors = new Reactor[numOfReactors];
        for(int i = 0; i < numOfReactors; i++){
            reactors[i] = Reactor.generate(i, random);
        }

    }

    /**
     * Create a random PowerPlant
     * @param log Log to use for Logging of PowerPlant
     * @param numOfReactors Number of Reactors in PowerPlant
     */
    public PowerPlant(Log log, int numOfReactors){
        this(log, new Random(), numOfReactors);
    }

    /**
     * Check the state of the PowerPlant and logs it
     * @param t Time variable
     */
    public void check(double t){
        // TODO H5
    }

}
