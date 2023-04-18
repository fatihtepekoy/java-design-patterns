package designpatterns.structural.proxy.president;

public class ProxyPresident implements President {

  private President president = new RealPresident();

  @Override
  public void listen(String request) {
    forwardTheRequest(request);
  }

  @Override
  public void findJob(String job) {
    president.findJob(job);
  }

  private boolean filterTheRequest(String request) {
    if (request.contains("food") || request.contains("shelter")) {
      return true;
    }

    return false;
  }

  private void forwardTheRequest(String request) {
    if (filterTheRequest(request)) {
      president.listen(request);
    }
  }

}
