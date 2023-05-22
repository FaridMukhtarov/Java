package lesson41_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    public static Map<Integer, String> mapYarad(){

        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Farid, Mukhtarov");
        sinifMap.put(102, "Ayaz, Niyamov");
        sinifMap.put(103, "Gulnar, Haciyeva");
        sinifMap.put(104, "Natiq, Qasimov");
        sinifMap.put(105, "Seyde, Kirova");
        return sinifMap;
    }


}
