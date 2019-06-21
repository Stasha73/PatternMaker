package org.launchcode;

public class TapestryController {

    public static void main(String[] args) {
        //creating a list to store all of the patterns
        Pattern[] patternArray  = new Pattern[]{

                new ZigZagLinesPattern(),
                new BaublePattern(),
                new BlockyBaublePattern(),
                new CrossStitchWigglePattern()};


        //loops through all of the patterns
        for (int a = 0; a < patternArray .length; a++) {
            for (int rows = 0; rows <= 3; rows++) {
                for (int columns = 0; columns <= 8; columns++) {
                    patternArray[ a ].pattern();
                }
                System.out.println();

            }


        }
        System.out.println();
        System.out.println();

        for(int b = 0; b < patternArray.length; b++){
            for(int rows = 0; rows <= 8; rows++){
                for(int columns = 0; columns <= 6; columns++) {
                    patternArray[ b ].pattern();
                }
                System.out.println();
                }
            }
        }

    }




















