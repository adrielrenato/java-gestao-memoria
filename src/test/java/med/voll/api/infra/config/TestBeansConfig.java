package med.voll.api.infra.config;

import med.voll.api.domain.consulta.service.AgendamentoDeConsulta;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestBeansConfig {

    @Bean
    public AgendamentoDeConsulta agendamentoDeConsulta() {
        return Mockito.mock(AgendamentoDeConsulta.class);
    }
}

