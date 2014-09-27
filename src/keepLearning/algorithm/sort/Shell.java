package keepLearning.algorithm.sort;

import keepLearning.algorithm.ISort;

public class Shell implements ISort {

	@Override
	public int[] sort(int[] target, boolean asc) {
		int length = target.length;
		int gap = length / 2;

		if (asc) {
			do {
				for (int i = 0; (i + gap) < length; i++) {
					int tmp = target[i + gap];
					if (target[i] > tmp) {
						target[i + gap] = target[i];
						target[i] = tmp;
					}
				}

				gap /= 2;
			} while (gap > 1);

			new Insertion().sort(target, asc);
		} else {
			do {
				for (int i = 0; (i + gap) < length; i++) {
					int tmp = target[i + gap];
					if (target[i] < tmp) {
						target[i + gap] = target[i];
						target[i] = tmp;
					}
				}

				gap /= 2;
			} while (gap > 1);

			new Insertion().sort(target, asc);
		}

		return target;
	}
}
