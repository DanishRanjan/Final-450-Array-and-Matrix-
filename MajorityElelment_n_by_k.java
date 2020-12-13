import java.util.*;

public class MajorityElelment_n_by_k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		int x = n / k;
		HashMap<Integer, Integer> y = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!y.containsKey(arr[i])) {
				y.put(arr[i], 1);
			} else {
				int count = y.get(arr[i]);
				y.put(arr[i], count + 1);
			}
		}

		for (Map.Entry m : y.entrySet()) {
			Integer temp = (Integer) m.getValue();
			if (temp > x)
				System.out.println(m.getKey());
		}

	}

}
