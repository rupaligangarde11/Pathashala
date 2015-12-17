/**
 * Created by rupalig on 16/12/15.
 */
public class ProductList {
    public enum ItemList{
        books(false,true),
        music_cd(false,false),
        chocobar(false,true),
        boxOfChoco(true,true),
        perfume(true,false),
        headachePills(false,true),
        chocolate(true,false);

        private boolean isExempted;
        private boolean isImported;

        public boolean isImported(){
            return isImported;
        }
        public boolean isExempted(){
            return isExempted;
        }

        ItemList(boolean imported, boolean exempted) {
            isImported = imported;
            isExempted = exempted;
        }
    }
}


