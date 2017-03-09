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
        int i=0;
        int j=1;
        Boredom b = new Boredom();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        while(i!=j){
        Thread.sleep(1000);
        String bb="20:21:00";
        Date a= new Date();       
        String datee= dateFormat.format(a);
        System.out.println(datee);
        if(datee.compareTo(bb)==0){
        System.out.println("Yaay");
          Toolkit.getDefaultToolkit().beep();
          Runtime.getRuntime().exec("cmd /c start chrome.exe https://mail.google.com/mail/u/0/#inbox?compose=15aae6072fc45aa7");
          Thread.sleep(15000);
          Robot r = new Robot();
          r.keyPress(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);
          Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=sDKPtObKlcw?vq=medium");
          Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=jG7dSXcfVqE?vq=hd720");
          Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=DxphJ-dnX2Y?vq=hd720");
          Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=AORsw8NpN4E?vq=hd720");
          Runtime.getRuntime().exec("cmd /c start chrome.exe www.youtube.com/watch?v=mwAoDLyJaZ4?vq=hd720");
          break;
        }
        }
        }
    }
    
     
