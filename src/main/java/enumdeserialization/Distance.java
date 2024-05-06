package enumdeserialization;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Distance {
	
	KILOMETER("km", 1000),  
    METER("meters", 1),   
    MILLIMETER("mm", 0.001),   
    INCH("inches", 0.0254),  
    CENTIMETER("cm", 0.01),   
    MILE("miles", 1609.34),  
    UNKNOWN("unkown", 0);  
      
    // instance variable  
    public String unit;  
    public final double meters;  
      
    //parameterized constructor  
    private Distance(String unit, double meters) {  
        this.unit = unit;  
        this.meters = meters;  
    }  
    // define the forValues() factory method with the @JsonCreator annotation  
    @JsonCreator  
        public static Distance forValues(@JsonProperty("unit1") String unit, @JsonProperty("meters") double meters) {  
        // iterate values of distance  
        for (Distance distance : Distance.values()) {  
            //condition to compare unit and meters  
                    if (distance.unit.equals(unit) && Double.compare(distance.meters, meters) == 0) {  
                        //return distance if condition match 
                    	System.out.println(distance);
                        return distance;
                    }  
            }  
            return null;  
        }  
    // getter method annotated with @

}
