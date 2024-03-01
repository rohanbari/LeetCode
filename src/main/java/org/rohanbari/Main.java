/*
 Copyright 2024 Rohan Bari <rohanbari@outlook.com>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.rohanbari;

import java.util.HashMap;

/**
 * This file is dedicated to the problem I am currently working on.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args System arguments
     */
    public static void main(String[] args) {
        System.out.println("Latest solved: 15");
    }

    class UnionFind {

        public int[] factor;
        public int[] size;

        public UnionFind(int n) {
            factor = new int[n];
            size = new int[n];
            
            for (int i = 0; i < n; i++) {
                factor[i] = i;
                size[i] = 1;
            }
        }

        public int getFactor(int i) {
            return i == factor[i] ? i : (factor[i] = getFactor(factor[i]));
        }

        public void merge(int i, int j) {
            int a = getFactor(i);
            int b = getFactor(j);

            if (a == b)
                return;

            if (size[a] > size[b]) {
                size[a] += size[b];
                factor[b] = a;
            } else {
                size[b] += size[a];
                factor[a] = b;
            }
        }
    }

    public boolean canTraverseAllPairs(int[] a) {
        int len = a.length;
        
        UnionFind uf = new UnionFind(len);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            for (int p = 2; p * p <= a[i]; ++p) {
                if (a[i] % p != 0)
                    continue;

                if (map.containsKey(p))
                    uf.merge(map.get(p), i);
                else
                    map.put(p, i);

                while (a[i] % p == 0)
                    a[i] /= p;
            }

            if (a[i] > 1) {
                if (map.containsKey(a[i]))
                    uf.merge(map.get(a[i]), i);
                else
                    map.put(a[i], i);
            }
        }

        return uf.size[uf.getFactor(0)] == len;
    }
}
