package h07;

import java.util.Random;


/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * String for testing H2.2
     */
    private final static String TEST_STRING = "FOP for president!";


//    /**
//     *
//     * @return normal implementation of {@link  MapExpression}
//     */
//    public static MapExpression testNormal(){
//        // TODO H2.2
//    }


//    /**
//     *
//     * @return anonymous implementation of {@link  MapExpression}
//     */
//    public static MapExpression testAnonymous(){
//        // TODO H2.2
//    }

//    /**
//     *
//     * @return lambda implementation of {@link  MapExpression}
//     */
//    public static MapExpression testLambda(){
//        // TODO H2.2
//    }


//    /**
//     *
//     * @return shortcut for lambda of {@link  MapExpression} using method reference
//     */
//    public static MapExpression testMethodReference(){
//        // TODO H2.2
//    }


    /**
     * Method to test H2.2
     */
    private static void test_h22(){
//        System.out.println("H2.2: ");
//        System.out.println(testNormal().map(TEST_STRING));
//        System.out.println(testAnonymous().map(TEST_STRING));
//        System.out.println(testLambda().map(TEST_STRING));
//        System.out.println(testMethodReference().map(TEST_STRING));
//        System.out.println();
    }

    /**
     * Method to test H4
     * @throws InterruptedException Exception can be thrown by sleeping thread
     */
    private static void test_h4() throws InterruptedException {
//        System.out.println("H4:");
//        Log log = new NormalLog(); //new MaintenanceLog();
//        log.log(1, "Hallo FoPler!");
//        log.log(6, "Error: Code 6 received!");
//        log.log(3, "Warnung: Diese Uebung ist hiermit beendet\nOver and out!");
//
//
//        PowerPlant powerPlant = new PowerPlant(log, new Random(42), 10);
//
//        for(int i = 0; i < 10; i++){
//            powerPlant.check(i / 100.0);
//            Thread.sleep(1500);
//        }
    }


    /**
     * Method to test H5
     * @throws InterruptedException Exception can be thrown by sleeping thread
     */
    private static void test_h5() throws InterruptedException {
//        System.out.println("H5:");
//        Log log = new NormalLog(); //new MaintenanceLog();
//        PowerPlant powerPlant = new PowerPlant(log, new Random(42), 10);
//
//        for(int i = 0; i < 10; i++){
//            powerPlant.check(i / 100.0);
//            Thread.sleep(1500);
//        }
    }


    /**
     * Entry Point
     * @param args Parameter
     * @throws InterruptedException Exception for sleeping Thread
     */
    public static void main(String[] args) throws InterruptedException {
        test_h22();
        test_h4();
        test_h5();
    }
}
