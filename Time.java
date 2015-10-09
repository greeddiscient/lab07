public class Time {

    private int myHours;
    private int myMinutes;
    
    public Time (String s) {
    	try {
    		int k=s.indexOf(":");
    		if ((k==-1) || (Integer.parseInt(s.substring(0,k))>=24) || (Integer.parseInt(s.substring(k+1))>=60)  ){
    			throw new IllegalArgumentException("no :");
    		}
    		
    		
    		
    		
    		
    		else{
        		int colonPos = s.indexOf (":");
        		myHours = Integer.parseInt (s.substring (0, colonPos));
        		myMinutes = Integer.parseInt (s.substring (colonPos+1));
    		}
    	}
    	catch(IllegalArgumentException e){
    		System.out.println(e.getMessage());
    	}
    	catch(NullPointerException e){
    		System.out.println("null argument");
    	}
    }
    public static void main(String[] args){
    	Time t = new Time("100");
    	Time s= new Time(null);
    	String a= new String("aa:");
    	System.out.println(a.indexOf(":"));
    	System.out.println(a.substring(a.indexOf(":")+1));
    }
    
    public Time (int hours, int minutes) {
        myHours = hours;
        myMinutes = minutes;
    }

    public boolean equals (Object obj) {
        Time t = (Time) obj;
        return myHours == t.myHours && myMinutes == t.myMinutes;
    }

    public String toString() {
        if (myMinutes < 10) {
            return myHours + ":0" + myMinutes;
        } else {
            return myHours + ":" + myMinutes;
        }
    }
}
