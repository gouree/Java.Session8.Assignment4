import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
	 public static void main(String[] args) 
	 {
		 //inputstream and outputstream objects
	      FileInputStream ins = null;
	      FileOutputStream outs = null;
	      
	      try
	      {
	    	 //input file -->abc.txt
	         File infile =new File("C:\\Users\\omsai\\Desktop\\abc.txt");
	         
	         //output file -->outfile
	         File outfile =new File("C:\\Users\\omsai\\Desktop\\copy.txt");
	         
	         ins = new FileInputStream(infile);
	         outs = new FileOutputStream(outfile);
	         
	         byte[] buffer = new byte[1024];
	         int length;
	         
	         //copy contents of inputfile to output file
	         while ((length = ins.read(buffer)) > 0) {
	            outs.write(buffer, 0, length);
	         } 
	         
	         //close input and output files
	         ins.close();
	         outs.close();
	         
	         
	         System.out.println("File copied successfully!!");
	      } 
	      
	      catch(IOException ioe) 
	      {
	         ioe.printStackTrace();
	      } 
	   }
}

