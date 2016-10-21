package com.centurylink.pctl.mod.notification.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by pulapakas on 18-10-2016.
 */
@RepositoryRestResource(collectionResourceRel = "notification", path = "notification")
public interface NotificationRepository extends MongoRepository<Notification, String> {

    @Query(value = "{ 'entityId' : ?0 }")
    public List<Notification> findNotificationByEntityId(String entityId);

    @Query(value = "{ 'deliveryType' : ?0 }")
    public List<Notification> findNotificationByDeliveryType(String deliveryType);

}


