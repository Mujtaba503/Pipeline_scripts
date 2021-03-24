// importing the FileWriter class
import java.io.FileWriter;

 class HclDeployProj {
   public static void main(String args[]) {

     String data = "This is created by developer Mujtaba ";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("c:\\Javatest1\\Mujtaba.txt");

       // Writes string to the file
       output.write(data);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}
