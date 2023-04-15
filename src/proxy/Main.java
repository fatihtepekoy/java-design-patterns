package proxy;

public class Main {

  public static void main(String[] args) {
    Citizen citizen = new Citizen();
    PresidentOffice presidentOffice = new PresidentOffice();
    presidentOffice.setPresident(new ProxyPresident());

    citizen.setProblem("food");
    citizen.setJob("teacher");

    President president = presidentOffice.meetWithThePresident();
    president.listen(citizen.tellTheRequest());
    president.findJob(citizen.askANewJob());

  }

}
