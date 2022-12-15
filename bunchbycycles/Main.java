package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
	  CountsByUsage counts = new CountsByUsage();
	 for(int i=0;i<cycles.length;i++)
	 {
		 if(cycles[i]<310)
			 counts.lowCount++;
		 if(cycles[i]>309&&cycles[i]<930)
			 counts.mediumCount++;
		 if(cycles[i]>=930)
			 counts.highCount++;
	 }
   
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println(" Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    System.out.println(" Low cycles:"+counts.lowCount);
    System.out.println("\n Medium cycles:"+counts.mediumCount);
    System.out.println("\n High cycles:"+counts.highCount);
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("\n Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
