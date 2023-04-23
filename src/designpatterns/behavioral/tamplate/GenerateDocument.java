package designpatterns.behavioral.tamplate;

import java.io.File;
import java.io.IOException;

public abstract class GenerateDocument {

  protected final String fileName;
  protected final String path;
  private File file;


  protected GenerateDocument(String fileName, String path) {
    this.fileName = fileName;
    this.path = path;
  }

  protected abstract void reserveFileNameFromOS();

  protected abstract void reserveMemory();

  public final boolean createTheFile() throws IOException {
    file = new File(path + fileName);
    return file.createNewFile();
  }

  private void log(){
    System.out.println(file.getName() + " file is created");
  }

  private void error(){
    System.out.println("A problem occurred during file creation!!!");
  }

  protected void createDocument(){
    try {
      reserveFileNameFromOS();
      reserveMemory();
      if(createTheFile())
        log();
      else
        error();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
