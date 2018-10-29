import java.util.concurrent.ThreadLocalRandom;


public class ParSqrtAvgCalc {
    public static void main(String[] args)
	{
		final int l_min = 0;
		final int l_max = 50;
		final int h_min = 100;
		final int h_max = 800;
		final int NUMTHREADS = 50; //modify this to change the number of lists


		for (int i = 0; i < NUMTHREADS; i++) {
			int left = ThreadLocalRandom.current().nextInt(l_min, l_max);
			int right = ThreadLocalRandom.current().nextInt(h_min, h_max);
			String label = "rt_" + ((i < 10) ? "0" : "") +  i;

			//the range is [left, right]; note that 0<LOW<left<right<HIGH
			//this thread should average the numbers {sqrt(left), sqrt(left+1), ... sqrt(right)}
			RThread rt = new RThread(label, left, right);
		}
    }
}

