package org.launchcode;

public class CrossStitchWigglePattern extends Pattern {

    public void pattern() {
        //SmallCrossStitch scs = new SmallCrossStitch();
        //LargeCrossStitch lcs = new LargeCrossStitch();

        // loops though characters "x" and "X"

        for (int b = 1; b <= 5; b++) {
            for (int c = 1; c <= 5; c++) {
                scs.sew();
                lcs.sew();
            }
        }
    }
}









