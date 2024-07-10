package kz.nurdev.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    /*
    Она позволяет автоматически обеспечивать балансировку нагрузки
    при использовании RestTemplate для вызовов удаленных сервисов.

    Если нет явной настройки балансировки нагрузки,
    @LoadBalanced просто позволяет использовать символическое имя сервиса в URL для вызовов RestTemplate
     */
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
