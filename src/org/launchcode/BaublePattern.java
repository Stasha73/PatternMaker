package org.launchcode;

public class BaublePattern extends Pattern {

    public void pattern() {
        //ShortLineStitch sls = new ShortLineStitch();
        //CircleStitch cs = new CircleStitch();
        //first loops through with the "-" 5 times
        for (int i = 1; i <= 5; i++) {
            sls.sew();
            {
                //2nd loops through with "-" and "0" 5 times
                for (int y = 1; y <= 1; y++) {
                    sls.sew();
                    cs.sew();

                }

            }
        }
    }
}
