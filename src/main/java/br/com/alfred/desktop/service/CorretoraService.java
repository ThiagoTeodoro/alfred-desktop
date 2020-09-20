package br.com.alfred.desktop.service;

import br.com.alfred.desktop.exceptions.RequiredFieldException;
import br.com.alfred.desktop.model.Corretora;
import br.com.alfred.desktop.repository.CorretoraRepository;
import br.com.alfred.desktop.utils.MessageUtil;
import java.sql.Timestamp;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe de serviço para corretoras.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Slf4j
@Service
public class CorretoraService {

    @Autowired
    CorretoraRepository corretoraRepository;

    /**
     * Serviço responsável por salvar novas corretoras.
     *
     * O processo de inserção aqui, verifica se a corretora já não existe no
     * banco de dados, caso seja enviado uma corretora que já esteja cadastrada
     * o método não irá fazer um novo cadastro, apenas retornar a corretora já
     * existente.
     *
     * Caso ocorra algum erro o retorno será null.
     *
     * @param name O nome da corretora. Campo Obrigatório!
     * @return
     */
    public Corretora insert(String name) {

        Corretora corretora = null;

        try {

            if (name != null && !name.isEmpty()) {

                corretora = new Corretora();
                corretora.setName(name);
                corretora.setActive(true);
                corretora.setTimestamp(new Timestamp(new Date().getTime()));

                Corretora checkCorretoraExist = corretoraIsExist(name);

                if (checkCorretoraExist == null) {

                    corretora = corretoraRepository.save(corretora);
                } else {

                    corretora = checkCorretoraExist;
                }
            } else {

                throw new RequiredFieldException("O nome da corretora é obrigatório!");
            }
        } catch (Exception e) {

            log.error(String.format(MessageUtil.msgGenericError, e), e);
        }

        return corretora;
    }

    /**
     * Método responsável por verificar se uma corretora já não existe no banco
     * de dados.
     *
     * @param name
     * @return
     */
    public Corretora corretoraIsExist(String name) {

        Corretora corretora = null;

        try {

            corretora = corretoraRepository.findByName(name);
        } catch (Exception e) {

            log.error(String.format(MessageUtil.msgGenericError, e), e);
        }

        return corretora;
    }

}
