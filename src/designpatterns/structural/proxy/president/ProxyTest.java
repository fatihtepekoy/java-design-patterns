package designpatterns.structural.proxy.president;

public class ProxyTest {

  public static void main(String[] args) {
    // We placed proxy president to the office,
    PresidentOffice presidentOffice = new PresidentOffice();
    presidentOffice.setPresident(new ProxyPresident());

    Citizen citizen = new Citizen();
    citizen.setProblem("food");
    citizen.setJob("teacher");

    // all citizens will meet the proxy objects, but the citizens does not know, they assume the president is real
    // because the proxy and the real are same type of President
    President president = presidentOffice.meetWithThePresident();
    president.listen(citizen.tellTheRequest());
    president.findJob(citizen.askANewJob());

  }

}
