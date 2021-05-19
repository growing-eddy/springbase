package example.common.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * <PRE>
 * {web配置类}
 * </PRE>
 * @author zhaodg
 * @date 2021/3/1
 */
@Configuration
public class WebConfig {

    @Bean
    public HttpMessageConverter messageConverters(){
        //json
        FastJsonHttpMessageConverter jsonMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.forName("utf-8"));
        jsonMessageConverter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> jsonMediaTypes = new ArrayList<>();
        jsonMediaTypes.add(MediaType.APPLICATION_JSON);
        jsonMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        jsonMessageConverter.setSupportedMediaTypes(jsonMediaTypes);

        //xml
//        MappingJackson2XmlHttpMessageConverter xmlMessageConverter = new MappingJackson2XmlHttpMessageConverter();
//        xmlMessageConverter.setObjectMapper(new XmlMapper());
//        xmlMessageConverter.setDefaultCharset(Charset.forName("utf-8"));
//        List<MediaType> xmlMediaTypes = new ArrayList<>();
//        xmlMediaTypes.add(MediaType.APPLICATION_XML);
//        xmlMediaTypes.add(MediaType.TEXT_XML);
//        xmlMessageConverter.setSupportedMediaTypes(xmlMediaTypes);

        return null;
    }


}
