package unibrand.unibrand.unibrandapp.util;

/**
 * Created by Candice on 16/02/2017.
 */

public class PageHandler {
    public enum Page{
        BIOEQUIVALENCE("bioequivalence"),
        ATROVAST("atrovast"),
        GLICLA("glicla"),
        FELODIPIN("felodipin"),
        AZITHRO("azithro"),
        LEVOFLOXIN("levofloxin"),
        LEVOCET("levocet"),
        CORPORATE_VIDEO("video_unibrand");


        private String key;

        Page(String key){
            this.key = key;
        }

        public String getKey(){
            return key;
        }
    }
}
