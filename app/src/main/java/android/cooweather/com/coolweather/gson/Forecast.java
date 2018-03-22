package android.cooweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cecwxf on 18-2-8.
 */

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temPerature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
