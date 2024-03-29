package api.apps.fabfurnish.ideadetails;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by Rameez on 9/29/2016.
 */
public class IdeaDetailsUiObjects {
    private static UiObject
            designerName,
            ideabookPin,
            fabLike,
            fabLikeCount,
            shopTheLookText,
            shopTheLookInfo,
            shareShopTheLook;


    public UiObject designerName(){
        if(designerName==null) designerName=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/designer_name").makeUiObject();
        return designerName;
    }
    public UiObject ideabookPin(){
        if(ideabookPin==null) ideabookPin=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fabidea_imgView").makeUiObject();
        return ideabookPin;
    }
    public UiObject fabLike(){
        if(fabLike==null) fabLike=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fab_like").makeUiObject();
        return fabLike;
    }
    public UiObject fabLikeCount(){
        if(fabLikeCount==null) fabLikeCount=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/fab_like_text").makeUiObject();
        return fabLikeCount;
    }
    public UiObject shopTheLookText(){
        if(shopTheLookText==null) shopTheLookText=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/tvShopTheLook").makeUiObject();
        return shopTheLookText;
    }

    public UiObject shopTheLookInfo(){
        if(shopTheLookInfo==null) shopTheLookInfo=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/imgViewInfoShopLook").makeUiObject();
        return shopTheLookInfo;
    }

    public UiObject shareShopTheLook(){
        if(shareShopTheLook==null) shareShopTheLook=new UiSelector().resourceId(Android.app.fabfurnish.packageID()+":id/imgViewShareShopLook").makeUiObject();
        return shareShopTheLook;
    }
}