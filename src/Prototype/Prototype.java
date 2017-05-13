package Prototype;

public interface Prototype extends Cloneable {
    AccessControl clone() throws CloneNotSupportedException;
}
