/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesourodireto.client.ssl;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Classe desenvolvida para desabilitar/mascarar a verificação SSL da JVM.
 * 
 * @author Thiago Teodoro Rodrigues <thiao.teodoro.rodrigues@gmail.com>
 */
public class SSLTrustChain {
    
    /**
     * Método responsável por desativar a cadeia valida de verificação de 
     * SSL fazendo com toda checagem de SSL feita seja permitida independente
     * se está valido ou não.
     */
    public static void disableSSLVerification(){
        
        try {
            
            //Criando gerenciador de segurança "Burro"
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    }
                }
            };

            // Instalando gerenciador all-trusting
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Criando verificador para o all-trusting
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Aplicando validação a todos os Hosts.
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (Exception e){
            
            System.out.println(String.format("Ocorreu um erro ao tentar aplicar a cadeia de verificação SSL para autorização. Exception : ", e));
        }
    }
    
}
