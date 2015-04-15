package br.com.vicsoftsistemas.kraho;

/**
 * Created by VictorBarbosa on 19/02/2015.
 */
public class ToHex {

    /* re-map RGB colors so they can be used in OpenGL */
    public static float[] map(float[]rgb) {

    /* RGB is from 0 to 255 */
    /* THIS is from 0 to 1 (float) */

        // 1 : 2 = x : 4 >>> 2

    /*
    *
    * 240 : 255 = x : 1
    *
    * */

        float[] result = new float[3];
        result[0] = rgb[0] / 255;
        result[1] = rgb[1] / 255;
        result[2] = rgb[2] / 255;
        return result;
    }

    public static float[] hextoRGB(String hex) {

        float[] rgbcolor = new float[3];
        rgbcolor[0] = Integer.valueOf( hex.substring( 1, 3 ), 16 );
        rgbcolor[1] = Integer.valueOf( hex.substring( 3, 5 ), 16 );
        rgbcolor[2] = Integer.valueOf( hex.substring( 5, 7 ), 16 );

        return map(rgbcolor);
    }
}
