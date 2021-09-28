import de.wdilab.coma.integration.COMA_API;

import java.io.File;


public class Main {

    public static void main(String[] _args) throws Exception {
        // No need to explicitly create the Sqlite database. It will be created on connection. The beauty of an embedded database.

        System.out.println("Program arguments passed to the main method:");
        for (String arg : _args) {
            System.out.println("\n" + arg);
        }
        System.out.println("VM arguments (system properties) passed to the main method:");
        System.out.println("  inputFile1: " + System.getProperty("inputFile1"));
        System.out.println("  inputFile2: " + System.getProperty("inputFile2"));
        System.out.println("  outputFile: " + System.getProperty("outputFile"));
        System.out.println("  strategy: " + System.getProperty("strategy"));
        System.out.println("  maxN: " + System.getProperty("maxN"));
        System.out.println();

        COMA_API api = new COMA_API();

        api.matchModelsDefault(System.getProperty("inputFile1"),
                System.getProperty("inputFile2"),
                System.getProperty("outputFile"));

    }
}
