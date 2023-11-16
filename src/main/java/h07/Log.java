package h07;

import h07.tree.*;

/**
 * Class abstracting a Logging Engine as expression tree
 */
public abstract class Log {
    protected static final char ANSI_ESCAPE = 0x1b;
    protected static final String ANSI_RESET = "[0m";
    protected static final String ANSI_BLUE = "[34m";
    protected static final String ANSI_YELLOW = "[33m";
    protected static final String ANSI_RED = "[31m";


//    /**
//     * Creates a lambda expression given a color code
//     * @param ansiColor ANSI Color Code
//     * @return a {@link MapExpression} which can be used to color a {@link String} in the color
//     */
//    public static MapExpression createColorExpression(String ansiColor){
//        // TODO 4.1
//    }


    private final Node rootNode;
    protected String message;
    protected int level;

    /**
     * Constructs a new log
     */
    public Log(){
        rootNode = generateTree();
    }

    /**
     * Used to generate the formatter tree of the log
     * @return the root of zhe expression tree
     */
    abstract protected Node generateTree();


    /**
     * Use the expression tree for formatting
     * @param level level of message
     * @param message message
     * @return a formatted {@link  String}
     */
    private String format(int level, String message){
        // TODO H4.2
        throw new RuntimeException("TODO H4.2");
    }

    /**
     * Prints a log message to console
     * @param level level of message
     * @param message message
     */
    public void log(int level, String message){
        System.out.print(format(level, message));
    }
}
