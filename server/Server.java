// package server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject; 

public class Server {
	public static void main(String [] args) {
		try {

			System.out.println("Server is booting....");
			System.setProperty("java.rmi.server.hostname","127.0.0.1"); 
            HelloImpl p1 = new HelloImpl("Hello, world!"); 
            // Hello stub1 = (Hello) UnicastRemoteObject.exportObject(p1, 0);
			Hello stub1 = (Hello) UnicastRemoteObject.exportObject(p1,0);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
            registry.rebind("h1", stub1);

		} catch (Exception e) {
			System.out.println("Server:" + e);
		}
	}
}