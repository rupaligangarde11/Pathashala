import java.util.Scanner;

public class TaxCalculation{
        public enum Taxes {
                basicTax(10 / 100),
                importDutyTax(5 / 100);

                private final int TaxValue;

                Taxes(int tax) {
                        this.TaxValue = tax;
                }

                public int getTaxes(){
                         return TaxValue;
                }
        }
}
