package org.launchcode;

public class ZigZagLinesPattern extends Pattern {
    public void pattern() {

        //ZigZagStitch zz = new ZigZagStitch();
        //FillStitch fs = new FillStitch();

        //create outer loop which will repeat the inner pattern twice
        for (int i = 1; i <= 2; i++) {

            //loop generates character "Z" 3 times
            for (int y = 1; y <= 3; y++) {
                zz.sew();
            }

            //loop generates character "=" 3 times
            for (int z = 1; z <= 3; z++) {
                fs.sew();
            }
        }
    }
}

