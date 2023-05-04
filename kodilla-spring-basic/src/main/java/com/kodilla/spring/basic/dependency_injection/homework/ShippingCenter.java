package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryServiceTest deliveryServiceTest;
    private NotificationServiceTest notificationServiceTest;

    public ShippingCenter(DeliveryServiceTest deliveryServiceTest, NotificationServiceTest notificationServiceTest) {
        this.deliveryServiceTest = deliveryServiceTest;
        this.notificationServiceTest = notificationServiceTest;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryServiceTest.deliverPackage(address, weight)) {
            notificationServiceTest.success(address);
        } else {
            notificationServiceTest.fail(address);
        }
    }
}