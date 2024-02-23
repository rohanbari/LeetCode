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

package org.rohanbari.code;

class FindTownJudge_997 {
     
     public static int findJudge(int n, int[][] trust) {
          int[] counter = new int[n + 1];

          for (int i = 0; i < trust.length; i++) {
               counter[trust[i][0]]--;
               counter[trust[i][1]]++;
          }

          for (int i = 1; i <= n; i++) {
               if (counter[i] == n - 1)
                    return i;
          }

          return -1;
     }
}
