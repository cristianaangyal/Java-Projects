public class TestBA7 {
    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 1, 5}, 1));
    }

    public static int find(int[] sir, int n) {
        int nr = 0;
        int pozitia = 0;
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] == n) {
                nr++;
                pozitia = i;

            }
        }
        if (nr == 0)
            return -1;
        else
            return pozitia;

    }
}
