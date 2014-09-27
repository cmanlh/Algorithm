package keepLearning.algorithm.sort;

import keepLearning.algorithm.ISort;

public class Insertion implements ISort {

	@Override
	public int[] sort(int[] target, boolean asc) {
		int length = 0;

		if (asc) {
			for (int data : target) {
				length++;

				for (int i = 0; i < length; i++) {
					if (data < target[i]) {
						int headOfMoving = target[i];
						target[i] = data;

						int tmp;
						for (++i; i < length; i++) {
							tmp = target[i];
							target[i] = headOfMoving;
							headOfMoving = tmp;
						}

						break;
					}
				}
			}
		} else {
			for (int data : target) {
				length++;

				for (int i = 0; i < length; i++) {
					if (data > target[i]) {
						int headOfMoving = target[i];
						target[i] = data;

						int tmp;
						for (++i; i < length; i++) {
							tmp = target[i];
							target[i] = headOfMoving;
							headOfMoving = tmp;
						}

						break;
					}
				}
			}

		}

		return target;
	}
}
