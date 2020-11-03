package br.com.alfred.desktop.service;

import br.com.alfred.desktop.exceptions.DataAlreadyExistException;
import br.com.alfred.desktop.exceptions.GenericException;
import br.com.alfred.desktop.exceptions.RequiredFieldException;
import br.com.alfred.desktop.model.Broker;
import br.com.alfred.desktop.utils.MessageUtil;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alfred.desktop.persistence.repository.BrokerRepository;
import java.util.NoSuchElementException;

/**
 * Classe de serviço para corretoras.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Slf4j
@Service
public class BrokerServiceImpl implements BrokerService {

    @Autowired
    BrokerRepository corretoraRepository;

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
    @Override
    public Broker safeInsert(String name) throws RequiredFieldException {

        Broker corretora = null;

        if (name != null && !name.isEmpty()) {

            corretora = new Broker();
            corretora.setName(name);
            corretora.setActive(true);
            corretora.setInsertTimestamp(new Timestamp(new Date().getTime()));
            corretora.setUpdateTimestamp(null);

            Broker checkCorretoraExist = brokerIsExist(name);

            if (checkCorretoraExist == null) {

                corretora = corretoraRepository.save(corretora);
            } else {

                corretora = checkCorretoraExist;
            }
        } else {

            throw new RequiredFieldException("O nome da corretora é obrigatório!");
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
    @Override
    public Broker brokerIsExist(String name) {

        Broker corretora = null;

        try {

            corretora = corretoraRepository.findByNameAndActive(name, true);
        } catch (Exception e) {

            log.error(String.format(MessageUtil.msgGenericError, e), e);
        }

        return corretora;
    }

    /**
     * Método responsável por executar a atualização de uma corretora no banco
     * de dados.
     *
     * @return
     */
    @Override
    public Broker safeUpdate(Broker corretoraForUpdate) throws DataAlreadyExistException, RequiredFieldException {

        Broker result = null;

        if (corretoraForUpdate != null && !corretoraForUpdate.getName().isEmpty()) {

            corretoraForUpdate.setUpdateTimestamp(new Timestamp(new Date().getTime()));
            Broker checkCorretoraExist = brokerIsExist(corretoraForUpdate.getName());

            if (checkCorretoraExist == null) {

                result = corretoraRepository.save(corretoraForUpdate);
            } else {

                result = checkCorretoraExist;
                throw new DataAlreadyExistException(String.format(MessageUtil.dataAlreadyExist, corretoraForUpdate.getName()));
            }
        } else {

            throw new RequiredFieldException("O nome da corretora é obrigatório!");
        }

        return result;
    }

    @Override
    public Broker unSafeUpdate(Broker corretoraForUpdate) throws RequiredFieldException {

        Broker result = null;

        if (corretoraForUpdate != null && !corretoraForUpdate.getName().isEmpty()) {

            corretoraForUpdate.setUpdateTimestamp(new Timestamp(new Date().getTime()));

            result = corretoraRepository.save(corretoraForUpdate);
        } else {

            throw new RequiredFieldException("O nome da corretora é obrigatório!");
        }

        return result;
    }

    @Override
    public Broker getBrokerById(int id) throws GenericException {

        try {

            return corretoraRepository.findById(id).get();
        } catch (Exception ex) {

            throw new GenericException(String.format(MessageUtil.msgGenericError, ex));
        }
    }

}
