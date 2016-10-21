package com.centurylink.pctl.mod.notification.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pulapakas on 18-10-2016.
 */
@Service
public class PctlApiNotificationService {
    private final Logger log = LoggerFactory.getLogger(PctlApiNotificationService.class);


    @Autowired
    private NotificationRepository notificationRepository;


    public List<Notification> findNotificationByEntityId(String entityId) {
        return notificationRepository.findNotificationByEntityId(entityId);
    }

    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }


    public List<Notification> findAllNotification() {
        return notificationRepository.findAll();
    }

    public List<Notification> findNotificationByDeliveryType(String deliveryType) {
        log.info("findNotificationByDeliveryType" + deliveryType);
        return notificationRepository.findNotificationByDeliveryType(deliveryType);
    }
}
