package application;

/*
*   Map <K,V>
*
*   Coleção de pares/chaves
*       - Não admite repetições no objeto
*       - Os elementos são indexados pelo objeto chave (Não possuem posição)
*       - Acesso, inserção e remoçao de elementos rapidos
*
*   Uso comum: cookies, local storage, qualquer modelo chave-valor
*
*   Principais implementaçoes:
*       HashMap: mais rapipo (operações O(1) em tabela hash) e não ordenado
*       TreeMap: mais lento (operaçoes O (Log(n)) em arvore rubro-negra) e ordenado pelo CompareTo do objeto (ou comparator)
*       LinkedHashMap:  Velocidade intermediaria e elementos na ordem que esão adcicionados
*
*    Alguns metodos importantes:
*       -Put(key, value), remove(key), containsKey(key), get(key)
*           baseado em equals e hashcode
*       -clear()
*       -size()
*       -keySet - retorna um Set<K>
        -values() - retorna um Collection<V>
*
* */

import java.util.Map;
import java.util.TreeMap;

public class Program1 {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username","maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","231213");

        cookies.remove("email");
        cookies.put("phone","2312134");

        System.out.println("Existe a chave 'phone': " + cookies.containsKey("username"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("All cookies: ");

        for (String key :
                cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
            
        }


    }
}
