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

package org.rohanbari.code.March;

/**
 * 475. Heaters
 */
class Heaters {

    /**
     * Finds the minimum radius required to cover all houses to get heated.
     * 
     * @param houses  An array of houses
     * @param heaters An array of heaters
     * @return Minimum radius
     */
    public int findRadius(int[] houses, int[] heaters) {
        int radius = Integer.MIN_VALUE;

        for (int i = 0; i < houses.length; i++) {
            int minHouse = Integer.MAX_VALUE;

            for (int j = 0; j < heaters.length; j++)
                minHouse = Math.min(Math.abs(heaters[j] - houses[i]), minHouse);

            if (minHouse > radius)
                radius = minHouse;
        }

        return radius;
    }
}
