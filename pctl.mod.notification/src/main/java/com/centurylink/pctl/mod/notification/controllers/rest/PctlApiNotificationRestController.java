package com.centurylink.pctl.mod.notification.controllers.rest;


import com.centurylink.pctl.mod.core.utils.Response;
import com.centurylink.pctl.mod.core.utils.StatusCode;
import com.centurylink.pctl.mod.notification.domain.Notification;
import com.centurylink.pctl.mod.notification.domain.NotificationResponse;
import com.centurylink.pctl.mod.notification.domain.PctlApiNotificationService;
import com.centurylink.pctl.mod.notification.domain.utils.DeliveryType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by srinivas on 14-10-2016.
 */

@Transactional
@RestController
@RequestMapping("/notification")
public class PctlApiNotificationRestController {


    private static final Logger log = LoggerFactory.getLogger(PctlApiNotificationRestController.class);

    @Autowired
    private PctlApiNotificationService pctlApiNotificationService;

    @RequestMapping(method = RequestMethod.GET, value = "/{type}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Response<NotificationResponse>> notificationType(@PathVariable String type) {
        Response<NotificationResponse> responseList = new Response<NotificationResponse>();
        DeliveryType deliveryType = DeliveryType.getValueOf(type);
        if (deliveryType == null) {
            responseList.setStatus(StatusCode.N401);
            return new ResponseEntity<Response<NotificationResponse>>(responseList, HttpStatus.BAD_REQUEST);
        }
        List<Notification> response = pctlApiNotificationService.findNotificationByDeliveryType(deliveryType.name());
        NotificationResponse notResponse = new NotificationResponse();
        notResponse.setResponse(response);
        responseList.setContent(notResponse);
        responseList.setStatus(StatusCode.E200);
        return new ResponseEntity<Response<NotificationResponse>>(responseList, HttpStatus.OK);
    }


}



