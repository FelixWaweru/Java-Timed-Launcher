/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boredom;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;

public class Boredom {
    
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        //variables that will be used to create an infinite loop
        int i=0;
        int j=1;
        //the format that the current date/time will be coverted to
        //add yyyy/MM/dd to the HH:mm:ss to include year month and day
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //infinite loop is instantiated
        while(i!=j){
            //one second delay to countdown the time in seconds
            Thread.sleep(1000);
            //user defined countdown time
            String bb="12:20:00";
            //current time is recorded
            Date a= new Date();
            //date is converted into a string format similar to the one that is input by the user
            String datee= dateFormat.format(a);
            System.out.println(datee);
            //conditional statement to compare current time to user defined countdown time
               if(datee.compareTo(bb)==0){
               System.out.println("Yaay");
               //Mailing function that will send email to notify one of the function beginning
                 Runtime.getRuntime().exec("cmd /c start chrome.exe https://mail.google.com/mail/u/0/#inbox?compose");
                 Thread.sleep(15000);
                 //robot function that will simulate the pressing of the enter button to send the email
                 Robot r = new Robot();
                 r.keyPress(KeyEvent.VK_ENTER);
                 r.keyRelease(KeyEvent.VK_ENTER);
                 //series of applications and what they will do is instantiated
                 Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=sDKPtObKlcw?vq=medium");
                 Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=jG7dSXcfVqE?vq=hd720");
                 //loop breaks
                 break;
               }
        }
      }
    }
    
     
