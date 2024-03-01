package org.rohanbari.code.March;

/**
 * 2864. Maximum Odd Binary Number
 */
class MaxOddBinaryNumber {

    /**
     * Manipulates the string such that the returning string contains an odd
     * number binary with maximum possible value.
     * 
     * @param s The original binary string
     * @return The max odd-binary
     */
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();

        int ones = s.split("1", -1).length - 1;
        int zero = s.split("0", -1).length - 1;

        for (int i = 0; i < ones - 1; i++)
            sb.append("1");
        for (int i = 0; i < zero; i++)
            sb.append("0");

        sb.append("1");

        return sb.toString();
    }
}
