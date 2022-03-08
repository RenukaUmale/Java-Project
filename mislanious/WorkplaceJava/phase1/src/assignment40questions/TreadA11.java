package assignment40questions;
import java.io.*; 
import java.util.*; 
class TreadA11 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class TreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    TreadA11  sender; 
    TreadedSend(String m,  TreadA11 obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
        TreadA11 snd = new TreadA11(); 
        TreadedSend S1 = 
            new TreadedSend( " Hi " , snd ); 
        TreadedSend S2 = 
            new TreadedSend( " Bye " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 

