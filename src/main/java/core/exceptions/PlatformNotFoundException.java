package core.exceptions;

/**
 * @author Rajesh
 */
public class PlatformNotFoundException extends Exception {

    public PlatformNotFoundException()
    {super("Platform you provided is not available. Please provide Android, ios or mweb");}

}
