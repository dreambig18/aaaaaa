import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filec {
public static void main(String[] args) {
Filec inputFile = new File("C:\\Exp\\input.txt");
Filec outputFile = new File("C:\\Exp\\output.txt");
FileReader ins = null; //ins is a reference variable 
FileWriter outs = null; // outs is a reference variable
try { 
 ins = new FileReader(inputFile); 
 outs = new FileWriter(outputFile);  
 int ch; 
 while ((ch = ins.read()) != -1) {

 outs.write(ch); 
 } 
 } 
catch (IOException e) { 
 e.printStackTrace(); 
 System.exit(-1); 
 } 
finally { // resource clean up block
 try { 
 ins.close(); 
 outs.close(); 
 } 
 catch (IOException e) {
 
 } 
 }
}
}