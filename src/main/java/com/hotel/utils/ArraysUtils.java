package com.hotel.utils;

public class ArraysUtils {

	private long[] a;
	private int nElems;

	public ArraysUtils(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int findBinaly(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound)
				return nElems;
			else {
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
			}
		}
	}

	public void selectionSort() {
		int out, in, min;
		for (out = 0; out < nElems - 1; out++) {
			min = out;
			for (in = out + 1; in < nElems; in++) {
				if (a[in] < a[min])
					min = in;
				swap(out, min);
			}
		}
	}

	public void bubbleSort() {
		int out, in;
		for (out = nElems - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[in + 1])
					swap(in, in + 1);
			}
		}
	}

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

	public boolean find(long searchKey) {
		int j = 0;
		for (j = 0; j < nElems; j++)
			if (a[j] == searchKey)
				break;
		if (j == nElems)
			return false;
		else
			return true;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value) {
		int j;
		for (j = 0; j < nElems; j++)
			if (value == a[j])
				break;
		if (j == nElems)
			return false;
		else {
			for (int k = j; k < nElems; k++)
				a[k] = a[k + 1];
			nElems--;
			return true;
		}
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}
