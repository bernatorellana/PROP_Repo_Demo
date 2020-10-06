package jugantambmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bernat
 */
public class JugantAmbMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, String> ferreteria = new HashMap<String,String>();
        ferreteria.put("RT45", "Cargol 3''");
        ferreteria.put("RT47", "Cargol 7''");
        ferreteria.put("JK23", "Cable RJ45");
        
        System.out.println("> "+ ferreteria.get("JK23"));
        System.out.println("> "+ ferreteria.get("XXXXX"));
        System.out.println("> "+ ferreteria.containsKey("JK23"));
        System.out.println("> "+ ferreteria.containsKey("XXXXX"));
        
        System.out.println("=========================");
        for(String clau: ferreteria.keySet()) {
            System.out.println(">"+clau+":"+ferreteria.get(clau));
        }
        //--------------------------------------------------
        System.out.println("=============================================");
        String[] frase={"una", "bonica", "frase", "una", "frase", "hola", "frase"};
        
        Map<String, Integer> freq = new HashMap<>();
        
        for(int i=0;i<frase.length;i++) {
            int f=0;
            if(freq.containsKey(frase[i])){
                f = freq.get(frase[i]);
            }
            f++;
            freq.put(frase[i], f);
        }
        for(String clau: freq.keySet()) {
            System.out.println(">"+clau+":"+freq.get(clau)+" oc.");
        }
        System.out.println("================================");
        //------------------------------------------------
        // Ara volem ordenar les freqüències per número d'ocurrència
        Set<String> paraules =  freq.keySet();
        List<String> llistaParaules = new ArrayList<>();
        llistaParaules.addAll(paraules);        
        Collections.sort(llistaParaules);
        for(String p: llistaParaules) {
            System.out.println(">"+p+":"+freq.get(p)+" oc.");
        }
        //------------------------------------------------
        
        Map<Persona, String> carrecs = new HashMap<>();
        Persona p1 = new Persona(1, "Pep");
        Persona p1clonica = new Persona(1, "Pep");
        Persona p2 = new Persona(2, "Cristina");
        Persona p3 = new Persona(3, "Alba");
        carrecs.put(p2, "Cap");
        carrecs.put(p1, "Comptable");
        System.out.println("================================");
        //------------------------------------------------
        List<Persona> persones = new ArrayList<>();
        persones.add(p1);
        persones.add(p2);
        persones.add(p3);
        Collections.sort(persones);
        
        for(Persona p: persones) {
            System.out.println(">"+p.getId()+" "+p.getNom() );
        }
        System.out.println("================================");
        //--------------------------------------
        Comparator<Persona> comparador = new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getId()-o2.getId();
            }
        };
        Collections.sort(persones, comparador);
        for(Persona p: persones) {
            System.out.println("==>"+p.getId()+" "+p.getNom() );
        }
    }
    
}
