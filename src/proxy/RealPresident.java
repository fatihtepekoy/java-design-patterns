package proxy;

public class RealPresident implements President{

  @Override
  public void listen(String request) {
    System.out.println("OK. I will give " + request + " to you");
  }

  @Override
  public void findJob(String job) {
    System.out.println("You are " + job + ". I found a job for you");
  }
}
