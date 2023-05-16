package designpatterns.structural.proxy.license;

import java.util.UUID;

public class License {

  private String code = new UUID(hashCode(), 32L).toString();

  public String getCode() {
    return code;
  }
}
