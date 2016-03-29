package cn.codeyang.converter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by meicai on 2016/3/29
 */
public class StringToDateConverter implements Converter<String, Date> {

    public Date convert(String source) {
        if (StringUtils.isBlank(source))
            return null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }
}
