package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ZipcodeToCounty {

    public static void main(String[] args) {

        HashMap<Integer, String > zipcodeToCounty = new HashMap<>();

        zipcodeToCounty.put(68106, "douglas county");
        zipcodeToCounty.put(68508, "lancaster county");
        zipcodeToCounty.put(68203, "buffalo county");
        zipcodeToCounty.put(68201, "buffalo county");
        zipcodeToCounty.put(68107, "douglas county");

        Set<Integer> keys = zipcodeToCounty.keySet();
        Collection<String> values = zipcodeToCounty.values();

        Set<Map.Entry<Integer, String >> kvPairs = zipcodeToCounty.entrySet();
        for(Map.Entry<Integer, String> kvPair: kvPairs) {
            if(kvPair.getValue().equals("buffalo county")){
                System.out.println(kvPair.getKey());
            }
        }





//        for(Integer key : keys){
//            System.out.println(key);
//            String county = zipcodeToCounty.get(key);
//            System.out.println(county);
//
//        }

//        System.out.println(zipcodeToCounty);

    }


}
