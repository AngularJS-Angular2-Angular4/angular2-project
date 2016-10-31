package com.centurylink.pctl.mod.cart.domain.ShoppingCart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import com.centurylink.pctl.mod.core.model.user.User;
import com.centurylink.pctl.mod.core.model.product.*;
/**
 * The {@link ShoppingCartServiceV1} implements business logic for aggregating the state of
 * a user's actions represented by a sequence of {@link com.centurylink.pctl.mod.cart.domain.ShoppingCart.CartEvent}. The generated aggregate
 * uses event sourcing to produce a {@link com.centurylink.pctl.mod.cart.domain.ShoppingCart.ShoppingCart} containing a collection of
 * {@link //demo.cart.LineItem}.
 *
 */
/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
@Service
public class ShoppingCartServiceV1 {
   /* @Autowired
    ProductRepository productRepository;*/
    //public static final double TAX = .06;
    private final Log log = LogFactory.getLog(ShoppingCartServiceV1.class);
@Autowired
CartEventRepository cartEventRepository;
 //   private RestTemplate restTemplate;

   /* @Autowired
    public ShoppingCartServiceV1(CartEventRepository cartEventRepository) {
        this.cartEventRepository = cartEventRepository;
    }*/
    public ShoppingCartServiceV1(){

    }

    /**
     * Get the authenticated user from the user service
     *
     * @return the currently authenticated user
     */
    public User getAuthenticatedUser() {

        User user = new User();
        user.setId("0");
        return user;
    }
    public Catalog getCatalog(){

        Catalog catalog = new Catalog();
        catalog.setName("SD-WAN");
        catalog.setId(0L);
        //List<Product> products = productRepository.findAll();
        Product p1=new Product();
        p1.setName("SDWAN Basic");
        p1.setProductId("sdwan100");
        p1.setDescriptionHtml("sd wan");
        Set<Product> products = Arrays.asList(
            p1)
            .stream().collect(Collectors.toSet());
        catalog.setProducts(products);

        return catalog;
    }
    /**
     * Adds a shopping cart event for the authenticated user
     *
     * @param cartEvent is the event detailing the action performed by the user
     * @return a flag indicating whether the result was a success
     */
    public Boolean addCartEvent(CartEvent cartEvent) {
        User user = getAuthenticatedUser();
        if (user != null) {
            cartEvent.setUserId(user.getId());
            cartEventRepository.save(cartEvent);
        } else {
            return null;
        }
        return true;
    }

    public Boolean addCartEvent(CartEvent cartEvent, User user) {
        if (user != null) {
            //cartEvent.setUserId(user.getId());
            //cartEvent.setCartEventType(CartEventType.ADD_ITEM);

            log.info("Displaying cart event------------> "+cartEvent);
            cartEventRepository.save(cartEvent);
        } else {
            return null;
        }
        return true;
    }


    /**
     * Aggregate the cart events of a user and return a {@link com.centurylink.pctl.mod.cart.domain.ShoppingCart.ShoppingCart} object
     *
     * @param user    is the user to retrieve the shopping cart for
     * @param catalog is the catalog used to generate the shopping cart
     * @return a shopping cart representing the aggregate state of the user's cart
     * @throws Exception
     */
    public ShoppingCart aggregateCartEvents(User user, Catalog catalog) throws Exception {
        Flux<CartEvent> cartEvents =
                Flux.fromStream(cartEventRepository.getCartEventStreamByUserId(user.getId()));

        // Aggregate the state of the shopping cart
        ShoppingCart shoppingCart = cartEvents
                .takeWhile(cartEvent -> !ShoppingCart.isTerminal(cartEvent.getCartEventType()))
                .reduceWith(() -> new ShoppingCart(catalog), ShoppingCart::incorporate)
                .get();

        shoppingCart.getLineItems();
        log.info("Inside aggregateCartEvents()------->>> "+shoppingCart);
        System.out.println("sysout Inside aggregateCartEvents()------->>> "+shoppingCart);
        return shoppingCart;
    }

    public ShoppingCart getShoppingCart() throws Exception {
        User user = getAuthenticatedUser();
        ShoppingCart shoppingCart = null;
        if (user != null) {
            Catalog catalog =getCatalog();
            shoppingCart = aggregateCartEvents(user, catalog);
        }
        log.info("Inside getShoppingCart() method:::::::::::::::: "+shoppingCart);
        return shoppingCart;
    }



}
