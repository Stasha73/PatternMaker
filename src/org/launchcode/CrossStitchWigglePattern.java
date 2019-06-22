package org.launchcode;

public class CrossStitchWigglePattern extends Pattern {

    public void pattern() {

        // loops though SmallCrossStitch (scs) and LargeCrossStitch (lcs) 5 times

        for (int b = 1; b <= 5; b++) {
            for (int c = 1; c <= 5; c++) {
                scs.sew();
                lcs.sew();
            }
        }
    }
}









