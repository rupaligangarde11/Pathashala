/**
 * Created by rupalig on 16/12/15.
 */
public class SalesTaxDemo  {
    private double roundOffValue=0.05;

    //Product books = new Product();
//        books.setProductName("books");
//        books.setProductPrice((int) 12.49);
//        books.setProductQuantity(1);
//        books.isproductExempted(books.productName);
//        books.isproductImported(books.productName);

        public TaxCalculation.Taxes getProductCategoryTax(Product product){

            if(product.isproductExempted(product.productName)&& !product.isproductImported(product.productName))
                return TaxCalculation.Taxes.basicTax;
            else if(product.isproductImported(product.productName)&& !product.isproductExempted(product.productName))
                return TaxCalculation.Taxes.importDutyTax;

            return null;
        }
        public double calculateTax(Product product){
            int tax = getProductCategoryTax(product).getTaxes();
            return calculateRoundOffTax(tax);
        }

    private double calculateRoundOffTax(int tax) {
        return (tax * roundOffValue)/ roundOffValue;
    }
}
