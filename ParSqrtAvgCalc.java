import java.util.concurrent.ThreadLocalRandom;


public class ParSqrtAvgCalc {
    public static void main(String[] args) {
	final int LOW = 100;
	final int HIGH = 600;
	final int NUMTHREADS = 10; //modify this to change the number of lists


	for (int i = 0; i < NUMTHREADS; i++) {
	    int left = ThreadLocalRandom.current().nextInt(0, LOW);
	    int right = ThreadLocalRandom.current().nextInt(LOW+1, HIGH);
	    String label = "rt_" + i;

	    //the range is [left, right]; note that 0<LOW<left<right<HIGH
	    //this thread should average the numbers {sqrt(left), sqrt(left+1), ... sqrt(right)}
	    RThread rt = new RThread(label, left, right);
	}

    }
}

