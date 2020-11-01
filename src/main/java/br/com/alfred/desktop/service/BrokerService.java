package br.com.alfred.desktop.service;

import br.com.alfred.desktop.exceptions.RequiredFieldException;
import br.com.alfred.desktop.model.Broker;

/**
 * Serviço para as operações com a corretora.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public interface BrokerService {

    /**
     * Método responsável por verificar se uma corretora já não existe no banco
     * de dados.
     *
     * @param name
     * @return
     */
    Broker brokerIsExist(String name) throws RequiredFieldException;

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
    Broker safeInsert(String name);

    /**
     * Método responsável por executar a atualização de uma corretora no banco
     * de dados.
     *
     * @param corretoraForUpdate
     * @return
     */
    Broker safeUpdate(Broker corretoraForUpdate);

    /**
     * Método responsável por executar a atualização de uma corretora no banco
     * de dados sem checagem de duplicidade
     *
     * @param corretoraForUpdate
     * @return
     */
    Broker unSafeUpdate(Broker corretoraForUpdate);

    /**
     * Método responsável por recupear uma corretora pelo seu Id.Caso a
     * corretora não exista será retornado null.
     *
     * @param id
     * @return
     * @throws java.lang.Exception
     */
    Broker getBrokerById(int id) throws Exception;

}
