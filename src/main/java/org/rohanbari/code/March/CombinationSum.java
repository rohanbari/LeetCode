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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 */
class CombinationSum {

    /**
     * Finds all the unique combination that sums to target.
     * 
     * @param candidates The array
     * @param target     The required value to obtain
     * @return Unique combinations
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain < 0)
            return;
        if (remain == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(list, temp, candidates, remain - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}
