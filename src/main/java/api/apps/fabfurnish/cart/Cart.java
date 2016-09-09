package api.apps.fabfurnish.cart;

import api.android.Android;
import com.android.uiautomator.core.UiCollection;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
/**
 * Created by Rameez on 8/31/2016.
 */
public class Cart {

    public CartUiObjects uiObject =new CartUiObjects();
    public String getProductName(){
        try{
            MyLogger.log.info("Getting Product Name");
            return uiObject.product_name().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Product Name, element absent or blocked");
        }
    }

    public String getMaxPrice(){

        try{
            MyLogger.log.info("Getting Max Price");
            return uiObject.max_price().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Max Price, element absent or blocked");
        }
    }

    public String getQty(){

        try{
            MyLogger.log.info("Getting Qauntity of the Product");
            return uiObject.qty().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Qauntity of the Product, element absent or blocked");
        }
    }
    public String getDeliveredDays(){

        try{
            MyLogger.log.info("Getting Delivered Days");
            return uiObject.delivered_days().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Delivered Days, element absent or blocked");
        }
    }
    public Cart tapRemove(){

        try{
            MyLogger.log.info("Getting Discounted Price");
            uiObject.discounted_price().tap();
            return Android.app.fabfurnish.cart;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Discounted Price, element absent or blocked");
        }
    }
    public String getShippingText(){

        try{
            MyLogger.log.info("Getting Shipping Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Text, element absent or blocked");
        }
    }
    public String getSubtotalText(){

        try{
            MyLogger.log.info("Getting Subtotal Text");
            return uiObject.subtotal().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Subtotal Texte, element absent or blocked");
        }
    }
    public String getFinalOrderText(){

        try{
            MyLogger.log.info("Getting Final Order Text");
            return uiObject.final_order().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Final Order Text, element absent or blocked");
        }
    }
    public String getShippingDaysText(){

        try{
            MyLogger.log.info("Getting Shipping Days Text");
            return uiObject.shipping().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Shipping Days Text, element absent or blocked");
        }
    }
    //Not working
    public String getChildCount(){

        try{
            MyLogger.log.info("Getting Child Count of Remove");
            return uiObject.remove().getChildCount();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Child Count of Remove, element absent or blocked");
        }
    }
}



