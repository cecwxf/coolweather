package android.cooweather.com.coolweather.db;

/**
 * Created by cecwxf on 18-2-6.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return  provinceName;
    }
    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}