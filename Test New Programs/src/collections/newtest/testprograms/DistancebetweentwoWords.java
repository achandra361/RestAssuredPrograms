package collections.newtest.testprograms;

public class DistancebetweentwoWords {
	public static double shortestDistance(String document, String word1, String word2) {
	    double shortest = document.length();
	    
	    int index =0;
    	double word1loc =0;
    	double word2loc = 0;
	    for(String word:document.split("[., ]")) {
	    	
	    	if(word.equalsIgnoreCase(word1)) {
	    		word1loc = index + (word.length()/2d);
	    	}
	    	else if(word.equalsIgnoreCase(word2)) {
	    		word2loc = index + (word.length()/2d);
	    	}
	    	
	    	if(word1loc>0 && word2loc>0) {
	    		double current = Math.abs(word1loc-word2loc);
	    		if(current<shortest) {
	    			 shortest = current;
	    		}
	    	}
	    	index = index+word.length()+1;
	    }
	    

	    return shortest;
	  }

	  public static boolean pass() {
	    return  shortestDistance(document, "and", "graphic") == 6d &&
	        shortestDistance(document, "transfer", "it") == 14d &&
	        shortestDistance(document, "Design", "filler" ) == 25d ;
	  }

	  public static void main(String[] args) {
	    if (pass()) {
	      System.out.println("Pass");
	    } else {
	      System.out.println("Some Fail");
	    }
	  }

	  private static final String document;
	  static{
	    StringBuffer sb = new StringBuffer();
	    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
	    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
	    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

	    document = sb.toString();
	  }

}
