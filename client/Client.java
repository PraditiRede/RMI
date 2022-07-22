// package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
   public static void main(String[] args) {
      try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
            Hello h1 = (Hello) registry.lookup("h1");
            String h2 = h1.say();
            System.out.println(h2);
      } catch (Exception e) {
         System.out.println("Client:" + e);
      }
   }
}