package designpatterns.behavioral.tamplate;

public class GenerateExcelFile extends GenerateDocument {

  public GenerateExcelFile(String fileName, String path) {
    super(fileName, path);
  }

  @Override
  protected void reserveFileNameFromOS() {
    System.out.println(fileName + " is reserved in the path " + path);
  }

  @Override
  protected void reserveMemory() {
    System.out.println("Memory reserved");
  }
}
