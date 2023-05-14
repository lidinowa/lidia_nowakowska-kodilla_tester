package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNull;

class AlertServiceTestSuite {
    AlertService alertService;
    Location warsaw;
    Location gdansk;
    Location wroclaw;
    User user1;
    User user2;
    User user3;
    Notification testNotification;


    @BeforeEach
            public void setUp(){
        alertService = new AlertService();
        warsaw = Mockito.mock(Location.class);
        gdansk = Mockito.mock(Location.class);
        wroclaw = Mockito.mock(Location.class);
        user1 = Mockito.mock(User.class);
        user2 = Mockito.mock(User.class);
        user3 = Mockito.mock(User.class);
        testNotification = Mockito.mock(Notification.class);
    }

    @Test
    public void shouldSignForALocationAndReceiveNotification() {
        alertService.addUserToSubscriptionToGivenLocation(user1, warsaw);
        alertService.addUserToSubscriptionToGivenLocation(user2, warsaw);

        alertService.sendNotificationRelatedToGivenLocation(warsaw);

        Mockito.verify(user1).receiveLocationNotification(warsaw);
        Mockito.verify(user2).receiveLocationNotification(warsaw);

        //lub drugi zapis
        Mockito.verify(user1, Mockito.times(1)).receiveLocationNotification(warsaw);
        Mockito.verify(user2, Mockito.times(1)).receiveLocationNotification(warsaw);
    }

    @Test
    public void shouldCancelSubscriptionForUserFromGivenLocation() {
        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
        alertService.addUserToSubscriptionToGivenLocation(user1, warsaw);
        alertService.addUserToSubscriptionToGivenLocation(user1, wroclaw);
        alertService.cancelSubscriptionFromGivenLocation(user1, gdansk);
        alertService.sendNotificationRelatedToGivenLocation(gdansk);

        Mockito.verify(user1, Mockito.times(0)).receiveLocationNotification(gdansk);
    }

    //próba z asercją
//    @Test
//    public void shouldCancelSubscriptionForUserFromGivenLocation2() {
//        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
//        alertService.addUserToSubscriptionToGivenLocation(user1, warsaw);
//
//        int indexOfLocationToBeDeleted = alertService.dataBaseWithAllSubscribers.get(user1).indexOf(gdansk);
//        alertService.cancelSubscriptionFromGivenLocation(user1, gdansk);
//
//        Location locationTest = alertService.dataBaseWithAllSubscribers.get(user1).get(indexOfLocationToBeDeleted);
//        assertNull(locationTest);
//    }

    @Test
    public void shouldCancelAllSubscriptions() {
        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
        alertService.addUserToSubscriptionToGivenLocation(user1, warsaw);
        alertService.addUserToSubscriptionToGivenLocation(user1, wroclaw);

        alertService.cancelAllSubscriptionsForUser(user1);

        alertService.sendNotificationRelatedToGivenLocation(gdansk);
        alertService.sendNotificationRelatedToGivenLocation(warsaw);
        alertService.sendNotificationRelatedToGivenLocation(wroclaw);

        Mockito.verify(user1, Mockito.times(0)).receiveLocationNotification(gdansk);
        Mockito.verify(user1, Mockito.times(0)).receiveLocationNotification(warsaw);
        Mockito.verify(user1, Mockito.times(0)).receiveLocationNotification(wroclaw);
    }

    @Test
    public void notificationFromGivenLocationShouldBeReceivedOnlyBySubscribers() {
        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
        alertService.addUserToSubscriptionToGivenLocation(user2, warsaw);
        alertService.sendNotificationRelatedToGivenLocation(gdansk);

        Mockito.verify(user2, Mockito.never()).receiveLocationNotification(gdansk);
    }

    @Test
    public void shouldSendNotificationToAllUsers() {
        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
        alertService.addUserToSubscriptionToGivenLocation(user2, warsaw);
        alertService.addUserToSubscriptionToGivenLocation(user3, wroclaw);

        alertService.sendNotificationToAllUsers(testNotification);

        Mockito.verify(user1, Mockito.times(1)).receiveGeneralNotification(testNotification);
        Mockito.verify(user2, Mockito.times(1)).receiveGeneralNotification(testNotification);
        Mockito.verify(user3, Mockito.times(1)).receiveGeneralNotification(testNotification);
    }

    @Test
    public void shouldBeAbleToDeleteALocation() {
        alertService.addUserToSubscriptionToGivenLocation(user1, gdansk);
        alertService.addUserToSubscriptionToGivenLocation(user2, warsaw);
        alertService.addUserToSubscriptionToGivenLocation(user3, wroclaw);

        alertService.deleteALocation(gdansk);

        Mockito.verify(user1, Mockito.times(0)).receiveLocationNotification(gdansk);
    }
}