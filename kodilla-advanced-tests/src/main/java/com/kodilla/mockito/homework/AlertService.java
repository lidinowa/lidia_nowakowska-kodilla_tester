package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class AlertService {

    HashMap<User, ArrayList<Location>> dataBaseWithAllSubscribers = new HashMap<>();


    public void addUserToSubscriptionToGivenLocation(User user, Location location) {
        ArrayList<Location> userLocationList = new ArrayList<>();
        //jeśli user już jest dodany
        if (dataBaseWithAllSubscribers.containsKey(user)) {
            dataBaseWithAllSubscribers.get(user).add(location);
        }
        //jeśli user będzie dodany pierwszy raz
        else {
            userLocationList.add(location);
            dataBaseWithAllSubscribers.put(user, userLocationList);
        }
    }

    public void sendNotificationRelatedToGivenLocation(Location location) {
        dataBaseWithAllSubscribers.entrySet()
                .stream()
                .filter(l -> l.getValue().contains(location))
                .forEach(l -> l.getKey().receiveLocationNotification(location));
    }

    public void sendNotificationToAllUsers(Notification notification) {
        dataBaseWithAllSubscribers.entrySet()
                .stream()
                .forEach(l -> l.getKey().receiveGeneralNotification(notification));
    }

    public void cancelSubscriptionFromGivenLocation(User user, Location location) {
        dataBaseWithAllSubscribers.get(user).remove(location);
    }

    public void cancelAllSubscriptionsForUser(User user) {
        dataBaseWithAllSubscribers.remove(user);
    }

    public void deleteALocation(Location location) {
        dataBaseWithAllSubscribers.remove(location);
    }

}