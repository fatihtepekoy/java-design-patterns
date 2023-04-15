package proxy;

public class PresidentOffice {

  private President president;

  public void setPresident(President president) {
    this.president = president;
  }

  public President meetWithThePresident(){
    return president;
  }

}
