package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtil {
    public static String tojsonString(Object obj){
        return JSON.toJSONString(obj, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteNullListAsEmpty,SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteDateUseDateFormat,SerializerFeature.MapSortField);
    }

    public static Object parseJSONObject(String JSONStr,Class<?> cls){
        return JSON.parseObject(JSONStr,cls, Feature.OrderedField);
    }
}
