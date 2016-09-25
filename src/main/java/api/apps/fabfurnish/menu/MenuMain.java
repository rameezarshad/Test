package api.apps.fabfurnish.menu;

import api.apps.fabfurnish.commanactions.Swipe;
import core.MyLogger;
import core.UiSelector;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Rameez on 9/25/2016.
 */
public class MenuMain {
    private ArrayList<Integer> index;
    private int setIndex,ind;
    private List<WebElement> cat,subCat,cat1,tag;
    private String cat_name,subcat_name,tag_name,cat1_name;
    private ArrayList<String> categories=new ArrayList<>();
    public Menu menu=new Menu();
    public MenuUiObjects uiObject=new MenuUiObjects();
    private MenuData menuData=new MenuData();
    private Swipe swipe=new Swipe();
    double starty=.9,endy=.1;

    public void random()throws InterruptedException{
        cat=uiObject.cat_name().multiple();
        ind=randomAll(cat.size()-1);
        subCat=uiObject.subcat_name().multiple();
        tag=uiObject.tag_name().multiple();
        if (menu.cat_name().contains("FABDESIGNS")&&menu.cat_name().contains("NEW")) {
            MyLogger.log.info("It's on the: "+cat.get(ind)+" ,I am Working on it");
            random();
        }
        this.categories.add(cat.get(ind).getText());
        cat.get(ind).click();
        //setting SubCategory Array
        do {
            menuData.setSubCatArray();
            //
            swipe.swipeDown(starty,endy);

        }while (cat.get(ind+1).isDisplayed());

        index.add(randomAll(menuData.getSubCatArray().size()-1));
        subcat_name=menuData.getSubCatArray().get(index.get(1));
        this.categories.add(subcat_name);
        while (!(new UiSelector().textContains(subcat_name).makeUiObject().exists()))
        {
            swipe.swipeUp(starty,endy);
        }
        for(int i=0;i<menu.getSubCatNameSize();i++) {
            if(subCat.get(i).getText().contains(subcat_name))
            {
                setIndex=i;
            }
        }
        menu.setIndex(setIndex);
        menu.tapSubcat_name();
        //Tapping done on SubCategory

       do{

        }while (subCat.get(setIndex+1).isDisplayed());
    }

    private int randomAll(int index)
    {
        Random random=new Random();
        return random.nextInt(index);
    }

    public void randomSimple(){

        ind=randomAll(menu.getCatNameSize()-1);
        menu.setIndex(ind);
        if (menu.cat_name().contains("FABDESIGNS")&&menu.cat_name().contains("NEW")) {
            MyLogger.log.info("It's on the: "+cat.get(ind)+" ,I am Working on it");
            randomSimple();
        }
        this.categories.add(menu.cat_name());
        menu.tapCat_name();
        //SubCategories
        ind=randomAll(menu.getSubCatNameSize()-1);
        menu.setIndex(ind);
        this.categories.add(menu.subcat_name());
        menu.tapSubcat_name();
        //Tag Categories1 Level 1
        if(!uiObject.tag_name().waitToAppear(5).exists()) {MyLogger.log.info("It does Not Contains any Tag Name Level 1");}
        else {
            ind = randomAll(menu.getTagNameSize() - 1);
            menu.setIndex(ind);
            this.categories.add(menu.tag_name());
            //Tag Categories Level 2
            if (!uiObject.tag_name().waitToAppear(5).exists()) {MyLogger.log.info("It does Not Contains any Tag Name Level 2");
            }
            else {
                int t = menu.getTagNameSize() - 1;
                ind = 0;
                while (ind == 0) {
                    ind = randomAll(t);
                }
                menu.setIndex(ind);
                menu.tapTag_name();
            }
        }
    }
}

