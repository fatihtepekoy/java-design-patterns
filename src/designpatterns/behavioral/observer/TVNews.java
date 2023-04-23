package designpatterns.behavioral.observer;


public class TVNews implements Channel {

    private String news;

    @Override
    public void update(Object news) {
        System.out.println("TVNews news = " + news);
        setNews((String) news);
    }

    private void setNews(String news) {
        this.news = news;
    }
}
