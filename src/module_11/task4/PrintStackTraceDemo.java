package module_11.task4;

import java.io.IOException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class PrintStackTraceDemo{
    public static void main(){
        try{
            x();
        }
        catch (IOException ioe){ //this way of stack trace output is workaround for moodle
           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
           PrintStream ps = new PrintStream(byteArrayOutputStream);
           ioe.printStackTrace(ps);
           System.out.println(byteArrayOutputStream);
        }
    }
   
    public static void m() throws IOException{
        throw new IOException();
    }

   static void x() throws IOException   {
      a();
   }

   static void a() throws IOException   {
      m();
   }
}


// We have this part of stack trace that was generated in PrintStackTraceDemo class:
// java.io.IOException
//      PrintStackTraceDemo.t(__tester__.java:19)
//      PrintStackTraceDemo.m(__tester__.java:27)
//      PrintStackTraceDemo.a(__tester__.java:23)
//      PrintStackTraceDemo.x(__tester__.java:8)