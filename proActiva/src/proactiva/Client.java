/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proactiva;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Client {
    
    private final String nom;
    private final List<String> prefList;
    private Map<String,Date> visites;
    
    ///@pre:
    ///@post: s'ha creat un client a partir de les dades entrades
    public Client(String _nom, List<String> _prefList){
        nom=_nom;
        prefList=_prefList;
    }
    
    ///@pre: ---
    ///@post: retorna una llista d’strings amb les preferències de l’objecte actual
    public List<String> obtPreferencies(){
        return prefList;
    }
    
     public Map<String,Date> obtVisites(){
        return visites;
    }
     
    public void afegirVisita(String nomlloc,Date data){
        visites.put(nomlloc, data);
    }
}