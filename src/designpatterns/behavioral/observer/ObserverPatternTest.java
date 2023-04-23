package designpatterns.behavioral.observer;

public class ObserverPatternTest {

  public static void main(String[] args) {
    NewsAgency observable = new NewsAgency();
    Channel tvNews = new TVNews();
    Channel radioNews = new RadioNews();

    observable.addObserver(tvNews);
    observable.addObserver(radioNews);
    observable.setNews("Inflation is increased again");

  }
}

