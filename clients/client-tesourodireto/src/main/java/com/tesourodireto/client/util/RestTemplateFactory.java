package com.tesourodireto.client.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Fabrica de RestTemplate para requisições.
 * Essa classe tem o objetivo de entregar um RestClient preparado e configurado
 * para uso.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class RestTemplateFactory {
    
    /**
     * Fabrica de RestTemplates para utilização.
     * 
     * @return 
     */
    public static RestTemplate getRestTemplate(){
        
        //Instanciando um novo RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        
        //Configurando Converter para JSON
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
	converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
	messageConverters.add(converter);		                
        restTemplate.setMessageConverters(messageConverters);
                
        return restTemplate;
    }
    
}
