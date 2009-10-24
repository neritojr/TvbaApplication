/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application.tvba.org.utilitarios;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author neritobaldojunior
 */
public class Utilitarios {

    private final String urlBanco;
    private final String driver;
    private final String usuarioBanco;
    private final String senhaBanco;
    private static final String FILE_CONFIG_URI = "..\\config\\config.properties";

    public String getDriver() {
        return driver;
    }

    public String getSenhaBanco() {
        return senhaBanco;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public String getUsuarioBanco() {
        return usuarioBanco;
    }

    public Utilitarios(){
        this.urlBanco = this.loadProperty("UrlBanco");
        this.driver = this.loadProperty("Driver");
        this.usuarioBanco = this.loadProperty("UsuarioBanco");
        this.senhaBanco = this.loadProperty("SenhaBanco");

    }

    private Properties loadFileProperties(String strFile) {

        InputStream is = getClass().getResourceAsStream(strFile);

        Properties fileProps = new Properties();
        try {
            fileProps.load(is);
            is.close();
        } catch (Exception e) {
        }
        return fileProps;
    }

    private Properties loadProperties() {
        return this.loadFileProperties(FILE_CONFIG_URI);
    }

    // Retorna a propriedade chamada
    public String loadProperty(String property){
        Properties prop = this.loadProperties();
        return prop.getProperty(property);
    }



}
