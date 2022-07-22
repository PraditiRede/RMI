// package server;
import java.rmi.*;
import java.rmi.server.*;


public class HelloImpl implements Hello {
    // Define attributes and implement all the methods defined in product interface.

    // Define attributes.
    public String message;

    // Parametrized constructor.
    public HelloImpl(String msg) throws RemoteException {
        this.message = msg;
    }
    public String say() throws RemoteException {
        return this.message;
    }
    
}