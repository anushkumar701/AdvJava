package Exceptions;

public class TransactionFailed extends Exception {
    public TransactionFailed(String reason) {
        super(reason);
    }
}

class GlassBroken extends RuntimeException {
    public GlassBroken(String reason) {
        super(reason);
    }
}

