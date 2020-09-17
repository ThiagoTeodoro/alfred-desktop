package br.com.alfred.desktop.view;

import br.com.alfred.desktop.model.Corretora;
import br.com.alfred.desktop.repository.CorretoraRepository;
import br.com.alfred.desktop.view.main.MainApplication;
import java.sql.Timestamp;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Lançador da parte visual da aplicação.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Component
@Slf4j
public class Launcher implements CommandLineRunner {
    
    @Autowired
    CorretoraRepository corretoraRepository;

    /**
     * Runner Principal.
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        log.info("Inicializando a aplicação...");

            MainApplication mainApplication = new MainApplication();
            mainApplication.setVisible(true);
            
            
            Corretora teste = new Corretora();
            teste.setName("teste");
            teste.setTimestamp(new Timestamp(new Date().getTime()));
            corretoraRepository.save(teste);
                
        log.info("Aplicação inicializada!");
    }
}
