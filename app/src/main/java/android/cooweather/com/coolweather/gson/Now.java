package android.cooweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cecwxf on 18-2-8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
