package br.com.alfred.desktop.view;

import br.com.alfred.desktop.view.main.MainApplication;
import lombok.extern.slf4j.Slf4j;
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
        log.info("Aplicação inicializada!");
    }
}
