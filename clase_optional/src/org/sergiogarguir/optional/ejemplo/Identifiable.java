package org.sergiogarguir.optional.ejemplo;

public interface Identifiable <T>{
    public abstract T getId();
    public abstract void setId(T x);
    public abstract boolean sameId(T anotherID);
}
