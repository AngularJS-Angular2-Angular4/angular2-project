package com.centurylink.pctl.mod.core.camel;

public class CamelException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -8422433284212013952L;

    private String node;

    private Throwable sourceException;

    public CamelException(String error) {
        super(error);
    }

    public CamelException(String error, Throwable th) {
        super(error, th);
    }

    public CamelException(Throwable th, String node) {
        super(th);
        this.node = node;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Throwable getSourceException() {
        return sourceException;
    }

    public void setSourceException(Throwable sourceException) {
        this.sourceException = sourceException;
    }

}

