package br.com.alfred.desktop;

import br.com.alfred.desktop.repository.CorretoraRepository;
import br.com.alfred.desktop.utils.MessageUtil;
import br.com.alfred.desktop.view.main.MainApplication;
import javax.swing.UIManager;
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

        log.info(MessageUtil.msgStartApplication);

            //Definindo estilo da aplicação.
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            MainApplication mainApplication = new MainApplication();
            mainApplication.setVisible(true);
            
        log.info(MessageUtil.msgStartedApplciation);
    }
}
