package org.example;

import org.example.SapXepInterface;

public class SapXepChen implements SapXepInterface {

    @Override
    public void sapXepTang(int[] arr) {
        int n = arr.length;
        int key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepGiam(int[] arr) {
        int n = arr.length;
        int key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}