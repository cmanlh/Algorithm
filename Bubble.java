import keepLearning.algorithm.ISort;

public class Bubble implements ISort {

	@Override
	public int[] sort(int[] target, boolean asc) {
		boolean haveSwap = false;
		int length = target.length;

		if (asc) {
			do {
				haveSwap = false;

				for (int i = 1; i < length; i++) {
					if (target[i - 1] > target[i]) {
						int tmp = target[i - 1];
						target[i - 1] = target[i];
						target[i] = tmp;

						haveSwap = true;
					}
				}
			} while (haveSwap);
		} else {
			do {
				haveSwap = false;

				for (int i = 1; i < length; i++) {
					if (target[i - 1] < target[i]) {
						int tmp = target[i - 1];
						target[i - 1] = target[i];
						target[i] = tmp;

						haveSwap = true;
					}
				}
			} while (haveSwap);
		}

		return target;
	}
}
