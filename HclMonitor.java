// importing the FileReader class
import java.io.FileReader;

class HclMonitor {
  public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("c:\\Javatest1\\Mujtaba.txt");

      // Reads characters
      input.read(array);
      System.out.println("This is created by developer Mujtaba:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
