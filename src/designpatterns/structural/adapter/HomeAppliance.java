package designpatterns.structural.adapter;

public interface HomeAppliance {

  int getSuitableVoltage();
  void start(int voltage);
}
