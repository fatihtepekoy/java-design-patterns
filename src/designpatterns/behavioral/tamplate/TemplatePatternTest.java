package designpatterns.behavioral.tamplate;

public class TemplatePatternTest {

  public static void main(String[] args) {
    GenerateDocument generateDocument = new GenerateExcelFile("planExcel", "D:\\");
    generateDocument.createDocument();
  }

}
