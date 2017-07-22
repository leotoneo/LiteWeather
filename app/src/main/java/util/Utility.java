package util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import db.City;
import db.County;
import db.Province;

/**
 * Created by leo zhang on 2017/7/22 0022.
 */

public class Utility {


    /*解析返回的省的Json数据*/

    public  static boolean handleProvinceRespond(String response){
        if(!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /*解析返回的市的Json数据*/
    public static boolean handleCityRespond(String response , int provinceId){
         if(!TextUtils.isEmpty(response)){
             try {
                 JSONArray allCitys = new JSONArray(response);
                 for(int i=0;i<allCitys.length();i++){
                     JSONObject cityObject = allCitys.getJSONObject(i);
                     City city = new City();
                     city.setCityCode(cityObject.getInt("id"));
                     city.setCityName(cityObject.getString("name"));
                     city.setProvinceId(provinceId);
                     city.save();
                 }
                 return true;
             } catch (JSONException e) {
                 e.printStackTrace();
             }

         }

         return false;
    }
        /*解析返回县的Json数据*/
    public static boolean handleCountyRespond(String response ,int cityId){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray allCounty = new JSONArray(response);
                for(int i=0;i<allCounty.length();i++){
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
}


