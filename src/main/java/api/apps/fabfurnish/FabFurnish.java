package api.apps.fabfurnish;

import api.android.Android;
import api.apps.fabfurnish.cart.Cart;
import api.apps.fabfurnish.cart.CartMain;
import api.apps.fabfurnish.catalog.Catalog;
import api.apps.fabfurnish.catalog.CatalogMain;
import api.apps.fabfurnish.catalog.ProductsData;
import api.apps.fabfurnish.checkout.Checkout;
import api.apps.fabfurnish.commanactions.Swipe;
import api.apps.fabfurnish.commontab.CommanTab;
import api.apps.fabfurnish.contactus.ContactUs;
import api.apps.fabfurnish.curatordetail.CurratorDetail;
import api.apps.fabfurnish.currator.Currator;
import api.apps.fabfurnish.fabideas.FabIdeas;
import api.apps.fabfurnish.filter.Filter;
import api.apps.fabfurnish.homepage.Homepage;
import api.apps.fabfurnish.ideadetails.IdeaDetails;
import api.apps.fabfurnish.login.Login;
import api.apps.fabfurnish.menu.Menu;
import api.apps.fabfurnish.menu.MenuMain;
import api.apps.fabfurnish.menuright.MenuRight;
import api.apps.fabfurnish.myorder.MyOrder;
import api.apps.fabfurnish.newarrivals.NewArrivals;
import api.apps.fabfurnish.pdp.Pdp;
import api.apps.fabfurnish.pdp.PdpMain;
import api.apps.fabfurnish.register.Register;
import api.apps.fabfurnish.sale.Sale;
import api.apps.fabfurnish.scanqr.ScanQr;
import api.apps.fabfurnish.search.Search;
import api.apps.fabfurnish.share.Share;
import api.apps.fabfurnish.sort.Sort;
import api.apps.fabfurnish.trackorder.TrackOrder;
import api.apps.fabfurnish.tutorials.Tutorials;
import api.apps.fabfurnish.wishlist.Wishlist;
import api.apps.fabfurnish.wishlist.WishlistMain;
import api.interfaces.Application;
/**
 * Created by Rameez on 8/31/2016.
 */
public class FabFurnish implements Application {
    public Cart cart=new Cart();
    public Homepage homepage=new Homepage();
    public Menu menu=new Menu();
    public Wishlist wishlist=new Wishlist();
    public Catalog catalog=new Catalog();
    public Checkout checkout=new Checkout();
    public ContactUs contactUs=new ContactUs();
    public Login login=new Login();
    public MenuRight menuRight=new MenuRight();
    public MyOrder myOrder=new MyOrder();
    public NewArrivals newArrivals=new NewArrivals();
    public Pdp pdp=new Pdp();
    public Register register=new Register();
    public Sale sale=new Sale();
    public ScanQr scanQr=new ScanQr();
    public Search search=new Search();
    public Share share=new Share();
    public TrackOrder trackOrder=new TrackOrder();
    public Tutorials tutorials=new Tutorials();
    public CommanTab commanTab=new CommanTab();
    public Filter filter=new Filter();
    public Sort sort=new Sort();
    public Swipe swipe=new Swipe();
    public MenuMain menuMain=new MenuMain();
    public CartMain cartMain=new CartMain();
    public CatalogMain catalogMain=new CatalogMain();
    public WishlistMain wishlistMain=new WishlistMain();
    public Currator currator=new Currator();
    public CurratorDetail curratorDetail=new CurratorDetail();
    public IdeaDetails ideaDetails=new IdeaDetails();
    public FabIdeas fabIdeas=new FabIdeas();
    public PdpMain pdpMain=new PdpMain();

    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    public Object open() {

        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    public String packageID() {
        return "com.fabfurnish.android";
    }

    public String activityID() {
        return "com.fabfurnish.android.SplashActivity";
    }
}
