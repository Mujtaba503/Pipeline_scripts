// importing the File class
import java.io.File;

class HclUATProj {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("c:\\Javatest1\\Mujtaba.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
