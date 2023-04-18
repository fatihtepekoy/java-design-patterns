package designpatterns.creational.singleton;

public class SingletonPattern {

  private static volatile SingletonPattern instance;

  private SingletonPattern() {
  }

  public static SingletonPattern getInstance() {
    if (instance == null) {
      synchronized (SingletonPattern.class) {
        if (instance == null) {
          instance = new SingletonPattern();
        }
      }
    }
    return instance;
  }

  // To overcome this serialization issue, we have to implement the readResolve() method
  public Object readResolve(){
    return instance;
  }

  @Override // To overcome cloning singleton object, override clone() method and throw an exception
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

}
