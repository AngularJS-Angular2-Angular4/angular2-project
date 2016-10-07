package com.centurylink.pctl.mod.api.controllers.rest;


import com.centurylink.pctl.mod.api.domain.product.Product;
import com.centurylink.pctl.mod.api.domain.product.ProductRepository;
import com.centurylink.pctl.mod.api.domain.user.UserRepository;
import com.centurylink.pctl.mod.api.domain.utils.JwtTokenUtil;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/auth")
public class PctlUserRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlUserRestController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;




    /* Mocking  Token Generation */

    @RequestMapping(value = "/token/generate", method = RequestMethod.GET)
    public String getToken() {
        String token = jwtTokenUtil.generateToken("jbeginsamuel@gmail.com");
        log.info("Token {}",token);
        return token;
        //Lists.newArrayList(productRepository.findAll());
    }



}
