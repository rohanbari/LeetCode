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

import java.util.Arrays;

/**
 * 452. Minimum Number of Arrows to Burst Balloons
 */
public class MinArrowsBalloonBurst {

    /**
     * Returns the minimum number of arrows that must be shot to burst all
     * balloons.
     *
     * @param points Coordinates in XY-plane
     * @return Minimum number of arrows
     */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int counter = 1;
        int begin = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= begin) {
                continue;
            } else {
                counter++;
                begin = points[i][1];
            }
        }

        return counter;
    }
}
