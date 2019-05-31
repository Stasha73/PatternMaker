package org.launchcode;

public class BlockyBaublePattern extends Pattern {
    public void createPattern() {
        for (int i = 0; i <= 1; i++) ;
        {
            for (int y = 0; y <= 2; y++) ;
            {
                for (int z = 0; z <= 1; z++) ;
                {
                    System.out.println(BlockStitch.sew() + ShortLineStitch.sew() + CircleStitch.sew());
                }
            }
        }

    }
}
