
/**
 * Created by rupalig on 16/12/15.
 */
public class Product {

    public ProductList.ItemList itemList = new ProductList.ItemList();
    public TaxCalculation.Taxes taxes = new TaxCalculation.Taxes();

    public String productName;
    public int productPrice;
    public int productQuantity;

    public void setProductName(String productName){
        this.productName= productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductPrice(int productPrice){
        this.productPrice= productPrice;
    }
    public int getProductPrice(){
        return productPrice;
    }
    public void setProductQuantity(int productQuantity){
        this.productQuantity=productQuantity;
    }
    public int getProductQuantity(){
        return productQuantity;
    }

    public boolean isproductImported(String productName){
        return itemList.isImported();
    }

    public boolean isproductExempted(String productName){
        return itemList.isExempted();
    }

    public int getProductTaxValue(){
        return taxes.getTaxes();
    }

    public int getproductTotalPrice(){
        return productPrice + getProductTaxValue();
    }

}


