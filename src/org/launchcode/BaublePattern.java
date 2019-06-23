package org.launchcode;

public class BaublePattern extends Pattern {

    public void pattern() {

        //first loops through with the shortline stitch (sls) "-" 5 times
        for (int i = 1; i <= 5; i++) {
            sls.sew();
            {
                //2nd loops through with shortline stitch (sls) & circle stitch (cs) once
                for (int y = 1; y <= 1; y++) {
                    sls.sew();
                    cs.sew();

                }

            }
        }
    }
}
