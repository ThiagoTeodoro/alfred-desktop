package br.com.alfred.desktop.enums;

/**
 * Enumeração para os tipos de Securities
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public enum SecuritiesType {
   
    FixedIncome("RENDA FIXA"),
    VariableIncome("RENDA VARIAVEL");

    private String typeSecurities;
    
    /**
     * Construtor padrão da Enum.
     * 
     * @param typeSecurities 
     */
    private SecuritiesType(String typeSecurities){
        
        this.typeSecurities = typeSecurities;
    }
}
