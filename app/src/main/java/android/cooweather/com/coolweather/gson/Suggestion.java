package android.cooweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cecwxf on 18-2-8.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public  class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
}
