
package Java_API_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_API_Stream {

    public static void main(String[] args) {
        
        // Map
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
 
        List<Integer> listOfIntegers = listOfStrings.stream()   // primeiro splita tudo da lista (Split)
                .map(Integer::valueOf)                          // converte os valores para Integer num novo array/objeto (Apply + Combine)
                .collect(Collectors.toList());                  // converte objeto (que esta no tipo Stream) para um objeto do tipo List (parte de collections)

        System.out.println(listOfIntegers); 
        System.out.println(listOfIntegers.stream().mapToInt(x -> x * x).average()   );
        //System.out.println(Arrays.stream(listOfIntegers.toArray()).average().orElse(Double.NaN));
        //listOfStrings.forEach(s -> System.out.println("S: " + s ));
        
        System.out.println( listOfIntegers.stream().mapToInt(Integer::intValue).summaryStatistics());
        
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 1);
        m.put("B", 2); 
        m.put("C", 4);
        // First, compute average
        double average = m.values().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        // Then, find entry closest to average
        Map.Entry<String, Integer> e = m.entrySet().stream()
                .min(Comparator.comparing(a -> Math.abs(a.getValue() - average)))
                .orElse(null); 

    }
    
}
