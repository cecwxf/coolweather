package android.cooweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cecwxf on 18-2-8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
