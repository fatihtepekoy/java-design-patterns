package designpatterns.behavioral.chainofresponsibility;

import java.time.LocalDateTime;

public record Customer(String name, int age, long balance, boolean vip, LocalDateTime licenseExpireDate) {

}
